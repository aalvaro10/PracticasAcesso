package com.add.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.StringTokenizer;


public class Ejercicio3 {
	
	
	
	public static void main(String[] args) {
		
		String basedatos = "aadu2";
	    String host = "localhost";
	    String port = "3306";
	    String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
	    String user = "root";
	    String pwd = "root123";

	    try {
	            Connection conn = DriverManager.getConnection(urlConnection, user, pwd);
	            Statement st = conn.createStatement();
	            
	            st.execute("DROP TABLE IF EXISTS usuarios;");
	            st.execute("CREATE TABLE usuarios("
						+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
						+ "nombre varchar(100),"
						+ "apellido varchar(100),"
						+ "mail varchar(100),"
						+ "PRIMARY KEY (id));");
		
	            System.out.println("La tabla ha sido creada.");
			    
			    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dam2\\Downloads\\uusarios.csv"));
			    
			    String line= null;
			    conn.setAutoCommit(false);
			    
				
				PreparedStatement insertar= conn.prepareStatement("INSERT INTO usuarios (nombre,apellido,mail) VALUES(?,?,?);");
				while ((line = reader.readLine())!=null) {
					StringTokenizer separar = new StringTokenizer(line, "|");
					insertar.setString(1, separar.nextToken());
					insertar.setString(2, separar.nextToken());
					insertar.setString(3, separar.nextToken());
					insertar.executeUpdate();
					

				}
				conn.commit();
				System.out.println("Se han añadido los datos en la tabla.");
				reader.close();
				st.close();
				conn.close();
				
				
		
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 }
		 

}
