<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Formulario Celulares</title>
	<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
	<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="../../webjars/jquery/3.0.0/js/jquey.min.js"></script>
	
</head>
<body>

	<div class="container">
		<spring:url value="/celular/guardarCelular" var="saveURL"/>
		<h2>Celular</h2>
		<form:form modelAttribute="formularioCelular" method="post" action="${saveURL }" cssClass="form">
			<form:hidden path="codigo"/>
			<div class="form-group">
				<label>Marca</label>
				<form:input path="marca" cssClass="form-control" id="marca"/>
			</div>
			<div class="form-group">
				<label>Procesador</label>
				<form:input path="procesador" cssClass="form-control" id="procesador"/>
			</div>
			<div class="form-group">
				<label>Sistema Operativo</label>
				<form:input path="sistema_operativo" cssClass="form-control" id="sistema_operativo"/>
			</div>
			<div class="form-group">
				<label>Memoria Interna</label>
				<form:input path="memoria_interna" cssClass="form-control" id="memoria_interna"/>
			</div>
			
			<div class="form-group">
				<label>Valor</label>
				<form:input path="valor" cssClass="form-control" id="valor"/>
			</div>
			<button type="submit" class="btn btn-primary">Guardar</button>
			
		
		</form:form>
	</div>

</body>
</html>