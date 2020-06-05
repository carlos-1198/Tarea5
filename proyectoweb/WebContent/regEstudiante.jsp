<%@ page import="java.util.List" %>
<%@ page import="model.Estudiante" %>
<%@page import="model.dao.EstudianteDao"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Nuevo Estudiante</title>
</head>
<body>

<%@include file="includes/header.html" %>

<section class="logins">
        <article class="loginart">
        	<jsp:useBean id="cDao" class="model.dao.CarreraDao" scope="request"></jsp:useBean>
            <form class="contact_form" action="CarreraController" id="contact_form"	method="post">
                <h1>Registrar Estudiante</h1>
                <div class="cajadiv">
                    <input type="text" name="nombre" placeholder="nombre" required>
                </div>
                <div class="cajadiv">
                    <input type="text" name="apellido" placeholder="apellido" required>
                </div>
                <div class="cajadiv">
                    <input type="text" name="cedula" placeholder="cedula" required>
                </div>
                <div class="cajadiv">
                    <input type="text" name="codigoEstudiante" placeholder="codigoEstudiante" required>
                </div>
                <div class="cajadiv">
                	<select name="CodigoCarrera" id="CodigoCarrera">
                	<c:forEach var="c" items="${cDao.list()}">
    					<option><c:out value="${c.codigo_carrera}" /></option>
    				</c:forEach>	
  					</select>
               </div>
                <div class="cajadiv">
                	<button class="boton" type="submit">Registrar</button>
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
		Swal.fire('Estudiante Registrado!',
				'Se ha registrado con exito!', 'success')
	</script>
	<%
		} else {
	%>
	<script>
		Swal.fire('¡Error!', '¡Fallo en los datos!',
				'error')
	</script>
	<%
		}
	%>

</body>
</html>