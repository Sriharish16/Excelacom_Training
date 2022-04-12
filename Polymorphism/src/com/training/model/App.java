package com.training.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App extends Book {

	public static void main(String[] args) {
		
		
		List<String> names= new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Raju");
		names.add("Pava");
		
		System.out.println((names));

		Collections.sort(names);
		System.out.println((names));
		
//		Book java= new Book(101,"java", "Sri",550);
//		Book spring= new Book(102,"Spring", "brock",650);
//		Book python= new Book(103,"Python", "roman",750);
//		Book maven= new Book(104,"Maven", "taker",850);
//		Book html= new Book(105,"Html", "triple H",950);
//		
//		CrudRepository service =new BookService();
//		System.out.println("Is Added:"+service.add(java));
//		service.add(spring);
//		service.add(maven);
//		service.add(html);
//		service.add(python);
//		
//		List<Book>bookList=service.findAll();
//		Collections.sort(bookList);;
//		System.out.println(bookList);
		
//		
//		
//Collections.sort(bookList, new BookNameComparator());
//System.out.println("Sort by Book Name:");
//
//print(bookList);
//	}
	}
}
