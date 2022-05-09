package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity1.Product;
import com.example.demo.repos.ProductRepositry;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringJdbcApplication.class, args);
		
		
		ProductRepositry repo=ctx.getBean(ProductRepositry.class);
		
		Product tv= ctx.getBean(Product.class);
		//System.out.println("Row Added:="+repo.add(tv));
	//	repo.findAll().forEach(System.out::println);
		
System.out.println(repo.findById(210));	//repo.remove(id)

repo.remove(100);

System.out.println("Successfully Removed");

Product watch=ctx.getBean(Product.class);
System.out.println("row updated:"+watch);
repo.findAll().forEach(System.out::println);
	}
	
//	@Bean
//	public Product tv() {
//		return new Product(204,"Sggs",59000);
//	}
	
	@Bean
	public Product watch()
	{
		return new Product(106,"microwave",878);
	}
	

}
