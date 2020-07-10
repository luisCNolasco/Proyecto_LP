package com.municipio.interfaces;

import java.util.ArrayList;

import com.municipio.entidad.SolicitudRequerimiento;

public interface SolicitudRequerimientoDAO {

	public int insertSolicitudRequerimiento(SolicitudRequerimiento bean);
	public int updateSolicitudRequrimiento(SolicitudRequerimiento bean);
	public ArrayList<SolicitudRequerimiento> listarSolicitudes();
	public SolicitudRequerimiento buscarSolicitud(String codigo);
	
}
