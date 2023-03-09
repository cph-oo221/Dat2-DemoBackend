<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 09-03-2023
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emne oversigt</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>
<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>${sessionScope.bruger.navn}, du er på admins oversigt af emner</h1>
</div>

<div class="row text-center">
    <div class="col">
        <div class="mt-3">
            <form action="RedirectTilMinSide">
                <input type="submit" class="btn btn-primary mt-2" value="Min side">
            </form>
        </div>
    </div>
</div>

<p>${requestScope.msgAdmin}</p>
<p>${sessionScope.id}</p>

<div class="text-center mt-2 mb-2">
    <h3> Liste af alle emner: </h3>
</div>


<style>
    table
    {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th
    {
        /*border: 1px solid #dddddd;*/
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even)
    {
        background-color: #dddddd;
    }
</style>

<table class="table table-dark table-striped">
    <tr>
        <th>Emner: </th>
    </tr>

    <c:forEach var="emner" items="${applicationScope.emneList}">
        <tr>
            <td>${emner}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>