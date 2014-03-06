<%@page import="br.edu.utfpr.cm.tsi.openbibliotek.entidades.Classificacao"%>
<%@page import="br.edu.utfpr.cm.tsi.openbibliotek.entidades.Tipo"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-BR">
    <head>
        <meta charset="utf-8" /> 
        <title>OpenBibliotek - Cadastro de Material Multimídia</title>
        <link href="../css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Cadastro de Material Multimídia</h1>
            <div class="formContainer">
                <form id="fCidade" method="post" action="controlador?acao=salvar">
                    <input type="hidden" name="acao" value="salvar" />
                    <input type="hidden" name="id" value="${multimidia.id}" />
                    <div class="linha">
                        <div class="label">
                            <label for="tipo">Tipo: </label>
                        </div>
                        <div class="field">
                            <c:set var="tipoValues" value="<%=Tipo.values()%>"/>
                            <select id="sexo" name="tipo">
                                <option value=""></option>
                                <c:forEach items="${tipoValues}" var="tipo">
                                    <option value="${tipo}">${tipo.toString()}</option>
                                </c:forEach>
                            </select>   
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="titulo">Título: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="titulo" name="titulo" size="60" value="${multimidia.titulo}" placeholder="Digite o título" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="genero">Genêro: </label>
                            </div>
                            <div class="field">
                                <select id="genero" name="genero">
                                    <option value="">Selecione um Genêro</option>
                                    <c:forEach items="${genero}" var="e">
                                        <option ${e.id eq multimidia.genero.id ? "selected='selected'" : ""} value="${e.id}">${e.nome}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="duracao">Duração: </label>
                            </div>
                            <div class="field">
                                <input type="time" id="duracao" name="duracao" size="30" value="${multimidia.duracao}" placeholder="Digite a duracao" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="ano">Ano: </label>
                            </div>
                            <div class="field">
                                <input type="number" id="ano" name="ano" size="30" value="${multimidia.ano}" placeholder="Digite o ano" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="classificacao">Classificação: </label>
                            </div>
                            <div class="field">
                                <c:set var="classificacaoValues" value="<%=Classificacao.values()%>"/>
                                <select id="classificacao" name="classificacao">
                                    <option value=""></option>
                                    <c:forEach items="${classificacaoValues}" var="classificacao">
                                        <option value="${classificacao}">${classificacao.toString()}</option>
                                    </c:forEach>
                                </select>   
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="estante">Estante: </label>
                            </div>
                            <div class="field">
                                <select id="estante" name="estante">
                                    <option value="">Selecione uma estante</option>
                                    <c:forEach items="${estante}" var="t">
                                        <option ${t.id eq multimidia.estante.id ? "selected='selected'" : ""} value="${t.id}">${t.sequencia}</option>
                                    </c:forEach>
                                </select>                                       
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="quantidade">Quantidade: </label>
                            </div>
                            <div class="field">
                                <input type="number" id="quantidade" name="quantidade" size="30" value="${multimidia.quantidade}" placeholder="Digite a quantidade" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="palavrasChaves">Palavras-chave: </label>
                            </div>
                            <div class="field">
                                <input type="number" id="palavrasChaves" name="palavrasChaves" size="30" value="${multimidia.palavrasChave}" placeholder="Digite as palavras-chave" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="numChamada">Número da Chamada: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="numChamada" name="numChamada" size="35" value="${multimidia.exemplar.numChamada}" placeholder="Digite o numero da chamda" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="disponivel">Disponível? </label>
                            </div>
                            <div class="field">
                                <input type="radio" id="sim" name="disponivel" value="SIM" />Sim
                                <input type="radio" id="nao" name="disponivel" value="NAO" />Não
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <jsp:include page="../includes/foot.jsp" />
    </body>
</html>
