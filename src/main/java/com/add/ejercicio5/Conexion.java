package com.add.ejercicio5;

import java.sql.*;

public class Conexion {
	
	public static Connection conectar() {
		Connection con = null;
		
		String pwd = "root123";
		String user = "root";
		String url = "jdbc:mysql://localhost:3306/aadu2?user=" + user+ "&password=" + pwd;
		try {
			con = DriverManager.getConnection(url, user, pwd);
		
			}
		catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}

}