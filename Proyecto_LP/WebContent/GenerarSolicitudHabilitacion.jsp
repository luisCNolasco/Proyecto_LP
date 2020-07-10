<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Document</title>
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
      <label for="codigoSolicitud" class="col-sm-4 col-form-label">C�digo de solicitud</label>
      <div class="col-sm-6">
        <input type="text" class="form-control" name="codigoSolicitud" />
      </div>
    </div>
    <div class="form-group row">
      <label for="codigoSolicitante" class="col-sm-4 col-form-label">C�digo de solicitante</label>
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
      <label for="requerimientos" class="col-sm-4 col-form-label" id="requerimiento">Informe t�cnico
      </label>
      <div class="col-sm-6">
        <input id="" type="text" class="form-control" name="requerimiento" />
      </div>
      <input class="btn btn-primary" id="boton-a�adir" type="button" value="Buscar archivo" />
    </div>

    <div class="form-group row">
      <label for="requerimientos" class="col-sm-4 col-form-label" id="requerimiento">Informe cotizaci�n
      </label>
      <div class="col-sm-6">
        <input id="" type="text" class="form-control" name="requerimiento" />
      </div>
      <input class="btn btn-primary" id="boton-a�adir" type="button" value="Buscar archivo" />
    </div>

    <div class="form-group row">
      <label for="requerimientos" class="col-sm-4 col-form-label" id="requerimiento">Habilitaci�n presupuestal</label>
      <div class="col-sm-6">
        <input id="" type="text" class="form-control" name="requerimiento" />
      </div>
      <input class="btn btn-primary" id="boton-a�adir" type="button" value="Adjuntar" />
    </div>



    <br>

    <div id="botones">
      <button type="submit" class="btn btn-warning mr-3">Cancelar</button>
      <button type="submit" class="btn btn-success mr-3">Enviar</button>
    </div>
  </form>

</body>

</html>