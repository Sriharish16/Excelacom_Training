package com.training1;

/**
 * Hello world!
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	
	 public static void main( String[] args )
	    {
	 
	        
	        Connection con;
	        try {
	        	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
	        	MemberRepositry service= new MemberRepositry(con);
	       
	      // System.out.println(con);
	       
	    //  service.update(101, 5500);
	      
	      service.remove(101);
	      service.findAll().forEach(System.out::println);
	        
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
}