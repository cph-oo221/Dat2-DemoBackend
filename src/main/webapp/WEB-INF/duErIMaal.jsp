<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 06-03-2023
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>

<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1> ${sessionScope.bruger.navn}, du er i mål, med nummeret ${sessionScope.tal} </h1>
</div>


<div class="text-center mt-5 pt-5 text-bold">
    <form action="logout-servlet">
        <input type="submit" class="btn btn-primary" value="Log Af">
    </form>
</div>


</body>
</html>