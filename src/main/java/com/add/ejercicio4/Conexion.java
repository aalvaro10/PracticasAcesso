package com.add.ejercicio4;

import java.sql.*;

public class Conexion {
	
	public static Connection conectar() {
		Connection con = null;
		
		String password = "elfutbol10";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/aadu2?user=" + usuario+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}

}
