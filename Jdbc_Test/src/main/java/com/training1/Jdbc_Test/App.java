package com.training1.Jdbc_Test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.training.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection con;
        try {
        	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
        	CustomerRepositry service= new CustomerRepositry(con);
       
        	service.findAll().forEach(System.out::println);
    //  System.out.println(con);
       
   
      
  
        
    }catch(SQLException e) {
    	e.printStackTrace();
    }
}

    }

