package tp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp.domain.Fornecedor;
import tp.service.IManterFornecedor;
import tp.model.service.impl.ManterFornecedor;
import tp.util.db.exception.PersistenciaException;

/**
 *
 * @author LucasCésar
 */
public class listarFornecedores extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listarFonecedores</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listarFonecedores at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        IManterFornecedor fornecedorService = new ManterFornecedor();
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
