package com.municipio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.municipio.entidad.Usuario;
import com.municipio.service.UsuarioService;

@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioService servicioUsuario;

	public ServletUsuario() {
		super();
		servicioUsuario = new UsuarioService();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion = request.getParameter("accion");
		
		if (accion.equals("INICIAR")) 
			iniciarSesionUsuario(request,response);
		else if(accion.equals("CERRAR"))
			cerrarSesionUsuario(request,response);
		
		
		
	}

	private void cerrarSesionUsuario(HttpServletRequest request, HttpServletResponse response) {
		

	}

	private void iniciarSesionUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		
		Usuario bean=servicioUsuario.iniciarSesion(usuario, pass);
		
		//Validar el objeto bean
		if (bean!=null) {
			String codUsu = bean.getCodigo();
			
			
			//crear una sesion
			HttpSession session = request.getSession();
			//crear un atributo dentro del objeto "session"
			//session.setAttribute("menus",lista);
			//direccionar a la pagina menu.jsp
			request.getRequestDispatcher("/menu.jsp").forward(request, response);
		}else {
			request.setAttribute("mensaje","Usuario y/o clave incorrecta");
			//direccionar a la pagina menu.jsp
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		
		}

	}

}







