<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="css/login.css">
</head>
<body>
<c:if test="${mensaje!=null}">
<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong>${mensaje}</strong>
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button>
</div>
</c:if>
<div id="contenedor">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTWFfBjiDGy1mKAc-kthJHyGx6EADOW-V-WSheA57rjAekaD4pZxY1dW6_0W77o4aQpWF84_g&usqp=CAU" alt="">
        <form method="POST" action="ServletUsuario">
        <input type="hidden" name="INICIAR">
            <div class="form-group">
              
              <input name="usuario" type="text" class="form-control" placeholder="Ingrese usuario">
              
            </div>
            <div class="form-group">
             
              <input name="pass" type="password" class="form-control" placeholder="Ingrese contraseña">
            </div>
            
            <button type="submit" class="btn btn-primary">INGRESAR </button>
          </form>
    </div>
    
    <!-- JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
	
</body>
</html>