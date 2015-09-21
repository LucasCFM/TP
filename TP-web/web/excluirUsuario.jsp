<%-- 
    Document   : usuarios
    Created on : 21/07/2015, 01:50:09
    Author     : pernambucanas
--%>

<%@page import="java.util.List"%>
<%@page import="tp.model.domain.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletar Usuarios</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <%  if(request.getAttribute("msg") != null){ %>
            Usuario alterado com sucesso.
        <%  } %>
        
        <%  List<Usuario> listaUsuario = (List<Usuario>) request.getAttribute("listaUsuario");
            for (Usuario usuario : listaUsuario) { %>
                
                <div class="well" style="margin: 3% 30%" >
                    <h3>Usuario <%= usuario.getId()%></h3>
                    <form method="POST" action="deletarUsuario">
                        
                        <input type="hidden" value ="<%= usuario.getId()%>" name="id">
                        <br/><label for="nome" >Nome completo: <%= usuario.getId()%></label>
                        
                
                        <br/><label for="email">Email: <%= usuario.getEmail()%> </label>
                        
                        <br><br><input type="submit" value="Excluir">
                       
                        
                        <hr/>
                    </form>
                </div>
        <% }%>
        <h3><a href="index.html">clique aqui para retornar</a></h3>
    </body>
</html>
