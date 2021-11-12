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
			Statement st= conn.createStatement();
			st.execute("INSERT INTO estudiantes values ('"+estudiante.getId()+"','"+estudiante.getNombre()+"','"+estudiante.getApellidos()+"','"+estudiante.getModulo()+"')");
			st.close();
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
			Statement st=conn.createStatement();
			st.execute("UPDATE estudiantes SET nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellidos()+"', modulo='"+estudiante.getModulo()+"'" +" WHERE ID="+estudiante.getId());
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
			Statement st=conn.createStatement();
			st.execute("DELETE FROM estudiantes WHERE ID= "+ id);
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
			Statement st=conn.createStatement();
			ResultSet result= st.executeQuery("SELECT * FROM estudiantes WHERE id ='"+id+"'");
			while (result.next()) {
				estudiante.setId(id);
				estudiante.setNombre(result.getString("nombre"));
				estudiante.setApellidos(result.getString("apellido"));
				estudiante.setModulo(result.getString("modulo"));
			}
		}	
		catch (SQLException e) {
			e.printStackTrace();
		}
		return estudiante;
	}

	@Override
	public List<Estudiante> findAll() {
		List<Estudiante> estudiantes= new ArrayList<Estudiante>();
		try {
			Connection conn=Conexion.conectar();
			Statement st=conn.createStatement();
			ResultSet result= st.executeQuery("SELECT * FROM estudiantes");
			while (result.next()) {
				Estudiante estudiante=new Estudiante();
				estudiante.setId(result.getInt("id"));
				estudiante.setNombre(result.getString("nombre"));
				estudiante.setApellidos(result.getString("apellido"));
				estudiante.setModulo(result.getString("modulo"));
				estudiantes.add(estudiante);
			}
			st.close();
			result.close();
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return estudiantes;
	}

	@Override
	public List<Estudiante> findByName(String nombree) {
		List<Estudiante> estudiantes= new ArrayList<Estudiante>();
		try {
			Connection conn=Conexion.conectar();
			Statement st=conn.createStatement();
			ResultSet result= st.executeQuery("SELECT * FROM estudiantes WHERE nombre ='"+nombree+"'");
			while (result.next()) {
				Estudiante estudiante=new Estudiante();
				estudiante.setId(result.getInt("id"));
				estudiante.setNombre(result.getString("nombre"));
				estudiante.setApellidos(result.getString("apellido"));
				estudiante.setModulo(result.getString("modulo"));
				estudiantes.add(estudiante);
			}
			st.close();
			result.close();
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return estudiantes;
	}

	@Override
	public boolean removeAll() {	
		boolean eliminar=false;
		try {
			Connection conn=Conexion.conectar();
			Statement st=conn.createStatement();
			st.execute("DELETE FROM estudiantes");
			eliminar=true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
		return eliminar;
	}
}