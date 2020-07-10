package com.municipio.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlBDConexion {

	public static Connection getConection() {
		Connection cn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost/proyecto_lp2";
			String usuario="root";
			String pass="0123";
			
			cn=DriverManager.getConnection(url,usuario,pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cn;
	}
}
