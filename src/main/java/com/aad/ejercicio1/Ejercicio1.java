package com.aad.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ejercicio1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:"+"./Database/AADU2"+"root"+"root123");
			Statement st = conn.createStatement();
			
			st.execute("DROP TABLE IF EXISTS estudiantes");
			st.execute("CREATE TABLE IF NOT EXISTS estudiantes("
					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
					+ "nombre varchar(50),"
					+ "apellido varchar(50),"
					+ "modulo varchar(50),"
					+ "PRIMARY KEY (id));");
			
			
			st.executeUpdate("INSERT INTO estudiantes (nombre,apellido,modulo) VALUES "
		              + "('Alvaro','Gomez','Ciencias'),"
		              + "('Raul','Martinez','Letras'),"
		              + "('Adrian','Perez','Ciencias sociales'),"
		              + "('Pepe','Gonzalez','Ciencias sociales'),"
		              + "('Roberto','Garcia','Ciencias');");
			
			ResultSet rs = st.executeQuery("SELECT * FROM estudiantes");
			

			int i=1;
		      while (rs.next()) {
		        System.out.println("[" + (i++) + "]");        
		        System.out.println("id: " + rs.getString("id"));
		        System.out.println("nombre: " + rs.getString("nombre"));
		        System.out.println("apellido: " + rs.getString("apellido"));
		        System.out.println("modulo: " + rs.getString("modulo"));
		        System.out.println("");
		      }
		      
		      System.out.println("VAMOS A MODIFICAR ALGUNOS DATOS EN LAS TABLAS!!!");
		      System.out.println("");
		      st.executeUpdate("UPDATE estudiantes SET nombre ='Pedro'  WHERE id =2; ");
		      st.executeUpdate("UPDATE estudiantes SET apellido ='Rodriguez'  WHERE id =1; ");
		      st.executeUpdate("UPDATE estudiantes SET modulo ='Letras'  WHERE id =5; ");
		      

		      ResultSet rs1 = st.executeQuery("SELECT * FROM estudiantes");
				

				int a=1;
			      while (rs1.next()) {
			        System.out.println("[" + (a++) + "]");        
			        System.out.println("id: " + rs1.getString("id"));
			        System.out.println("nombre: " + rs1.getString("nombre"));
			        System.out.println("apellido: " + rs1.getString("apellido"));
			        System.out.println("modulo: " + rs1.getString("modulo"));
			        System.out.println("");
			      }
			      
			      System.out.println("VAMOS A BORRAR UNA TABLA!!!");
			      System.out.println("");
			      st.executeUpdate("DELETE estudiantes WHERE id = 4;");
			      st.executeUpdate("UPDATE estudiantes SET id ='4'  WHERE id =5; ");
			      
			      ResultSet rs2 = st.executeQuery("SELECT * FROM estudiantes");
					

					int b=1;
				      while (rs2.next()) {
				        System.out.println("[" + (b++) + "]");        
				        System.out.println("id: " + rs2.getString("id"));
				        System.out.println("nombre: " + rs2.getString("nombre"));
				        System.out.println("apellido: " + rs2.getString("apellido"));
				        System.out.println("modulo: " + rs2.getString("modulo"));
				        System.out.println("");
				      }
				      st.close();
				      conn.close();
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
		
