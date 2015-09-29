/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp.domain.Fornecedor;
import tp.service.IManterFornecedor;
import tp.model.service.impl.ManterFornecedor;
import tp.util.db.exception.NegocioException;
import tp.util.db.exception.PersistenciaException;

/**
 *
 * @author LucasCésar
 */
public class alterarFornecedor extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet alterarFornecedor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet alterarFornecedor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setId( Long.valueOf(request.getParameter("id")) );
        fornecedor.setNome( (String) request.getParameter("nome"));
        fornecedor.setRazaoSocial( (String) request.getParameter("razaoSocial"));
        
        IManterFornecedor fornecedorService = new ManterFornecedor();
        try {
            fornecedorService.alterar(fornecedor);
        } catch (PersistenciaException ex) {
            request.setAttribute("erro", "Falha na alteração do fornecedor.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("erro.jsp");
            dispatcher.forward(request, response);
        } catch (NegocioException ex) {
            request.setAttribute("erro", "Por favor, preencha todos os campos.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("erro.jsp");
            dispatcher.forward(request, response);
        }
        
        request.setAttribute("msg", "Fornecedor alterado.");
        
        List<Fornecedor> listaFornecedor = new ArrayList<>();
        
        try {
            listaFornecedor = fornecedorService.listarTodos();
        } catch (PersistenciaException ex) {
            request.setAttribute("erro", "Falha ao listar fornecedores.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("erro.jsp");
            dispatcher.forward(request, response);
        }
        
        request.setAttribute("listaFornecedor", listaFornecedor);
        RequestDispatcher dispatcher = request.getRequestDispatcher("fornecedores.jsp");
        dispatcher.forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
