package com.training1.Jdbc_Test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

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
       
//        	Customer custom =new Customer(119, "preethi", 98273, 600);
//			LoanApplication loan=new LoanApplication(4, custom, 2000);
//		 service.add(loan) ;

        	
        //	service.findById(1);
        	//System.out.println(customer1);
       
    service.findAll().forEach(System.out::println);
      
  
        
    }catch(SQLException e) {
    	e.printStackTrace();
    }
}

    }

