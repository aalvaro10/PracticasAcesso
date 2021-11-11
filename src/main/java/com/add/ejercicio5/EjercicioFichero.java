package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioFichero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File quijote = new File("C:\\Users\\Familia\\Downloads\\quijote.txt");
		int c;

		if (quijote.exists()) {
				System.out.println("Este fichero existe.");
				System.out.println("Nombre del archivo: " + quijote.getName());
				System.out.println("Tamaño en bytes: " + quijote.length());
				System.out.println("Permisos de lectura: " + quijote.canRead());
				System.out.println("Permisos de escritura: " + quijote.canWrite());
				
			}
			else {
				System.out.println("Este fichero no existe");
			}

			if (quijote.isFile()) {
				System.out.println("Se trata de un fichero");
				System.out.println("\n");
			}
			if (quijote.isDirectory()) {
				System.out.println("Se trata de un directorio");
				System.out.println("\n");
			}

			boolean salir = false;
			int opcion;
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
					System.out.println("Solo puedes poner los números 1,2,3.");
				}
			} while (!salir);

		
	}
}
