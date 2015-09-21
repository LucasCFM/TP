<%@page import="tp.model.domain.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!Arquivo de formatação CSS utilizado>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script type="text/javascript" language="JavaScript" src="js/webvalida.js"></script>
        <title> Cadastro </title>
    </head>
    <body>
       
        <div class="well" style="margin: 3% 30%">
            <h3>Dados cadastrais</h3>
            <form method="post" name="fCadastroUsuario" action="inserirUsuario">
                
                <br/><label for="nome">Nome completo</label>
                <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome completo">
                
                <br/><label for="cpf">CPF</label>
                <input type="text" class="form-control" id="cpf" name="cpf" placeholder="CPF" maxlength="11">
                
                <br/><label for="sex" >Sexo 
                <select class="form-control" id="sex" name="sexo" >
                    <option>Masculino</option>
                    <option>Feminino</option>
                </select>
                </label><br/>
                
                <br/><label for="nasc"> Data de nascimento
                <input type="text" class="form-control" id="nasc"  name="dataNasc" placeholder="dd/mm/aaaa">
                 </label><br/>
                
                <br/><label for="tel">Telefone</label>
                <input type="text" class="form-control" id="tel" placeholder="Telefone"  name="tel">
                
                <br/><label for="email">Email</label>
                <input type="email" class="form-control" id="email" placeholder="Email" maxlength="30" name="email">
                
                <br/><label for="senha">Senha</label>
                <input type="password" class="form-control" id="senha" placeholder="Senha" maxlength="25" name="senha">
                
                <br/><label for="csenha">Confirmar senha</label>
                <input type="password" class="form-control" id="csenha" placeholder="Confirmar Senha" maxlength="25"  name="senha2">
                
                <br/>
                <h3>Endereço de entrega</h3>
                
                <br/><label for="tipoend">Tipo de endereço
                <select class="form-control" id="tipoend" name="tipoEndereco">
                    <option value="Apartamento">Apartamento</option>
                    <option value="Casa">Casa</option>
                    <option value="Comercial">Comercial</option>
                </select>
                </label><br/>
                
                <br/><label for="cep">CEP</label>
                <input type="text" class="form-control" id="cep" placeholder="CEP"  name="cep">
                
                <br/><label for="endereco">Endereço</label>
                <input type="text" class="form-control" id="endereco" placeholder="Endereço"  name="endereco">
                
                <br/><label for="num">Número
                <input type="text" class="form-control" id="num" size ="2"  name="numero">
                </label><br/>
                
                <br/><label for="complemento">Complemento</label>
                <input type="text" class="form-control" id="complemento" placeholder="Complemento" name="complemento">
                
                <br/><label for="bairro">Bairro</label>
                <input type="text" class="form-control" id="bairro" placeholder="Bairro"  name="bairro">
                
                <br/><label for="cidade">Cidade</label>
                <input type="text" class="form-control" id="cidade" placeholder="Cidade"  name="cidade">
                
                <br/><label for="estado">Estado</label>
                <input type="text" class="form-control" id="estado" placeholder="Estado"  name="estado">
                
                <br/>
                <br/><input type="submit" value="Efetuar Cadastro"> 
                <br/><br/><a href="index.html">clique aqui para retornar</a> 
            </form>
        </div>
         
        
        
        
        
    </body>
</html>
