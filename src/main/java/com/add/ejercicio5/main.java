package com.add.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

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
					System.out.println("1- Creacion de estructuras con sentencias DDL");
					System.out.println("5- Salir ");
					System.out.println("");
					System.out.print("Pon un numero del 1 al 5: ");
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
								System.out.println("Has cogido la opcion1");
								break;
							case 2:
								System.out.println("Has cogido la opcion1");
								break;
							case 3:
								System.out.println("Has cogido la opcion1");
								break;
							}
							}
							while (!salir);
							
						

						} catch (Exception e) {
							 e.printStackTrace();
						} 
				
						break;
					case 2:
						try {
							FileReader fichero = new FileReader("C:\\Users\\Familia\\Downloads\\quijote.txt");
							FileWriter copia = new FileWriter("C:\\Users\\Familia\\Downloads\\quijote_backup.txt");
							System.out.println("Has hecho una copia.\n");

							while ((c = fichero.read()) != -1) {
								copia.write(c);
							}
							copia.close();

						} catch (FileNotFoundException e) {
							 e.printStackTrace();
						} catch (IOException ex) {
							 ex.printStackTrace();

						}
						break;
					case 5:
						salir = true;
						System.out.println("Has elegido salir del programa.");
						System.out.println("ADIOS.");
						break;
					default:
						System.out.println("Solo puedes poner los numeros 1,2,3,4,5.");
					}
				} while (!salir);
	    }
}


