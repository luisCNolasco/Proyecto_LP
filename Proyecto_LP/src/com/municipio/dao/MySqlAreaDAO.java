package com.municipio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.municipio.entidad.Area;
import com.municipio.interfaces.AreaDAO;
import com.municipio.utils.MySqlBDConexion;

public class MySqlAreaDAO implements AreaDAO {

	@Override
	public ArrayList<Area> listarAreas() {
		ArrayList<Area> lista = new ArrayList<Area>();
		Area bean = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MySqlBDConexion.getConection();
			String sql = "select *from tb_area";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				bean = new Area();
				bean.setCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				lista.add(bean);
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
		return lista;

	}

}
