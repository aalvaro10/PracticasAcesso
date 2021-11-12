package com.add.ejercicio4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.add.ejercicio4.Vista; 

public class PatronDAOEjercicio2 {
	
	
	public static void main(String[] args) throws SQLException {
		
		ArrayList<Estudiante> Estudiante = new ArrayList();
		//try {
		Connection conn = Conexion.conectar();
		Statement st = conn.createStatement();
		
		st.execute("DROP TABLE IF EXISTS estudiantes");
		st.execute("CREATE TABLE IF NOT EXISTS estudiantes("
				+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"
				+ "nombre varchar(50),"
				+ "apellido varchar(50),"
				+ "modulo varchar(50),"
				+ "PRIMARY KEY (id));");	
		
			Estudiante estudiante1 =new Estudiante(1, "Julia","Garcia","DAM");
			Estudiante estudiante2= new Estudiante(2, "Javier","Fuentes","DAW");
			Estudiante estudiante3= new Estudiante(3, "Julia","Rodriguez","ASIR");
			Estudiante estudiante4= new Estudiante(4, "Jacobo","Ruiz","SMR");
			
			
			Controlador est= new Controlador();
			
	
			est.insert(estudiante1);
			est.insert(estudiante2);
			est.insert(estudiante3);
			est.insert(estudiante4);
			
			System.out.println("");
			System.out.println("Estos son los estudiantes");
			est.findAll();
			
			System.out.println("");
			estudiante2.setModulo("DAW");
			est.update(estudiante2);
			System.out.println("Modificacion hecha");
			
			System.out.println("");
			System.out.println("Muestra el estrudiante por su nombre");
			est.findByName("Javier");
			
			System.out.println("");
			System.out.println("Borra el estudiante por su ID");
			est.deleteById(2);
			
			System.out.println("");
			System.out.println("Lista actualizada");
			est.findAll();
			
			Estudiante estudiante5= new Estudiante(5, "John","Romero","TAE");
			
			est.insert(estudiante5);
			System.out.println("Nuevo estudiante añadido");
			
			System.out.println("");
			System.out.println("Mostrar estudiante por ID");
			est.read(5);
			
			System.out.println("");
			System.out.println("La lista ha sido actualizada");
			est.findAll();
			
			System.out.println("");
			System.out.println("Se han borrado todos los registros");
			est.removeAll();
			
			
			
			
			
			
			
}
}