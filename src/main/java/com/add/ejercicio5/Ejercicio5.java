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

public class Ejercicio5 {
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
	            boolean salir = false;
				int opcion;
				Scanner sc = new Scanner(System.in);
				int c;
				do {
					System.out.println("-- Estas son las opciones que puedes hacer -- \n");
					System.out.println("1- Eliminar el fichero");
					System.out.println("2- Hacer una copia de seguridad");
					System.out.println("3- Salir \n");
					System.out.println("Pon un numero del 1 al 3: ");
					opcion = sc.nextInt();

					switch (opcion) {
					case 1:
						try {
							File Eliminar = new File("C:\\Users\\Familia\\Downloads\\quijote.txt");
							System.out.println("Has eliminado el fichero \n");
							System.out.println(Eliminar.delete());

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
					case 3:
						salir = true;
						System.out.println("Final del programa.");
						break;
					default:
						System.out.println("Solo puedes poner los n�meros 1,2,3.");
					}
				} while (!salir);
	    }catch (Exception e) {
	         e.printStackTrace();
	    }
}

}
