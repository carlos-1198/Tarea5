<%@ page import="java.util.List" %>
<%@ page import="model.Carrera" %>
<%@page import="model.dao.CarreraDao"%>
<%-- <%@page import="services.CarreraDao" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
<title>Insert title here</title>
</head>
<body>

	<form class="contact_form" action="CarreraController" id="contact_form"
		method="post">

		<li>
			<h2>Contactos</h2>
			<span class="required_notification">* Datos requeridos</span>
		</li>
		<li>
			<label for = "name">Codigo:</label>
			<input type="text" name="codigo" placeholder="Geovany Mantilla" required/>
		</li>
		<li>
			<label for = "nombre">Nombre:</label>
			<input type="text" name="nombre" placeholder="info@dominio.com" required/>
			<span class="form_hint">Formato correcto: "name@dominio.com"</span>
		</li>
		<li>
			<label for = "credito">Credito:</label>
			<input type="number" name="credito" placeholder="http://dominio.com "/>
			<span class="form_hint">formato correcto: "http://dominio.com"</span>
		</li>
		<li>
			<label for = "semestre">Semestre:</label>
			<input type="number" name="semestre" cols="40" rows="4"  required/>
		</li>
		<li>
			<button class="submit" type="submit">Enviar mensaje</button>
		</li>
	</form>

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