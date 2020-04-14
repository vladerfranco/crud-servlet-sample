<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SCL - Sistema de Catálogo de Livros</title>
</head>
<body>
<center>
    <h1>Cadastro de Livros</h1>
    <h2>
        <a href="new">Cadastrar Livro</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list">Listar Livros</a>

    </h2>
</center>
<div align="center">
<c:if test="${book != null}">
    <form action="update" method="post">
</c:if>
<c:if test="${book == null}">
    <form action="insert" method="post">
</c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${book != null}">
                        Editar Livro
                    </c:if>
                    <c:if test="${book == null}">
                        Cadastrar Novo Livro
                    </c:if>
                </h2>
            </caption>
            <c:if test="${book != null}">
                <input type="hidden" name="id" value="<c:out value='${book.id}'/>" />
            </c:if>
            <tr>
                <th>Título do Livro: </th>
                <td>
                    <input type="text" name="title" size="60" value="<c:out value='${book.title}'/>" />
                </td>
            </tr>
            <tr>
                <th>Autor do Livro: </th>
                <td>
                    <input type="text" name="author" size="60" value="<c:out value='${book.author}'/>" />
                </td>
            </tr>
            <tr>
                <th>Resumo do Livro: </th>
                <td>
                    <input type="textarea" name="resume" size="60" value="<c:out value='${book.resume}'/>" />
                </td>
            </tr>
            <tr>
                <th>Ano de Lançamento: </th>
                <td>
                    <input type="text" name="releaseYear" size="4" value="<c:out value='${book.releaseYear}'/>" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Salvar" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>