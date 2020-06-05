<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;500;600;700;800&family=Staatliches&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/estilo.css">
<title>Iniciar sesión</title>
</head>
<body>

<%@include file="includes/header.html" %>

<section class="logins">
        <article class="loginart">
            <form method="post" action="LoginController">
                <h1>Iniciar sesión</h1>
                <div class="cajadiv">
                    <input type="number" name="codigo" placeholder="Código" required="">
                </div>
                <div class="cajadiv">
                    <input type="password" name="nombre" placeholder="Nombre" required="">
                </div>
                <div class="cajadiv">
                    <button class="boton" type="submit" id="continuar">Entrar</button>
                </div>
            </form>
        </article>
    </section>

<%@include file="includes/footer.html" %>

</body>
</html>