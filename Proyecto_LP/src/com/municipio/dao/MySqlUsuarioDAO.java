package com.municipio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.municipio.entidad.Area;
import com.municipio.entidad.Usuario;
import com.municipio.interfaces.UsuarioDAO;
import com.municipio.utils.MySqlBDConexion;

public class MySqlUsuarioDAO implements UsuarioDAO {

	@Override
	public Usuario buscarUsuario(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario iniciarSesion(String usuario, String pass) {
		
		Usuario bean = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MySqlBDConexion.getConection();
			String sql = "select * from tb_usuario where codigo=? and pass=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, pass);
			
			rs = pstm.executeQuery();
			if (rs.next()) {
				bean = new Usuario();
				bean.setCodigo(rs.getString(1));
				bean.setNombre(rs.getString(2));
				bean.setApellidos(rs.getString(3));
				bean.setFoto(rs.getString(4));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return bean;

	}

}
