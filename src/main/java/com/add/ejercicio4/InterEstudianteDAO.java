package com.add.ejercicio4;

public interface InterEstudianteDAO {
	
	public void insert(T t);
	public boolean update(T t);
	public boolean deleteById(Integer id);
	public T read(Integer id); 
	public List<T> findAll();
	public List<T> findByName(String name);
	public boolean removeAll();

}
