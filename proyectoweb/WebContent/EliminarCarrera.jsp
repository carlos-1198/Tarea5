<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;500;600;700;800&family=Staatliches&display=swap"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/estilo.css">
<title>Consultar</title>
</head>
<body>

	<%@include file="includes/header.html"%>

	<section class="logins">
		<article class="listnart">
			<form class="consultar" action="EliminarCarreraController"
				method="post">
				<div class="subconsulta">

					<p>Eliminar</p>
					<div>
						<input name="codigo" placeholder="Cédula" type="text" required>
					</div>
					<button class="btnbuscar" type="submit">Eliminar</button>
				</div>
			</form>
		</article>
	</section>

	<%@include file="includes/footer.html"%>

</body>
</html>