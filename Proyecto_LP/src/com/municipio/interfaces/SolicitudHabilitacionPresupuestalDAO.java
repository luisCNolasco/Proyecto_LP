package com.municipio.interfaces;

import java.util.ArrayList;

import com.municipio.entidad.SolicitudHabilitacionPresupuestal;

public interface SolicitudHabilitacionPresupuestalDAO {

	public int insertSolicitudHabilitacionPresupuestal(SolicitudHabilitacionPresupuestal bean);
	public int updateSolicitudHabilitacionPresupuestal(SolicitudHabilitacionPresupuestal bean);
	public ArrayList<SolicitudHabilitacionPresupuestal> listarSolicitudHabilitacionPresupuestal();
	public SolicitudHabilitacionPresupuestal buscarSolicitudHabilitacionPresupuestal(String codigo);
}
