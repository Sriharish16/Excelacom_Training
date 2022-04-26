package com.example;

import java.sql.*;
import java.util.Optional;

import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
	Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");

	ProductService service = new ProductService(con);
	
//	Product toAdd = new Product(107,"washing machine",64647.00);
//	int rowAdded= service.addProduct(toAdd);
//  System.out.println("Row added:="+rowAdded);
	
//	int deleteById = service.deleteById(10);
//	System.out.println(deleteById);	
	service.findAll().forEach(System.out::println);
	
//	int rowsUpdated = service.updatePriceByname(106, 1000);
//	System.out.println("Rows Updated:"+ rowsUpdated);
	
	service.updatePriceByname("TVB", 1500);
   service.findAll().forEach(System.out::println);
//	Optional<Product>found= service.findById(104);
//	if(found.isPresent()) {
//		System.out.println("++++++++");
//		System.out.println(found.get());
//	}
//	else
//	System.out.println("Value not found");
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
