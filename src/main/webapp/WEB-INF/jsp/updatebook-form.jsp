<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>

<head>
    <meta charset="UTF-8">
</head>

<body>

<form:form method="post" modelAttribute="book">

    <label>isbn:</label><br>
    <form:input path="isbn"/> <form:errors path="isbn"/> <br>
    <label>title:</label><br>
    <form:input path="title"/><form:errors path="title"/><br>
    <label>author:</label><br>
    <form:input path="author"/><form:errors path="author"/><br>
    <label>publisher:</label><br>
    <form:input path="publisher"/><form:errors path="publisher"/><br>
    <label>type:</label><br>
    <form:input path="type"/><form:errors path="type"/><br>

    <input type="submit" value="wyslij"/>


</form:form>

<a href="/books/getall">Lista Książek</a>



</body>

</html>