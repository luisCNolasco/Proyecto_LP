package com.municipio.interfaces;

import com.municipio.entidad.Usuario;

public interface UsuarioDAO {

	public Usuario buscarUsuario(String codigo);
	
	public Usuario iniciarSesion(String usuario,String pass);
	
}
