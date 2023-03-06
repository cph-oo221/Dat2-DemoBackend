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

<p>Det er mandag morgen stadig!</p>

<br/>
<a href="https://www.dr.dk">Hello Servlet</a>

<form action="hello-servlet">
    <br/>
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname" value="John"><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Doe"><br><br>

    <input type="submit" value="Submit">
</form>

<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>