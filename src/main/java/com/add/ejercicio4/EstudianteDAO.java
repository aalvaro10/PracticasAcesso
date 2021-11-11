package com.add.ejercicio4;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class EstudianteDAO implements InterEstudianteDAO {
	
	public void insert(Estudiante estudiante) {
		try {			
			Connection conn=Conexion.conectar();
			Statement stm= conn.createStatement();
			stm.execute("INSERT INTO estudiantes values ('"+estudiante.getId()+"','"+estudiante.getNombre()+"','"+estudiante.getApellidos()+"','"+estudiante.getModulo()+"')");
			stm.close();
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean update(Estudiante estudiante) {
		boolean update=false;		
		try {
			Connection conn=Conexion.conectar();
			Statement stm=conn.createStatement();
			stm.execute("UPDATE estudiantes SET nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellidos()+"', modulo='"+estudiante.getModulo()+"'" +" WHERE ID="+estudiante.getId());
			update=true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
		return update;
	}

	@Override
	public boolean deleteById(Integer id) {
		boolean eliminar=false;	
		try {
			Connection conn=Conexion.conectar();
			Statement stm=conn.createStatement();
			stm.execute("DELETE FROM estudiantes WHERE ID= "+ id);
			eliminar=true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
		return eliminar;
	}
	
	public Estudiante read(Integer id) {
		Estudiante estudiante = new Estudiante();
		try {
			Connection conn=Conexion.conectar();
			Statement stm=conn.createStatement();
			ResultSet rs= stm.executeQuery("SELECT * FROM estudiantes WHERE id ='"+id+"'");
			while (rs.next()) {
				estudiante.setId(id);
				estudiante.setNombre(rs.getString("nombre"));
				estudiante.setApellidos(rs.getString("apellido"));
				estudiante.setModulo(rs.getString("modulo"));
			}
		}	
		catch (SQLException e) {
			e.printStackTrace();
		}
		return estudiante;
	}

	@Override
	public List<Estudiante> findAll() {
		List<Estudiante> listaEstudiantes= new ArrayList<Estudiante>();
		try {
			Connection conn=Conexion.conectar();
			Statement stm=conn.createStatement();
			ResultSet rs= stm.executeQuery("SELECT * FROM estudiantes");
			while (rs.next()) {
				Estudiante estudiante=new Estudiante();
				estudiante.setId(rs.getInt("id"));
				estudiante.setNombre(rs.getString("nombre"));
				estudiante.setApellidos(rs.getString("apellido"));
				estudiante.setModulo(rs.getString("modulo"));
				listaEstudiantes.add(estudiante);
			}
			stm.close();
			rs.close();
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return listaEstudiantes;
	}

	@Override
	public List<Estudiante> findByName(String name) {
		List<Estudiante> listaEstudiantes= new ArrayList<Estudiante>();
		try {
			Connection conn=Conexion.conectar();
			Statement stm=conn.createStatement();
			ResultSet rs= stm.executeQuery("SELECT * FROM estudiantes WHERE nombre ='"+name+"'");
			while (rs.next()) {
				Estudiante estudiante=new Estudiante();
				estudiante.setId(rs.getInt("id"));
				estudiante.setNombre(rs.getString("nombre"));
				estudiante.setApellidos(rs.getString("apellido"));
				estudiante.setModulo(rs.getString("modulo"));
				listaEstudiantes.add(estudiante);
			}
			stm.close();
			rs.close();
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return listaEstudiantes;
	}

	@Override
	public boolean removeAll() {	
		boolean eliminar=false;
		try {
			Connection conn=Conexion.conectar();
			Statement stm=conn.createStatement();
			stm.execute("DELETE FROM estudiantes");
			eliminar=true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
		return eliminar;
	}
}