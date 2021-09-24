<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<html lang="en">
<head>
<meta charset="UTF-8">
</head>
<body>

<c:forEach items="${bookList}" var="book">

    <p>${book.isbn} ${book.title} ${book.author} ${book.publisher} ${book.type} <a href="/books/delete/${book.id}">Usun</a> <a href="/books/update/${book.id}">Edytuj</a>
    <a href="/books/info/${book.id}">Szczegóły</a> </p>



</c:forEach>

<a href="/books/add">Dodaj</a>

</body>

</html>