<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 07-03-2023
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>Register a new user</h1>
</div>

${requestScope.errorPassword}
${requestScope.errorUsername}



<div class="text-center mt-3">
    <form action="OpretUserServlet">
        <br/>
        <label for="navn"> <b> Indtast et username: </b> </label><br>
        <input type="text" id="navn" name="navn" placeholder="Username"><br>

        <label for="password"> <b> Indtast en kode: </b> </label><br>
        <input type="password" id="password" name="password" placeholder="Password"><br>
        <br/>

        <input type="submit" class="btn btn-primary" value="Enter">
    </form>
</div>

</body>
</html>
