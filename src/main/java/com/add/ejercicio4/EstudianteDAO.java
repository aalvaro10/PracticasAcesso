package com.add.ejercicio4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.Connection;

public class EstudianteDAO implements InterEstudianteDAO {
	
	Estudiante est = new Estudiante();
	Credenciales bd= new Credenciales();
	List<Estudiante> data = new ArrayList<>();
	String sql="";
	PreparedStatement pst;
	ResultSet rs;
	Connection con;

	@Override
	public void insert(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}