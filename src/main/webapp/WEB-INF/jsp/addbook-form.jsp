<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>



<form:form method="post" modelAttribute="book">
    <label>isbn:</label><br>
    <form:input path="isbn"/> <p><form:errors path="isbn" /></p>
    <label>title:</label><br>
    <form:input path="title"/><p><form:errors path="title"/></p>
    <label>author:</label><br>
    <form:input path="author"/><p><form:errors path="author"/></p>
    <label>publisher:</label><br>
    <form:input path="publisher"/><p><form:errors path="publisher"/></p>
    <label>type:</label><br>
    <form:input path="type"/><p><form:errors path="type"/></p>

    <input type="submit" value="wyslij">
    <p></p>

</form:form>

<a href="/books/getall">Lista Książek</a>


</body>




</html>