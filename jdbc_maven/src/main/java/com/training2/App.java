package com.training2;

import java.sql.*;

public class App {

	public static void main(String[] args) {
		
		Connection con;
		
			con=ConnectionFactory.getpostgresConnection();
		
			System.out.println(con);

	}

}
