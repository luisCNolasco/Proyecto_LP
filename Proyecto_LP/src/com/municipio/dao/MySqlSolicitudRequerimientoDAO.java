package com.municipio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.municipio.entidad.SolicitudRequerimiento;
import com.municipio.interfaces.SolicitudRequerimientoDAO;
import com.municipio.utils.MySqlBDConexion;

public class MySqlSolicitudRequerimientoDAO implements SolicitudRequerimientoDAO {

	@Override
	public int insertSolicitudRequerimiento(SolicitudRequerimiento bean) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MySqlBDConexion.getConection();
			String sql = "insert into tb_solicitud_requerimiento values(?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, bean.getCodigo());
			pstm.setInt(2, bean.getEstado());

			java.util.Date utilDate = bean.getFecha();

			java.sql.Date fechaConvertida = new java.sql.Date(utilDate.getTime());

			pstm.setDate(3,fechaConvertida);
			pstm.setString(4, bean.getDescripcion());
			pstm.setInt(5, bean.getCodigo_area());
			pstm.setString(6, bean.getCodigo_usuario_solicitante());

			estado = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int updateSolicitudRequrimiento(SolicitudRequerimiento bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SolicitudRequerimiento> listarSolicitudes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SolicitudRequerimiento buscarSolicitud(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
