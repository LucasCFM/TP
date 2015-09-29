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
import tp.domain.Usuario;
import tp.service.IManterUsuario;
import tp.model.service.impl.ManterUsuario;
import tp.util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public class listarTodosUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listarTodosUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listarTodosUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        IManterUsuario usuarioService = new ManterUsuario();
        List<Usuario> listaUsuario = new ArrayList<>();
        
        try {
            listaUsuario = usuarioService.listarTodos();
        } catch (PersistenciaException ex) {
            request.setAttribute("erro", "Falha ao listar usuario."+ "\n"+ex);
            RequestDispatcher dispatcher = request.getRequestDispatcher("erro.jsp");
            dispatcher.forward(request, response);
        }
        
        request.setAttribute("listaUsuario", listaUsuario);
        RequestDispatcher dispatcher = request.getRequestDispatcher("usuarios.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
