<%-- 
    Document   : fornecedores
    Created on : 21/07/2015, 01:12:07
    Author     : LucasCésar
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tp.model.domain.Fornecedor"%>
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

        <%  if(request.getAttribute("msg") != null){ %>
                <div class="alert alert-success text-center" role="alert" style="margin: 10px 50px">Fornecedor alterado com sucesso.</div>
        <%  } %>
        <div style="max-width: 1700px;" class="center-block">
        <%  List<Fornecedor> listaFornecedor = (List<Fornecedor>) request.getAttribute("listaFornecedor");
            for (Fornecedor fornecedor : listaFornecedor) { %>
                <div class="well col-md-12 text-center" style="padding: 20px; margin: 5px; width: 100%; max-width: 300px">
                    <form method="POST" action="alterarFornecedor">
                        <div class="form-group">
                            <label for="id">Cod do fornecedor:</label>
                            <input type="id" class="form-control" id="id" name="id" value="<%= fornecedor.getId() %>" readonly>
                        </div>
                        <div class="form-group">
                            <label for="nome">Nome do fornecedor:</label>
                            <input type="nome" class="form-control" id="nome" name="nome" value="<%= fornecedor.getNome() %>">
                        </div>
                        <div class="form-group">
                            <label for="rs">Razão Social:</label>
                            <input type="rs" class="form-control" id="razaoSocial" name="razaoSocial" value="<%= fornecedor.getRazaoSocial() %>">
                        </div>
                        <input type="submit" value="alterar">
                    </form>
                </div>
        <% }%>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
