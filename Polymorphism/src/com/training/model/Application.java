package com.training.model;

import java.util.List;

public class Application {

	public static void print(List<Book>books) {
		for(Book eachBook:books) {
			System.out.println(eachBook);
	}
	}
	
	public static void main(String[] args) {
		Book java= new Book(101,"java", "Sri",550);
		Book spring= new Book(102,"Spring", "brock",650);
		Book python= new Book(103,"Python", "roman",750);
		Book maven= new Book(104,"Maven", "taker",850);
		Book html= new Book(105,"Html", "triple H",950);
		
		CrudRepository service = new BookService();
		
		System.out.println("Is Added:"+service.add(java));
		service.add(spring);
		service.add(python);
		service.add(maven);
		service.add(html);
		
		
		List<Book> bookList=service.findAll();
		print(service.findAll());
		
		
		
		System.out.println("============================================================================================");
		
		
		Book foundBook=service.findById(102);
		System.out.println("Found Book"+foundBook);
		
		service.remove(python);
		
		System.out.println("=============================================================================================");
		List<Book>secondList=service.findAll();
		
		for(Book eachBook:secondList) {
			System.out.println(eachBook);
			
			System.out.println("========================================================================================");
			Book react=new Book(205,"ReactJS","Rahul",6950);
			service.update(react);
			print(service.findAll());
			
			service.update(react);
			
			Book reactNew=new Book(205,"ReactJS","Rahul Kanwal",7850);
			service.update(react,reactNew);
			System.out.println("======================After Update======================");
			print(service.findAll());
			
			
			Book javaNew= new Book(101,"java","Keerthy",1450);
			System.out.println("========================@=====After update=============");
			print(service.findAll());
		
			
			
		
	}
		
		
		
		}
		
	}
		
	


