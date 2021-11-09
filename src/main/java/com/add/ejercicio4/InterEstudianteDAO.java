package com.add.ejercicio4;

import java.util.List;

public interface InterEstudianteDAO {
	
	public void insert(Object t);
	public boolean update(Object t);
	public boolean deleteById(Integer id);
	public Object read(Integer id); 
	public List<Object> findAll();
	public List<Object> findByName(String name);
	public boolean removeAll();

} 
