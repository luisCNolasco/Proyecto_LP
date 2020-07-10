package com.municipio.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.municipio.entidad.Area;
import com.municipio.entidad.SolicitudRequerimiento;
import com.municipio.service.AreaService;
import com.municipio.service.SolicitudRequerimientoService;

@WebServlet("/ServletSolicitudRequerimiento")
public class ServletSolicitudRequerimiento extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SolicitudRequerimientoService servicioSolicitud;
	private AreaService servicioArea;

	public ServletSolicitudRequerimiento() {
		super();
		servicioSolicitud = new SolicitudRequerimientoService();
		servicioArea = new AreaService();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String accion = request.getParameter("accion");
		if (accion == null)
			accion = "LISTAR";

		if (accion.equals("LISTAR"))
			listarAreas(request, response);
		else if (accion.equals("ENVIAR"))
			insertarSolicitudRequerimiento(request, response);

	}

	private void listarAreas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Area> data = servicioArea.listarAreas();

		request.setAttribute("areas", data);

		for (Area area : data) {
			System.out.println(area.getCodigo() + " - " + area.getNombre());
		}

		request.getRequestDispatcher("/GenerarSolicitudRequerimiento.jsp").forward(request, response);

	}

	private void insertarSolicitudRequerimiento(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String codigoSolicitud = request.getParameter("codigoSolicitud");
		String area = request.getParameter("area");
		String codigoSolicitante = request.getParameter("codigoSolicitante");
		int estado = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = null;

		try {
			fecha = sdf.parse(request.getParameter("fecha"));
		} catch (ParseException e) {

			e.printStackTrace();
		}

		SolicitudRequerimiento bean = new SolicitudRequerimiento();
		bean.setCodigo(codigoSolicitud);
		bean.setCodigo_area(Integer.parseInt(area));
		bean.setCodigo_usuario_solicitante(codigoSolicitante);
		bean.setDescripcion("Requerimientos");
		bean.setEstado(estado);
		bean.setFecha(fecha);

		int salida = servicioSolicitud.insertSolicitudRequerimiento(bean);

		if (salida != 1) {
			request.setAttribute("mensaje", "Error al enviar datos");
			System.out.println(salida);
		} else {
			request.setAttribute("mensaje", "Datos enviados");
			System.out.println(salida);
		}

		request.getRequestDispatcher("/Solicitante.jsp").forward(request, response);

	}

}
