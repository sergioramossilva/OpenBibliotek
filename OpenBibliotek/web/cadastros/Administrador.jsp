<%@page import="br.edu.utfpr.cm.tsi.openbibliotek.entidades.Sexo"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-BR">
    <head>
        <meta charset="utf-8" /> 
        <title>OpenBibliotek - Cadastro de Administradores</title>
        <link href="../css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Cadastro de Administradores</h1>
            <div class="formContainer">
                <form id="fAdministrador" method="post" action="controlador?acao=salvar">
                    <input type="hidden" name="acao" value="salvar" />
                    <input type="hidden" name="id" value="${administrador.id}" />
                    <fieldset>
                        <div class="linha">
                            <div class="label">
                                <label for="nome">Nome: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="nome" name="nome" size="60" value="${administrador.pessoa.nome}" placeholder="Digite o nome" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="cpf">CPF: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="cpf" name="cpf" size="50" value="${administrador.pessoa.cpf}" placeholder="Digite o número do CPF" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="rg">RG: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="rg" name="rg" size="50" value="${administrador.pessoa.rg}" placeholder="Digite o o número do RG" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="dtNascimento">Data de Nascimento: </label>
                            </div>
                            <div class="field">
                                <input type="date" id="dtNascimento" name="dtNascimento" size="50" value="${administrador.pessoa.dtNascimento}" placeholder="Digite a data de Nascimento" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="sexo">Sexo: </label>
                            </div>
                            <div class="field">
                                <c:set var="sexoValues" value="<%=Sexo.values()%>"/>
                                <select id="sexo" name="sexo">
                                    <option value=""></option>
                                    <c:forEach items="${sexoValues}" var="sexo">
                                        <option value="${sexo}">${sexo.toString()}</option>
                                    </c:forEach>
                                </select>                  
                            </div>
                        </div>
                    </fieldset>
                    <fieldset>
                        <div class="linha">
                            <div class="label">
                                <label for="logradouro">Logradouro: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="logradouro" name="logradouro" size="60" value="${administrador.pessoa.endereco.logradouro}" placeholder="Digite o logradouro" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="bairro">Bairro: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="bairro" name="bairro" size="50" value="${administrador.pessoa.endereco.bairro}" placeholder="Digite o bairro" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="complemento">Complemento: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="complemento" name="complemento" size="40" value="${administrador.pessoa.endereco.complemento}" placeholder="Digite o complemento" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="estado">Estado: </label>
                            </div>
                            <div class="field">
                             <select id="estado" name="estado">
                                <option value="">Selecione um Estado</option>
                                <c:forEach items="${estados}" var="e">
                                    <option ${e.id eq administrador.pessoa.endereco.estado.id ? "selected='selected'" : ""} value="${e.id}">${e.nome}</option>
                                </c:forEach>
                            </select>
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="cidade">Cidade: </label>
                            </div>
                            <div class="field">
                                <select id="cidade" name="cidade">
                                    <option value="">Selecione uma cidade</option>
                                    <c:forEach items="${cidades}" var="c">
                                        <option ${c.id eq administrador.pessoa.endereco.cidade.id ? "selected='selected'" : ""} value="${c.id}">${c.nome}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="cep">CEP: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="cep" name="cep" size="40" value="${administrador.pessoa.endereco.cep}" placeholder="Digite o CEP" />
                            </div>
                        </div>
                    </fieldset>
                    <fieldset>
                        <div class="linha">
                            <div class="label">
                                <label for="telefone1">Telefone: </label>
                            </div>
                            <div class="field">
                                <input type="tel" id="telefone1" name="telefone1" size="40" value="${administrador.pessoa.tefefone.numero}" placeholder="Digite o telefone" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="telefone2">Telefone: </label>
                            </div>
                            <div class="field">
                                <input type="tel" id="telefone2" name="telefone2" size="40" value="${administrador.pessoa.tefefone.numero}" placeholder="Digite o telefone" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="email">E-mail: </label>
                            </div>
                            <div class="field">
                                <input type="email" id="email" name="email" size="40" value="${administrador.pessoa.email}" placeholder="Digite o email" />
                            </div>
                        </div>
                    </fieldset>
                    <fieldset>
                        <div class="linha">
                            <div class="label">
                                <label for="matricula">Matrícula: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="matricula" name="matricula" size="30" value="${administrador.conta.matricula}" placeholder="Digite a matrícula do administrador" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="senha">Senha: </label>
                            </div>
                            <div class="field">
                                <input type="text" id="senha" name="senha" size="30" value="${administrador.conta.senha}" placeholder="Digite a senha do adminsitrador" />
                            </div>
                        </div>
                        <div class="linha">
                            <div class="label">
                                <label for="bloqueado">Bloquear? </label>
                            </div>
                            <div class="field">
                                <input type="radio" id="sim" name="bloqueado" value="SIM" />Sim
                                <input type="radio" id="nao" name="bloqueado" value="NAO" />Não
                            </div>
                        </div>
                    </fieldset>
                    <div class="linha">
                        <div class="botao">
                            <input type="button" id="btLimpar" class="btnLimpar" name="limpar" value="Limpar" />
                            <input type="button" id="btSalvar" class="btSalvar" name="salvar" value="Salvar" />
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <jsp:include page="../includes/foot.jsp" />
    </body>
</html>
