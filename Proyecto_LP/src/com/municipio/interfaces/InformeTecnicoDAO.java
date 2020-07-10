package com.municipio.interfaces;

import java.util.ArrayList;

import com.municipio.entidad.InformeTecnico;


public interface InformeTecnicoDAO {

	public int insertInformeTecnico(InformeTecnico bean);
	public int updateInformeTecnico(InformeTecnico bean);
	public ArrayList<InformeTecnico> listarInformeTecnicos();
	public InformeTecnico buscarInformeTecnico(String codigo);
}
