package com.add.ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		
		BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost/test");
        ds.setUsername("root");
        ds.setPassword("password");


        ds.setMinIdle(5);
        ds.setMaxIdle(10);
	}

}
