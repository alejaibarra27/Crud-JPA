<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista Celulares</title>
	<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
	<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="../../webjars/jquery/3.0.0/js/jquey.min.js"></script>

</head>
<body>
	
	<div class="container">
		<h2>Lista Celulares</h2>
		<table class="table table-striped">
			<thead>
			<tr>
				<th scope="row">#CODIGO</th>
				<th scope="row">Marca</th>	
				<th scope="row">Procesador</th>
				<th scope="row">Sistema Operativo</th>
				<th scope="row">Memoria Interna</th>
				<th scope="row">Valor</th>
				<th scope="row">Actualizar</th>
				<th scope="row">Eliminar</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaCelular}" var="celular">
					<tr>
						<td>${celular.codigo}</td>
						<td>${celular.marca}</td>
						<td>${celular.procesador}</td>
						<td>${celular.sistema_operativo}</td>
						<td>${celular.memoria_interna}</td>
						<td>${celular.valor}</td>
						<td>
							<spring:url value="/celular/actualizarCelular/${celular.codigo }" var="updateURL" />
							<a class="btn btn-primary" href="${updateURL }" role="button">Actualizar</a>
						</td>
						<td>
							<spring:url value="/celular/eliminarCelular/${celular.codigo }" var="deleteURL" />
							<a class="btn btn-primary" href="${updateURL }" role="button">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<spring:url value="/celular/agregarCelular/${celular.codigo }" var="addURL" />
		<a class="btn btn-primary" href="${addURL }" role="button">Agregar Nuevo Celular</a>
	
	</div>
	
</body>
</html>