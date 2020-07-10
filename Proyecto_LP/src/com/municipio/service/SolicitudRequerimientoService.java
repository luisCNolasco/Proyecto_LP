package com.municipio.service;

import java.util.ArrayList;

import com.municipio.entidad.SolicitudRequerimiento;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.SolicitudRequerimientoDAO;

public class SolicitudRequerimientoService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	SolicitudRequerimientoDAO daoSolicitud = fabrica.getSolicitudRequerimientoDAO();

	public int insertSolicitudRequerimiento(SolicitudRequerimiento bean) {
		return daoSolicitud.insertSolicitudRequerimiento(bean);
	}

	public int updateSolicitudRequrimiento(SolicitudRequerimiento bean) {
		return daoSolicitud.updateSolicitudRequrimiento(bean);
	}

	public ArrayList<SolicitudRequerimiento> listarSolicitudes() {
		return daoSolicitud.listarSolicitudes();
	}

	public SolicitudRequerimiento buscarSolicitud(String codigo) {
		return daoSolicitud.buscarSolicitud(codigo);
	}
}
