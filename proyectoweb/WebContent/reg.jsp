<%@ page import="java.util.List" %>
<%@ page import="model.Carrera" %>
<%@page import="model.dao.CarreraDao"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;500;600;700;800&family=Staatliches&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/estilo.css">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
<title>Registrar</title>
</head>
<body>

<%@include file="includes/header.html" %>

<section class="logins">
        <article class="loginart">
            <form class="contact_form" action="CarreraController" id="contact_form"	method="post">
                <h1>Registra Carrera</h1>
                <div class="cajadiv">
                    <input type="number" name="codigo" placeholder="Código" required>
                </div>
                <div class="cajadiv">
                    <input type="text" name="nombre" placeholder="Nombre carrera" required>
                </div>
                <div class="cajadiv">
                    <input type="number" name="credito" placeholder="Creditos" required>
                </div>
                <div class="cajadiv">
                    <input type="number" name="semestre" placeholder="Semestres" required>
                </div>
<!--                 <div class="cajadiv"> -->
<!--                     <input type="password" id="clave" name="clave" placeholder="Contraseña" required> -->
<!--                 </div> -->
                <div class="cajadiv">
                	<button class="boton" type="submit">Registrar</button>
<!--                     <input class="boton" type="button" id="continuar" value="Registrar"> -->
                </div>
            </form>
        </article>
    </section>
    
<%@include file="includes/footer.html" %>

<%
		String estado = request.getParameter("estado");
		if (estado != null)
			if (estado.equals("Success")) {
	%>
	<script>
		Swal.fire('Carrera Registrada!',
				'El almacen ha sido registrada con exito!', 'success')
	</script>
	<%
		} else {
	%>
	<script>
		Swal.fire('¡Error!', '¡el almacen no ha podido ser registrada!',
				'error')
	</script>
	<%
		}
	%>

</body>
</html>