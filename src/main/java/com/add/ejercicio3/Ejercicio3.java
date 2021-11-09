package com.add.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

public class Ejercicio3 {
	
	
	
	public static void main(String[] args) {
		
		String basedatos = "aadu2";
	    String host = "localhost";
	    String port = "3306";
	    String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
	    String user = "root";
	    String pwd = "root123*";

	    try {
	            Connection conn = DriverManager.getConnection(urlConnection, user, pwd);
	            Statement st = conn.createStatement();
	            
	            st.execute("CREATE TABLE IF NOT EXISTS usuarios("
						+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
						+ "nombre varchar(100),"
						+ "apellido varchar(100),"
						+ "mail varchar(100),"
						+ "PRIMARY KEY (id));");
		
	
			    
			    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Familia\\Downloads\\usuarios.csv"));
			    
			    String line= null;
			    conn.setAutoCommit(false);
			    
				
				PreparedStament insertar= conn.prepareStatement("INSERT INTO usuarios (nombre,apellido,mail) VALUES(?,?,?);");
				while ((line = reader.readLine())!=null) {
					StringTokenizer separar = new StringTokenizer(line, " ");
					insertar.setString(1, separar.nextToken());
					insertar.setString(2, separar.nextToken());
					insertar.setString(3, separar.nextToken());
					insertar.executeUpdate();
					

				}
				
				
				 
			        //while (separar.hasMoreTokens()) { 
			        	//System.out.println(separar.nextToken());   }
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 }
		 

}
