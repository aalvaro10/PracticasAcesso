package com.add.ejercicio6;

import java.sql.DriverManager;
import java.sql.Connection;


public class Ejercicio6 {
	
	public static void main(String args[]) {

      Connection c = null;
      try {

         Class.forName("org.postgresql.Driver");
         Class.forName("com.mysql.jdbc.Driver");
         
         c = DriverManager.getConnection("jdbc:h2:"+"./Database/AADU2"+"root"+"root123");
      } catch (Exception e) {
         e.printStackTrace();
         
         System.out.println("Ha habido un error, no te has podidio conectar con exito a la base de datos.");
          
         System.exit(0);
      }

      System.out.println("La conexion a la base de datos has sido realizada con exito.");
   }


}
