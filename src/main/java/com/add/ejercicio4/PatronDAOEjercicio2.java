package com.add.ejercicio4;

public class PatronDAOEjercicio2 {
	
	public static void main(String[] args) {

		Estudiante estudiante = new Estudiante("1", "Elivar", "Largo", "DAW");			
		
		// controlador
		Controlador controller = new Controlador();
 
		// guarda un cliente a través del controlador
		controller.registrar(estudiante);
 
		// ver clientes
		controller.verClientes();
 
		// editar un cliente por medio del id
		estudiante.setId(1);
		estudiante.setNombre("Santiago");
		controller.actualizar(estudiante);
 
		// eliminar un cliente por medio del id
		estudiante.setId(1);
		controller.eliminar(estudiante);
		
			



	}
}
