package com.municipio.interfaces;

import java.util.ArrayList;

import com.municipio.entidad.ActaDeEntrega;

public interface ActaDeEntregaDAO {

	public int insertActaDeEntrega(ActaDeEntrega bean);
	public int updateActaDeEntrega(ActaDeEntrega bean);
	public ArrayList<ActaDeEntrega> listarActaDeEntrega();
	public ActaDeEntrega buscarActaDeEntrega(String codigo);
}
