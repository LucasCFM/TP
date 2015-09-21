<%-- 
    Document   : LoginUsuario
    Created on : 20/07/2015, 19:28:21
    Author     : pernambucanas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>Login</title>
    </head>
    <body> 
        <div class="well" style="margin: 3% 30%">
        <form action="logarUsuario" method="post">
            <div class="form-group">
            <label for="email">Email</label>
            <input type="text" class="form-control" id="email" >
            </div>
            <div class="form-group">
            <label for="email">Senha</label>
            <input type="password" class="form-control" id="senha" >
            </div>
            
        <div class="text-center"><button type="submit" class="btn btn-default">Entrar</button></div>
        </form>
        </div>

        
        
    </body>
</html>
