package com.municipio.interfaces;

import java.util.ArrayList;

import com.municipio.entidad.InformeCertificacionPresupuestal;

public interface InformeCertificacionPresupuestalDAO {

	public int insertInformeCertificacionPresupuestal(InformeCertificacionPresupuestal bean);
	public int updateInformeCertificacionPresupuestal(InformeCertificacionPresupuestal bean);
	public ArrayList<InformeCertificacionPresupuestal> listarInformeCertificacionPresupuestal();
	public InformeCertificacionPresupuestal buscarInformeCertificacionPresupuestal(String codigo);
}
