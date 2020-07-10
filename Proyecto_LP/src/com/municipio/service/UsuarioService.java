package com.municipio.service;

import com.municipio.entidad.Usuario;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.UsuarioDAO;

public class UsuarioService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(1);
	
	UsuarioDAO daoUsuario = fabrica.getUsuarioDAO();
	
	public Usuario buscarUsuario(String codigo) {
		return daoUsuario.buscarUsuario(codigo);
	}
	
	public Usuario iniciarSesion(String usuario,String pass) {
		return daoUsuario.iniciarSesion(usuario, pass);
	}
}
