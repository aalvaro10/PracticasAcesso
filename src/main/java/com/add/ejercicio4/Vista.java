package com.add.ejercicio4;

import java.util.List;

public class Vista {
	
	public void verEstudiante(Estudiante estudiante) {
		
		System.out.println("Estudiante: "+estudiante);
	}
	
	public void verEstudiantes(List<Estudiante> estudiantes) {
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Estudiante: "+estudiante);
		}		
	}
}
		
	