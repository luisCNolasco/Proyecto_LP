<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form>
		<div class="form-group row">
			<label for="codigoSolicitud" class="col-sm-4 col-form-label">Fecha:</label>
			<div class="col-sm-6">
				<input type="date" class="form-control" name="fecha" />
			</div>
		</div>

		<div class="form-group row">
			<label for="codigoSolicitud" class="col-sm-4 col-form-label">Código
				informe cotización</label>
			<div class="col-sm-6">
				<input type="text" class="form-control"
					name="codigoInformeCotizacion" />
			</div>
		</div>
		<div class="form-group row">
			<label for="codigoSolicitante" class="col-sm-4 col-form-label">Código
				de SLCP</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" name="codigoSLCP" />
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
			<label for="requerimientos" class="col-sm-4 col-form-label"
				class="custom-file-input">Informe técnico</label>
			<div class="col-sm-6">
				<input type="file" class="form-control">
			</div>
		</div>

		<div class="form-group row">
			<label for="requerimientos" class="col-sm-4 col-form-label"
				class="custom-file-input">Informe de cotización</label>
			<div class="col-sm-6">
				<input type="file" class="form-control">
			</div>
		</div>

		<br>


		<div id="botones">
			<button type="submit" class="btn btn-warning mr-3">Cancelar</button>
			<button type="submit" class="btn btn-success mr-3">Enviar</button>
		</div>
	</form>

</body>
</html>