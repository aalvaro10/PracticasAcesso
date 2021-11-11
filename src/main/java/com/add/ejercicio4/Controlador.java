package com.add.ejercicio4;

import java.util.ArrayList;
import java.util.List; 


public class Controlador {
	
private Vista vista= new Vista();
	
	public Controlador() {
	}
	
		public void insert(Estudiante estudiante ) {
			InterEstudianteDAO dao= new  EstudianteDAO();
			dao.insert(estudiante);
		}
		
		public void update(Estudiante estudiante) {
			InterEstudianteDAO dao= new  EstudianteDAO();
			dao.update(estudiante);
		}
		
		public void deleteById(Integer id) {
			InterEstudianteDAO dao= new  EstudianteDAO();
			dao.deleteById(id);
		}
			
			
		public void read(Integer id) {
			InterEstudianteDAO dao= new  EstudianteDAO();
			vista.verEstudiante(dao.read(id));
		}
			
		public void findAll() {
			List<Estudiante> estudiantes = new ArrayList<Estudiante>();
			InterEstudianteDAO dao= new  EstudianteDAO();
			estudiantes=dao.findAll();
			vista.verEstudiantes(estudiantes);
		}
		
		public void findByName(String name) {
			List<Estudiante> estudiantes = new ArrayList<Estudiante>();
			InterEstudianteDAO dao= new  EstudianteDAO();
			estudiantes=dao.findByName(name);
			vista.verEstudiantes(estudiantes);
		}
		
		public void removeAll() {
			InterEstudianteDAO dao= new  EstudianteDAO();
			dao.removeAll();
		}
		
		//vita.verEstudainte read,
		//visat.verEstudaintes(estudiantes) find byname, findall
}
