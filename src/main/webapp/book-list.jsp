<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SCL - Sistema de Catálogo de Livros</title>
</head>
<body>
<center>
    <h1>Catálogo de Livros</h1>
    <h2>
        <a href="new">Cadastrar Livro</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list">Listar Livros</a>

    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Lista de Livros</h2></caption>
        <tr>
            <th>Código</th>
            <th>Título</th>
            <th>Autor</th>
            <th>Ano de Lanç.</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="book" items="${listBook}">
            <tr>
                <td><c:out value="${book.id}" /></td>
                <td><c:out value="${book.title}" /></td>
                <td><c:out value="${book.author}" /></td>
                <td><c:out value="${book.releaseYear}" /></td>
                <td>
                    <a href="edit?id=<c:out value='${book.id}' />">Editar</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="delete?id=<c:out value='${book.id}' />">Deletar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
