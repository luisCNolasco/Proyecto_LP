package com.municipio.service;

import java.util.ArrayList;

import com.municipio.entidad.InformeCotizacion;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.InformeCotizacionDAO;

public class InformeCotizacionService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	InformeCotizacionDAO daoInformeCotizacion = fabrica.getInformeCotizacionDAO();

	public int insertInformeCotizacion(InformeCotizacion bean) {
		return daoInformeCotizacion.insertInformeCotizacion(bean);
	}

	public int updateInformeCotizacion(InformeCotizacion bean) {
		return daoInformeCotizacion.updateInformeCotizacion(bean);
	}

	public ArrayList<InformeCotizacion> listarInformeCotizacion() {
		return daoInformeCotizacion.listarInformeCotizacion();
	}

	public InformeCotizacion buscarInformeCotizacion(String codigo) {
		return daoInformeCotizacion.buscarInformeCotizacion(codigo);
	}
}
