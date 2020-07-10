<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
    integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div id="contenedor">
        <main>
            <section id="contenedor-datosUsuario" >
                <h2>Técnico</h2>
                <img src="https://img2.freepng.es/20180331/eow/kisspng-computer-icons-user-clip-art-user-5abf13db298934.2968784715224718991702.jpg" alt="">
                <input class="btn btn-danger" type="button" value="CERRAR SESIÓN">
            </section>
            <section id="navegacion-paginas">
                <nav class="navbar navbar-expand-lg navbar-dark bg-dark">               
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                      <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                          <a id="navTecnico" class="nav-link" href="#">Generar informe técnico <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                          <a id="navActa" class="nav-link" href="#">Generar acta de entrega</a>
                        </li>
                      </ul>                      
                    </div>
                  </nav>
                  <div id="contenedorPagina">
                    
                  </div>
            </section>
            
        </main>
    </div>

    <!-- JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.0.js"></script>

      <script type="text/javascript">
			$(document).ready(function() {
			
        $("#navTecnico").click(function() {
					$("#contenedorPagina").load('BuscarSolicitudRequerimientoApro.jsp');
         
				});
     
        $("#navActa").click(function() {
          $("#contenedorPagina").load('GenerarActaEntrega.jsp');
         
				});
			});

    </script>
</body>
</html>