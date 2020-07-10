<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

</head>
<body>
	<div id="contenedorPagina">
		<form action="ServletSolicitudRequerimiento?accion=ENVIAR" method="POST">
			
			<div class="form-group row">
				<label for="codigoSolicitud" class="col-sm-4 col-form-label">Fecha:</label>
				<div class="col-sm-6">
					<input type="date" class="form-control" name="fecha" />
				</div>
			</div>

			<div class="form-group row">
				<label for="codigoSolicitud" class="col-sm-4 col-form-label">Código
					de solicitud</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="codigoSolicitud" />
				</div>
			</div>
			<div class="form-group row">
				<label for="codigoSolicitante" class="col-sm-4 col-form-label">Código
					de solicitante</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="codigoSolicitante" />
				</div>
			</div>
			<div class="form-group row">
				<label for="nombres" class="col-sm-4 col-form-label">Nombres</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="nombre" />
				</div>
			</div>
			<div class="form-group row">
				<label for="apellidos" class="col-sm-4 col-form-label">Apellidos</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="apellido" />
				</div>
			</div>
			<div class="form-group row">
				<label for="exampleFormControlSelect1"
					class="col-sm-4 col-form-label">Área</label>
				<div class="col-sm-6">
					<select class="form-control" name="area">
						<option>[Seleccione]</option>
						<c:forEach items="${areas}" var="row">
							<option value="${row.codigo}">${row.nombre}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group row">
				<label for="requerimientos" class="col-sm-4 col-form-label"
					id="requerimiento">Requerimientos</label>
				<div class="col-sm-6">
					<input id="" type="text" class="form-control" name="requerimiento" />
				</div>
				<input class="btn btn-primary" id="boton-añadir" type="button"
					value="Añadir" />
			</div>
			<table class="table table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>Requerimiento</th>
						<th>Opcion</th>
					</tr>
				</thead>
				<tbody>

					<!-- registros de la base de datos -->
				</tbody>
			</table>
			<br>
			<div id="botones">
				<button type="submit" class="btn btn-warning mr-3">Cancelar</button>
				<button type="submit" class="btn btn-success mr-3">Enviar</button>
			</div>

		</form>
	</div>
	
</body>
</html>
