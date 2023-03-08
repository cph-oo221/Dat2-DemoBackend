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
    <title> ${sessionScope.bruger.navn}'s side</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>${sessionScope.bruger.navn}, du er på din side</h1>
</div>

<p>${requestScope.msgBruger}</p>


<div class="text-center mt-3">
    <form action="min-servlet">
        <br/>
        <label for="tal"> <b> Skriv dit ynglings tal: </b> </label><br>
        <input type="number" id="tal" name="tal" value="0"><br>
        <br/>
        <input type="submit" class="btn btn-primary" value="Submit">
    </form>
</div>


<div class="container">
    <div class="row">
        <div class="col">
            <div class="text-center mt-3">
                <form action="slet-user-servlet">
                    <br/>
                    <label><b> Fjerne din bruger: ${sessionScope.bruger.navn} </b></label><br>
                    <input type="text" hidden name="Valg" value="${applicationScope.personMap.get(sessionScope.bruger.navn)}">
                    <input type="submit" class="btn btn-primary mt-2" value="Slet Bruger">
                </form>
            </div>
        </div>

        <div class="col">
            <div class="text-center mt-3">
                <form action="change-password-servlet">
                    <br/>
                    <label for="newpassword"><b> Skift kodeord for brugen: ${sessionScope.bruger.navn} </b></label><br>

                    <input type="password" id="newpassword" class="mt-2" name="newpassword" placeholder="New password">
                    <input type="submit" class="btn btn-primary mb-1" value="Enter">
                </form>
            </div>
        </div>
    </div>
</div>


<footer class="mt-4">
    <div class="mt-5 p-2">
        <p><b>Session id: ${sessionScope.id}</b></p>
    </div>
</footer>

</body>
</html>