package com.add.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

public class Ejercicio3 {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		 try {
			 String basedatos = "prueba";
			    String host = "localhost";
			    String port = "3306";
			    String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + AADU2 ;
			    String user = "root";
			    String pwd = "root123";
			    
			    BufferedReader reader =new BufferedReader(new FileReader("C:\\Users\\Familia\\Downloads\\usuarios.csv"));
				Statement st = reader.createStatement();
				PreparedStatement ps =  Statement.prepareStatement("INSERT INTO USUARIOS values (id,nombre,apellido,mail)"); 
			    
				
				st.execute("DROP TABLE IF EXISTS usuarios");
				st.execute("CREATE TABLE IF NOT EXISTS estudiantes("
						+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
						+ "nombre varchar(100),"
						+ "apellido varchar(100),"
						+ "mail varchar(100),"
						+ "PRIMARY KEY (id));");
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 }
		 

}
