package com.add.ejercicio6;

import java.sql.DriverManager;
import java.sql.Connection;


public class Ejercicio6 {
	
	public static void main(String args[]) {
	    //Conectar
      Connection c = null;
      try {
    	   // Cargar controlador de datos, base de datos
         Class.forName("org.postgresql.Driver");
         Class.forName("com.mysql.jdbc.Driver");
          // Conéctese a la dirección de la base de datos, nombre, contraseña
         c = DriverManager.getConnection("jdbc:h2:"+"./Database/AADU2"+"root"+"root123");
      } catch (Exception e) {
         e.printStackTrace();
          // err es la dirección de la secuencia de salida para excepciones de tiempo de ejecución y comentarios de error
         System.out.println("Ha habido un error, no te has podidio conectar con exito a la base de datos.");
          // Llamar al método de salida (0) para terminar la máquina virtual es salir de su programa Java. Los parámetros entre paréntesis son el valor de retorno del final del proceso.
         System.exit(0);
      }
       // Salida Abrir la base de datos con éxito
      System.out.println("La conexion a la base de datos has sido realizada con exito.");
   }


}
