<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
    <br/><br/>
</h1>

<br/>

<form action="hello-servlet">
    <br/>
    <label for="navn">Skriv dit navn:</label><br>
    <input type="text" id="navn" name="navn" value="Oskar"><br>
    <input type="submit" value="Submit">
</form>

<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>