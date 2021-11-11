package com.add.ejercicio5;

public class Jugador {
	int id;
	String nombre;
	String apellidos;
	String goles;
	
	public Jugador() {
	
	}
	
	
	public Jugador(int id, String nombre, String apellidos, String goles){
		this.id = id;
		this.nombre=nombre;
		this.apellidos= apellidos;
		this.goles = goles;
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
		return goles;
	}


	public void setModulo(String modulo) {
		this.goles = goles;
		
	}
	@Override
	public String toString() {
		return this.id+", "+this.nombre+", "+this.apellidos+", "+this.goles;
	
	
	}
}


