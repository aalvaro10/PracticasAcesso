package com.add.ejercicio4;

import java.util.ArrayList;
import java.util.List; 
import vista;
import InterEstudianteDAO;

public class Controlador {
	
private Vista vista= new Vista();
	
	public Controlador() {
	}
	
	//llama al DAO para guardar un cliente
	public void registrar(Estudiante estudiante ) {
		InterEstudianteDAO dao= new  EstudianteDAO();
		dao.insert(estudiante);
	}
	
	//llama al DAO para actualizar un cliente
	public void actualizar(Estudiante estudiante) {
		InterEstudianteDAO dao= new  EstudianteDAO();
		dao.actualizar(estudiante);
	}
	
	//llama al DAO para eliminar un cliente
	public void eliminar(Estudiante estudiante) {
		InterEstudianteDAO dao= new  EstudianteDAO();
		dao.eliminar(estudiante);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verClientes(){
		List<Estudiante> estudiante = new ArrayList<Estudiante>();
		InterEstudianteDAO dao= new  EstudianteDAO();
		estudiante=dao.obtener();
		vista.verEstudiante(estudiante);
	}
	

}
