package com.add.ejercicio4;

public class PatronDAOEjercicio2 {
	
	public static void main(String[] args) {

		Estudiante estudiante = new Estudiante("1", "Elivar");			
		
		// controlador
		Controlador contolador = new Controlador();
 
		// guarda un cliente a través del controlador
		contolador.insert(estudiante);
 
		// ver clientes
		contolador.verEstudiantes();
 
		// editar un cliente por medio del id
		estudiante.setId(1);
		estudiante.setNombre("Santiago");
		contolador.actualizar(estudiante);
 
		// eliminar un cliente por medio del id
		estudiante.setId(1);
		contolador.eliminar(estudiante);
		
			



	}
}
