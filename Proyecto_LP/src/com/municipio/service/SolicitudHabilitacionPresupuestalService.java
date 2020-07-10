package com.municipio.service;

import java.util.ArrayList;

import com.municipio.entidad.SolicitudHabilitacionPresupuestal;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.SolicitudHabilitacionPresupuestalDAO;

public class SolicitudHabilitacionPresupuestalService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	SolicitudHabilitacionPresupuestalDAO daoSolicitud = fabrica.getSolicitudhabilitacionPresupuestalDAO();

	public int insertSolicitudHabilitacionPresupuestal(SolicitudHabilitacionPresupuestal bean) {
		return daoSolicitud.insertSolicitudHabilitacionPresupuestal(bean);
	}

	public int updateSolicitudHabilitacionPresupuestal(SolicitudHabilitacionPresupuestal bean) {
		return daoSolicitud.updateSolicitudHabilitacionPresupuestal(bean);
	}

	public ArrayList<SolicitudHabilitacionPresupuestal> listarSolicitudHabilitacionPresupuestal() {
		return daoSolicitud.listarSolicitudHabilitacionPresupuestal();
	}

	public SolicitudHabilitacionPresupuestal buscarSolicitudHabilitacionPresupuestal(String codigo) {
		return daoSolicitud.buscarSolicitudHabilitacionPresupuestal(codigo);
	}
}
