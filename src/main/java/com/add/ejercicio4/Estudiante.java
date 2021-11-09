package com.add.ejercicio4;

public class Estudiante {
	
	int id;
	String nombre;
	String apellidos;
	String modulo;
	
	public Estudiante() {
	
	}
	
	
	public Estudiante(int id, String nombre, String apellidos, String modulo){
		this.id = id;
		this.nombre=nombre;
		this.apellidos= apellidos;
		this.modulo = modulo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getModulo() {
		return modulo;
	}


	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	
	}


