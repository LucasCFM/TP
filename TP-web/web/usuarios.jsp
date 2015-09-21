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
        <title>Usuarios</title>
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
                    <form method="POST" action="alterarUsuario">
                        
                        <input type="hidden" value ="<%= usuario.getId()%>" name="id">
                        <br/><label for="nome">Nome completo</label>
                        <input type="text" class="form-control" id="nome" value="<%= usuario.getNome()%>" name="nome" >
                
                        <br/><label for="cpf">CPF</label>
                        <input type="text" class="form-control" id="cpf" name="cpf" value="<%= usuario.getCpf() %>"  maxlength="11">
                
                        <br/><label for="sex" >Sexo 
                        <select class="form-control" id="sex" name="sexo" >
                            <option>Masculino</option>
                            <option>Feminino</option>
                        </select>
                        </label><br/>

                        <br/><label for="nasc"> Data de nascimento
                        <input type="text" class="form-control" id="nasc" value="<%= usuario.getDataNasc() %>" name="dataNasc" >
                         </label><br/>
                
                        <br/><label for="tel">Telefone</label>
                        <input type="text" class="form-control" id="tel"  value="<%= usuario.getTel() %>" name="tel">

                        <br/><label for="email">Email</label>
                        <input type="text" class="form-control" id="email" maxlength="30" value="<%= usuario.getEmail() %>" name="email">
                        
                        <br/><label for="senha">Senha</label>
                        <input type="password" class="form-control" id="senha" maxlength="25"  name="senha">
                
                        <br/><label for="csenha">Confirmar senha</label>
                        <input type="password" class="form-control" id="csenha"  maxlength="25"  name="senha2">
                
                        
                        <br/>
                        <br/><label for="tipoend">Tipo de endereço
                        <select class="form-control" id="tipoend" name="tipoEndereco">
                            <option>Apartamento</option>
                            <option>Casa</option>
                            <option>Comercial</option>
                        </select>
                        </label><br/>
                
                        <br/><label for="cep">CEP</label>
                        <input type="text" class="form-control" id="cep"  value="<%= usuario.getCep() %>" name="cep">

                        <br/><label for="endereco">Endereço</label>
                        <input type="text" class="form-control" id="endereco"  value="<%= usuario.getEndereco() %>" name="endereco">

                        <br/><label for="num">Número
                        <input type="text" class="form-control" id="num" size ="2" value="<%= usuario.getNumero() %>" name="numero">
                        </label><br/>

                        <br/><label for="complemento">Complemento</label>
                        <input type="text" class="form-control" id="complemento" value="<%= usuario.getComplemento() %>" name="complemento">

                        <br/><label for="bairro">Bairro</label>
                        <input type="text" class="form-control" id="bairro"  value="<%= usuario.getBairro() %>" name="bairro">

                        <br/><label for="cidade">Cidade</label>
                        <input type="text" class="form-control" id="cidade"  value="<%= usuario.getCidade() %>" name="cidade">

                        <br/><label for="estado">Estado</label>
                        <input type="text" class="form-control" id="estado"  value="<%= usuario.getEstado() %>" name="estado">
                        
                        <br><br><input type="submit" value="Alterar">
                       
                        
                        <hr/>
                    </form>
                </div>
        <% }%>
        <h3><a href="index.html">clique aqui para retornar</a></h3>
    </body>
</html>
