package com.training.LoggingWithLog4j;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

//import com.example.ProductService;
import com.training.MemberRepositry;

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
        	MemberRepositry service = new MemberRepositry(con);
        	
        	LocalDate date =LocalDate.of(2022, 4, 12);
        	Date sqlDate =Date.valueOf(date);
        	
        	LocalDate date2=sqlDate.toLocalDate();
        	
        	service.findAll().forEach(System.out::println);
       
       // System.out.println(con);
        
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
}
