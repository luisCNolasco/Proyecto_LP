package com.municipio.service;

import java.util.ArrayList;

import com.municipio.entidad.InformeTecnico;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.InformeTecnicoDAO;

public class InformeTecnicoService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	InformeTecnicoDAO daoInformeTecnico = fabrica.getInformeTecnicoDAO();

	public int insertInformeTecnico(InformeTecnico bean) {
		return daoInformeTecnico.insertInformeTecnico(bean);
	}

	public int updateInformeTecnico(InformeTecnico bean) {
		return daoInformeTecnico.updateInformeTecnico(bean);
	}

	public ArrayList<InformeTecnico> listarInformeTecnicos() {
		return daoInformeTecnico.listarInformeTecnicos();
	}

	public InformeTecnico buscarInformeTecnico(String codigo) {
		return daoInformeTecnico.buscarInformeTecnico(codigo);
	}
}
