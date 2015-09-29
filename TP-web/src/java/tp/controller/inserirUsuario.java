
package tp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp.domain.Usuario;
import tp.service.IManterUsuario;
import tp.model.service.impl.ManterUsuario;
import tp.util.db.exception.NegocioException;
import tp.util.db.exception.PersistenciaException;


public class inserirUsuario extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet inserirUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet inserirUsuario at " + request.getContextPath() + "</h1>");
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
        
        
        Usuario usuario = new Usuario();
        
        usuario.setNome(  request.getParameter("nome"));
        usuario.setCpf(  request.getParameter("cpf"));
        usuario.setSenha(  request.getParameter("senha"));
        usuario.setEmail(  request.getParameter("email"));
        usuario.setSexo(  request.getParameter("sexo"));
        usuario.setDataNasc(  request.getParameter("dataNasc"));
        usuario.setTel(  request.getParameter("tel"));
        usuario.setTipoEndereco(  request.getParameter("tipoEndereco"));
        usuario.setCep(  request.getParameter("cep"));
        usuario.setEndereco(  request.getParameter("endereco"));
        usuario.setNumero( request.getParameter("numero"));
        usuario.setComplemento ( request.getParameter("complemento"));
        usuario.setBairro(  request.getParameter("bairro"));
        usuario.setCidade(  request.getParameter("cidade"));
        usuario.setEstado(  request.getParameter("estado"));
        
        IManterUsuario usuarioService = new ManterUsuario();
        try {
            usuarioService.cadastrar(usuario);
            
        } catch (PersistenciaException ex) {
            request.setAttribute("erro", "Falha no cadastro do usuario."+ "\n"+ex );
            RequestDispatcher dispatcher = request.getRequestDispatcher("erro.jsp");
            dispatcher.forward(request, response);
        } catch (NegocioException ex) {
            request.setAttribute("erro", "Por favor, preencha todos os campos.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("erro.jsp");
            dispatcher.forward(request, response);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("usuarioSucesso.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
