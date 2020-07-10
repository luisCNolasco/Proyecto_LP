<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>Solicitudes de requerimiento</h2>
  <table id="tabla" class="table table-bordered">
    <thead class="thead-dark">
      <tr>
        <th width="20%">Cód. solicitud</th>
        <th width="20%">Cód. solicitante</th>
        <th width="20%"></th>
      </tr>
    </thead>
    <tbody>

      <!-- Todas las solicitudes en estado aprobado -->
      <tr>
        <td>654</td>
        <td>654</td>
        <td>
          <input class="btn btn-warning" type="button" value="Visualizar">
          <input id="generar" class="btn btn-success" type="button" value="Generar informe">
        </td>

      </tr>
    </tbody>
  </table>

  <script src="https://code.jquery.com/jquery-3.5.0.js"></script>

  <script type="text/javascript">
    $(document).ready(function () {

      $("#generar").click(function () {
        $("#contenedorPagina").load('GenerarInformeTecnico.jsp');

      });

      // $("#navHabilitacion").click(function () {
      //   $("#contenedorPagina").load('habilitacion.html');

      // });
    });

  </script>

</body>
</html>