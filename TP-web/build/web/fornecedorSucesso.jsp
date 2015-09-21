<%-- 
    Document   : fornecedorSucesso
    Created on : 21/07/2015, 00:22:44
    Author     : LucasCésar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-default navbar-static-top" style="width: 100%; margin: 0px">
            <div class="container-fluid">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="index.html" class="navbar-brand text-center" style="padding-left: 50px">TP</a>

                </div>
                <div class="collapse navbar-collapse pull-right" id="bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.html"> Home <span class="sr-only">(current)</span></a></li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        
        <div class="well text-center" style="margin: 3% 30%; width: 100%; min-width: 350px; max-width: 600px; min-height: 110px; max-height: 110px">
            <p class="text-center">Fornecedor cadastrado com sucesso.</p>
            <div>
            <button type="button" class="btn btn-default pull-left" onclick=" window.location='cadastrarFornecedor.jsp' ">Cadastrar novo fornecedor</button>
            <form method="POST" action="listarFornecedores" class="pull-right">
                <input type="submit" class="btn btn-default btn-block" value="Listar/Alterar Fornecedores">
            </form>
            </div>
        </div>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
