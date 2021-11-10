package com.add.ejercicio4;

import java.sql.*;
import java.util.*;

import com.sun.jdi.connect.spi.Connection;

public class EstudianteDAO implements InterEstudianteDAO {
	
	@Override
	public boolean registrar(Estudiante estudiante) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO cliente values (NULL,'"+estudiante.getModulo()+"','"+estudiante.getNombre()+"','"+estudiante.getApellidos()+"')";
		
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	@Override
	public List<Estudiante> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM CLIENTE ORDER BY ID";
		
		List<Estudiante> listaCliente= new ArrayList<Estudiante>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Estudiante c=new Estudiante();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellidos(rs.getString(3));
				c.setModulo(rs.getString(4));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaCliente;
	}
 
	@Override
	public boolean actualizar(Estudiante estudiante) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE CLIENTE SET cedula='"+estudiante.getModulo()+"', nombres='"+estudiante.getNombre()+"', apellidos='"+estudiante.getApellidos()+"'" +" WHERE ID="+estudiante.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	@Override
	public boolean eliminar(Estudiante estudiante) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM CLIENTE WHERE ID="+estudiante.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}

	@Override
	public void insert(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Estudiante read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll() {
		// TODO Auto-generated method stub
		return false;
	}
 
}