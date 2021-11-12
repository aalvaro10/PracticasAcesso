package com.add.ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public class Ejercicio2 {
	public static void main(String[] args) throws SQLException {
		
		String basedatos = "aadu2";
	    String host = "localhost";
	    String port = "3306";
	    String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
	    String user = "root";
	    String pwd = "elfutbol10";
	    
	    Connection conn = DriverManager.getConnection(urlConnection, user, pwd);
	    Statement st = conn.createStatement();
	
		
		BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost/test");
        ds.setUsername("root");
        ds.setPassword("root123");


        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        
        try {
        	
        	ds.close();
        	conn.close();
        	
        } catch (Exception e) {
			 e.printStackTrace();
	}

}
}
