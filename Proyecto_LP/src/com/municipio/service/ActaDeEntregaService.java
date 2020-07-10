package com.municipio.service;

import java.util.ArrayList;

import com.municipio.entidad.ActaDeEntrega;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.ActaDeEntregaDAO;

public class ActaDeEntregaService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	ActaDeEntregaDAO daoActa = fabrica.getActaDeEntregaDAO();

	public int insertActaDeEntrega(ActaDeEntrega bean) {
		return daoActa.insertActaDeEntrega(bean);
	}

	public int updateActaDeEntrega(ActaDeEntrega bean) {
		return daoActa.updateActaDeEntrega(bean);
	}

	public ArrayList<ActaDeEntrega> listarActaDeEntrega() {
		return daoActa.listarActaDeEntrega();
	}

	public ActaDeEntrega buscarActaDeEntrega(String codigo) {
		return daoActa.buscarActaDeEntrega(codigo);
	}
}
