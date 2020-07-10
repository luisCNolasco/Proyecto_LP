package com.municipio.service;

import java.util.ArrayList;

import com.municipio.entidad.InformeCertificacionPresupuestal;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.InformeCertificacionPresupuestalDAO;

public class InformeCertificacionPresupuestalService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	
	InformeCertificacionPresupuestalDAO daoInformeCertificacion = fabrica.getInformeCertificacionPresupuestalDAO();
	
	public int insertInformeCertificacionPresupuestal(InformeCertificacionPresupuestal bean) {
		return daoInformeCertificacion.insertInformeCertificacionPresupuestal(bean);
	}
	public int updateInformeCertificacionPresupuestal(InformeCertificacionPresupuestal bean) {
		return daoInformeCertificacion.updateInformeCertificacionPresupuestal(bean);
	}
	public ArrayList<InformeCertificacionPresupuestal> listarInformeCertificacionPresupuestal(){
		return daoInformeCertificacion.listarInformeCertificacionPresupuestal();
	}
	public InformeCertificacionPresupuestal buscarInformeCertificacionPresupuestal(String codigo) {
		return daoInformeCertificacion.buscarInformeCertificacionPresupuestal(codigo);
	}
}
