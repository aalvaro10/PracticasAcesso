package com.add.ejercicio5;

public class Equipo {
	
	int id;
	String nombre_equipo;
	int pts;
	String abreviacion;
	
	public Equipo() {
	
	}
	
	
	public Equipo(int id, String nombre_equipo, int pts, String abreviacion) {
		super();
		this.id = id;
		this.nombre_equipo = nombre_equipo;
		this.pts = pts;
		this.abreviacion = abreviacion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre_equipo() {
		return nombre_equipo;
	}


	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}


	public int getPts() {
		return pts;
	}


	public void setPts(int pts) {
		this.pts = pts;
	}


	public String getAbreviacion() {
		return abreviacion;
	}


	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}


	@Override
	public String toString() {
		return this.id+", "+this.nombre_equipo+", "+this.pts+", "+this.abreviacion;
	
	
	}
}


