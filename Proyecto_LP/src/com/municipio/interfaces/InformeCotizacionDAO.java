package com.municipio.interfaces;

import java.util.ArrayList;

import com.municipio.entidad.InformeCotizacion;

public interface InformeCotizacionDAO {

	public int insertInformeCotizacion(InformeCotizacion bean);
	public int updateInformeCotizacion(InformeCotizacion bean);
	public ArrayList<InformeCotizacion> listarInformeCotizacion();
	public InformeCotizacion buscarInformeCotizacion(String codigo);
}
