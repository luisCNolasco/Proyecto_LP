package com.municipio.fabrica;

import com.municipio.dao.*;
import com.municipio.interfaces.*;
public class MySqlDAOFactory extends DAOFactory {

	@Override
	public ActaDeEntregaDAO getActaDeEntregaDAO() {
		// TODO Auto-generated method stub
		return new MySqlActaDeEntregaDAO();
	}

	@Override
	public InformeCertificacionPresupuestalDAO getInformeCertificacionPresupuestalDAO() {
		// TODO Auto-generated method stub
		return new MySqlInformeCertificacionPresupuestalDAO();
	}

	@Override
	public InformeCotizacionDAO getInformeCotizacionDAO() {
		// TODO Auto-generated method stub
		return new MySqlInformeCotizacionDAO();
	}

	@Override
	public InformeTecnicoDAO getInformeTecnicoDAO() {
		// TODO Auto-generated method stub
		return new MySqlInformeTecnicoDAO();
	}

	@Override
	public SolicitudHabilitacionPresupuestalDAO getSolicitudhabilitacionPresupuestalDAO() {
		// TODO Auto-generated method stub
		return new MySqlSolicitudHabilitacionPresupuestalDAO();
	}

	@Override
	public SolicitudRequerimientoDAO getSolicitudRequerimientoDAO() {
		// TODO Auto-generated method stub
		return new MySqlSolicitudRequerimientoDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new MySqlUsuarioDAO();
	}

	@Override
	public AreaDAO getAreaDAO() {
		// TODO Auto-generated method stub
		return new MySqlAreaDAO();
	}

}
