package com.training2;

import java.sql.*;
import java.util.ResourceBundle;

public class ConnectionFactory {
	
	public static Connection getpostgresConnection() {
		
		Connection con= null;
		
		
		
		try {
			ResourceBundle labels=ResourceBundle.getBundle("application");
		
			//method 2
			con= DriverManager.getConnection(labels.getString("datasource.postgre.url"),
					labels.getString("datasource.postgre.username"),
					labels.getString("datasource.postgre.password"));
			
			
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	

}
