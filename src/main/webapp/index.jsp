<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Front Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>

<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1><%= "Velkommen til forsiden " %></h1>
</div>

<div class="text-center mt-3">
    <form action="hello-servlet">
        <br/>
        <label for="navn"> <b> Skriv dit navn: </b> </label><br>
        <input type="text" id="navn" name="navn" value="Oskar"><br>
        <br/>
        <input type="submit" class="btn btn-primary" value="Enter">
    </form>
</div>
</body>
</html>