<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-BR">
    <head>
        <meta charset="utf-8" /> 
        <title>OpenBibliotek - Cadastro de Estados</title>
        <link href="../css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Cadastro de Estados</h1>
            <div class="formContainer">
                <form id="fEstado" method="post" action="controlador?acao=salvar">
                    <input type="hidden" name="acao" value="salvar" />
                    <input type="hidden" name="id" value="${estado.id}" />
                    <div class="linha">
                        <div class="label">
                            <label for="nome">Nome: </label>
                        </div>
                        <div class="field">
                            <input type="text" id="nome" name="nome" size="40" value="${estado.nome}" placeholder="Digite o nome do estado" />
                        </div>
                    </div>    
                    <div class="linha">
                        <div class="label">
                            <label for="sigla">Sigla: </label>
                        </div>
                        <div class="field">
                            <input type="text" id="siglaEstado" name="sigla" size="15" value="${estado.sigla}" placeholder="Digite o UF" />
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
            <h2>Lista de Estados</h2>
            <div class="tableContainer"> 
                <table>
                    <thead>
                        <tr>
                            <td>Código</td>
                            <td>Nome</td>
                            <td>Sigla</td>
                            <td>Opções</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lista}" var="obj">
                            <tr>
                                <td>${obj.id}</td>
                                <td>${obj.nome}</td>
                                <td>${obj.sigla}</td>
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
