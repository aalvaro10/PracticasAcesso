package com.add.ejercicio4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.add.ejercicio4.Vista; 

public class PatronDAOEjercicio2 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Estudiante> Estudiante = new ArrayList();
		//try {
			
			Estudiante.insert(new Estudiante(1, "Julia","Garcia","DAM"));
			Estudiante estudiante2= new Estudiante(2, "Javier","Fuentes","DAW");
			Estudiante estudiante3= new Estudiante(3, "Julia","Rodriguez","ASIR");
			Estudiante estudiante4= new Estudiante(4, "Jacobo","Ruiz","SMR");
			
			EstudianteDAO est= new EstudianteDAO();
			est.createTable();
			
			System.out.println("Mostrara el numero de filas insertadas");
			for (int i=0; i<Estudiantes.size(); i ++) {
				prueba.insert(Estudiantes.get(i));
			}
			
			System.out.println("");
			System.out.println("Estos son los estudiantes");
			System.out.println(prueba.findAll());
			
			System.out.println("");
			System.out.println("Modificacion hecha");
			System.out.println(prueba.update(Estudiantes.get(1)));
			
			System.out.println("");
			System.out.println("Muestra el estrudiante por su nombre");
			System.out.println(prueba.findByName("Javier"));
			
			System.out.println("");
			System.out.println("Borra el estudiante por su ID");
			System.out.println(prueba.deleteByID(2));
			
			System.out.println("");
			System.out.println("Lista actualizada");
			System.out.println(prueba.findAll());
			
			Estudiante.insert(new Estudiante(5, "Jonh","Romer","TAE"));
			System.out.println("Nuevo estudiante añadido");
			prueba.insert(Estudiantes.get(5));
			
			System.out.println("");
			System.out.println("Mostrar estudiante por ID");
			System.out.println(prueba.read(146));
			
			System.out.println("");
			System.out.println("Lista actualizada");
			System.out.println(prueba.findAll());
			
			System.out.println("");
			System.out.println("Borrar todos los registros");
			System.out.println(prueba.removeAll());
			
			
			
			
			
			
			
}
}