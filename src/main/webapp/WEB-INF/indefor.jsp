<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 06-03-2023
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Indefor</title>
</head>
<body>

<h1> Du er nu indefor ${requestScope.mitNavn}</h1>

<form action="min-servlet">

    <input type="submit" value="Submit">
</form>


</body>
</html>