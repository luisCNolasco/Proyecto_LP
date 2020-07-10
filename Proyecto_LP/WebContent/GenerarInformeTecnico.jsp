<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Informe técnico</h2>

    <form>
        <div class="form-group row">
            <label for="codigoSolicitud" class="col-sm-4 col-form-label">Fecha:</label>
            <div class="col-sm-6">
                <input type="date" class="form-control" name="fecha" />
            </div>
        </div>

        <div class="form-group row">
            <label for="codigoSolicitud" class="col-sm-4 col-form-label">Código informe</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" name="codigoInformeCotizacion" />
            </div>
        </div>
        <div class="form-group row">
            <label for="codigoSolicitante" class="col-sm-4 col-form-label">Código solicitud requerimiento</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" name="codigoSLCP" />
            </div>
        </div>


        <div class="form-group row">
            <label for="requerimientos" class="col-sm-4 col-form-label" id="requerimiento">Adjuntar informe técnico</label>
            <div class="col-sm-6">
                <input id="" type="text" class="form-control" name="requerimiento" />
            </div>
            <input class="btn btn-primary" id="boton-añadir" type="button" value="Adjuntar" />
        </div>

        <br>

        <div id="botones">
            <button type="submit" class="btn btn-warning mr-3">Cancelar</button>
            <button type="submit" class="btn btn-success mr-3">Registrar</button>
        </div>
    </form>
</body>
</html>