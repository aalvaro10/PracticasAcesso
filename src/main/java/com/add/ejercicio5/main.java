package com.add.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.add.ejercicio4.Conexion;

public class main {
public static void main(String[] args) {


	    
	            boolean salir = false;
				int opcion,opcion2,opcion3;
				Scanner sc = new Scanner(System.in);
				Scanner scc = new Scanner(System.in);
				
				int c,i;
				do {
					System.out.println("---------------------------------------------");
					System.out.println("-- Estas son las opciones que puedes hacer --");
					System.out.println("---------------------------------------------");
					System.out.println("1- Creacion de estructuras con sentencias DDL.");
					System.out.println("2- Funcionalidad CRUD.");
					System.out.println("3- Eliminar todos los datos almacenados.");
					System.out.println("4- Recuperar el último elemento borrado.");
					System.out.println("5- Transacciones para realizar alguna operación compleja.");
					System.out.println("6- Uso de un procedimiento almacenado.");
					System.out.println("7- Salir ");
					System.out.println("");
					System.out.print("Pon un numero del 1 al 7: ");
					opcion = sc.nextInt();

					switch (opcion) {
					case 1:
						try {
							
							do{
								System.out.println("--------------------------------------------------------------------");
							System.out.println("-- Estas son las opciones de sentencia DDL. Elige una de las tres --");
							System.out.println("--------------------------------------------------------------------");
							System.out.println("1- CREATE TABLE");
							System.out.println("2- ALTER TABLE");
							System.out.println("3- DROP TABLE");
							System.out.println("");
							System.out.print("Elige una opcion: ");
							opcion2= scc.nextInt();
							
							switch(opcion2) {
							case 1:
								System.out.println("Has cogido la opcion de crear tabla");
								Connection conn = Conexion.conectar();
								Statement st = conn.createStatement();
								
								
								st.execute("DROP TABLE IF EXISTS jugadores");
								st.execute("CREATE TABLE IF NOT EXISTS jugadores("
										+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
										+ "nombre varchar(50),"
										+ "apellidos varchar(50),"
										+ "goles varchar(50),"
										+ "PRIMARY KEY (id));");
								System.out.println("---------------------------------");
								System.out.println("La tabla jugadores ha sido creada");
								System.out.println("---------------------------------");
								
								st.executeUpdate("INSERT INTO jugadores (id,nombre,apellidos,goles) VALUES "
							              + "('1','Alvaro','Gomez','3 goles'),"
							              + "('2','Raul','Martinez','0 goles'),"
							              + "('3','Adrian','Perez','1 gol'),"
							              + "('4','Pepe','Gonzalez','10 goles'),"
							              + "('5','Roberto','Garcia','5 goles');");
								
								ResultSet rs = st.executeQuery("SELECT * FROM jugadores");
								
								int a=1;
							      while (rs.next()) {
							        System.out.println("[" + (a++) + "]");        
							        System.out.println("id: " + rs.getString("id"));
							        System.out.println("nombre: " + rs.getString("nombre"));
							        System.out.println("apellidos: " + rs.getString("apellidos"));
							        System.out.println("goles: " + rs.getString("goles"));
							      }
								
								Statement stt = conn.createStatement();
								stt.execute("DROP TABLE IF EXISTS equipo");
								stt.execute("CREATE TABLE IF NOT EXISTS equipo("
										+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
										+ "nombre_equipo varchar(50),"
										+ "abreviacion varchar(50),"
										+ "pts int,"
										+ "PRIMARY KEY (id));");
								System.out.println("------------------------------");
								System.out.println("La tabla equipo ha sido creada");
								System.out.println("------------------------------");
								System.out.println("");
								
								stt.executeUpdate("INSERT INTO equipo (id,nombre_equipo,abreviacion,pts) VALUES "
							              + "('1','Real Madrid','Madrid','3'),"
							              + "('2','Futbol Club Barcelona','Barsa','0'),"
							              + "('3','Real Betis','Betis','6'),"
							              + "('4','Atletico de Madrid','Atleti','9'),"
							              + "('5','Real Valladolid','Valladolid','12');");
								
								ResultSet rss = st.executeQuery("SELECT * FROM equipo");
								int b=1;
							      while (rss.next()) {
							        System.out.println("[" + (b++) + "]");        
							        System.out.println("id: " + rss.getString("id"));
							        System.out.println("nombre_equipo: " + rss.getString("nombre_equipo"));
							        System.out.println("abreviacion: " + rss.getString("abreviacion"));
							        System.out.println("pts: " + rss.getString("pts"));
							      }
								conn.close();
								break;
							case 2:
								Connection conn1 = Conexion.conectar();
								Statement st1 = conn1.createStatement();
								System.out.println("Has cogido la opcion de alter table");
								System.out.println("");
								st1.executeUpdate("UPDATE jugadores SET nombre ='Juan'  WHERE id =2; ");
							      st1.executeUpdate("UPDATE jugadores SET apellidos ='Cid'  WHERE id =1; ");
							      st1.executeUpdate("UPDATE jugadores SET goles ='Letras'  WHERE id =3; ");
							      System.out.println("La tabla jugadores ha sido modificada");
							      ResultSet rs1 = st1.executeQuery("SELECT * FROM jugadores");
							      
							      Statement st2 = conn1.createStatement();
									st2.executeUpdate("UPDATE equipo SET nombre_equipo ='Club Barcelona'  WHERE id =2; ");
								      st2.executeUpdate("UPDATE equipo SET abreviacion ='Atletico'  WHERE id =4; ");
								      st2.executeUpdate("UPDATE equipo SET pts ='9'  WHERE id =5; ");
								      System.out.println("La tabla equipo ha sido modificada");
								      ResultSet rs2 = st2.executeQuery("SELECT * FROM equipo");
								      conn1.close();
								
								break;
							case 3:
								Connection conn3 = Conexion.conectar();
								Statement st3 = conn3.createStatement();
								System.out.println("Has cogido la opcion de eliminar tabla");
								st3.executeUpdate("DELETE jugadores WHERE id = 4;");
								st3.executeUpdate("DELETE equipo WHERE id = 2;");

							    conn3.close();
								
								break;
							}while (!salir);
							}
							while (!salir);
							
						

						} catch (Exception e) {
							 e.printStackTrace();
						} 
				
						break;
					case 2:
						
						break;
						
					case 3:
						System.out.println("Has elegido eliminar todos los datos almacenados.");
						Connection conn4 = Conexion.conectar();
						
						break;
						
					case 4:
						break;
						
					case 5:
						break;
						
					case 6:
						break;
						
					
					case 7:
						salir = true;
						System.out.println("Has elegido salir del programa.");
						System.out.println("ADIOS.");
						break;
					default:
						System.out.println("Solo puedes poner los numeros 1,2,3,4,5,6,7.");
					}
				} while (!salir);
	    }
}


