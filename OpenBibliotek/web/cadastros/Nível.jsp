<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-BR">
    <head>
        <meta charset="utf-8" /> 
        <title>OpenBibliotek - Cadastro de Níveis de Acesso</title>
        <link href="../css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Cadastro de Níveis de Acesso</h1>
            <div class="formContainer">
                <form id="fNivel" method="post" action="controlador?acao=salvar">
                    <input type="hidden" name="acao" value="salvar" />
                    <input type="hidden" name="id" value="${nivel.id}" />
                    <div class="linha">
                        <div class="label">
                            <label for="nomeNivel">Nome: </label>
                        </div>
                        <div class="field">
                            <input type="text" id="nomeNivel" name="nomeNivel" size="40" value="${nivel.nome}" placeholder="Digite o nome do nível" />
                        </div>
                    </div>    
                    <div class="linha">
                        <div class="label">
                            <label for="descricaoNivel">Descrição: </label>
                        </div>
                        <div class="input">
                            <input type="text" id="descricaoNivel" name="descricaoNivel" size="60" value="${nivel.descricao}" placeholder="Digite a descrição do nível" />
                        </div>
                    </div>
                    <div class="linha">
                        <div class="botao">
                            <input type="button" id="btLimpar" class="btnLimpar" name="limpar" value="Limpar" />
                            <input type="button" id="btSalvar" class="btSalvar" name="salvar" value="Salvar" />
                        </div>
                    </div>
                </form>
            </div>
            <h2>Lista de Níveis</h2>
            <div class="tableContainer">
                <table>
                    <thead>
                        <tr>
                            <td>Código</td>
                            <td>Nome</td>
                            <td>Descrição</td>
                            <td>Opções</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lista}" var="obj">
                            <tr>
                                <td>${obj.id}</td>
                                <td>${obj.nome}</td>
                                <td>${obj.descricao}</td>
                                <td>
                                    <a href="controlador?acao=alterar&id=${obj.id}" class="btnAlterar">Alterar</a>
                                    <a href="controlador?acao=excluir&id=${obj.id}" class="btnExcluir">Excluir</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <jsp:include page="../includes/foot.jsp" />
    </body>
</html>
