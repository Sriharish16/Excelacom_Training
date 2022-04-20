package com.training1;

import java.util.*;
import static java.util.stream.Collectors.*;
import com.training.*;

public class UsingStreams {
	
	public static void useDistinct(List<Book>bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
		
	}
	
	public static void collectToSet(List<Book>bookList) {
		
		Set<Book>bookSet=bookList.stream().filter(e->e.getPrice()>500).collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	public static void  collectToMap(List<Book>bookList) {
		
	//	Set<Book>bookSet=bookList.stream().collect(toSet());
		
		Map<String,Double>values=bookList.stream()
				.filter(e->e.getPrice()>500)
				.collect(toMap(Book::getBookName,Book::getPrice));
		
		
		
		values.forEach((key,value)->System.out.println(key+","+value));
		
	}
	
	public static void finMaxPrice(List<Book>bookList) {
		Optional<Book>optional= bookList.stream().max(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()){
			System.out.println("Maximum Price:="+optional.get().getPrice());
		}
	}
	
	public static void findmin(List<Book>bookList) {
		Optional<Book>optional=bookList.stream().min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Min Price:="+optional.get().getPrice());
		}
	}	
	public static void findcount(List<Book>bookList,String str) {
		long count=	bookList.stream().filter(e->e.getBookName().contains(str)).count();
		
		System.out.println(str+" occurs "+count+" times ");
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(104,"Maven","harish",550);
		Book html=new Book(107,"html","priya",1450);
		Book python=new Book(109,"python","sathya",850);
		Book mavenNew=new Book(104,"Maven","harish",550);
		Book htmlNew=new Book(107,"html","priya",1450);
		
		List<Book>bookList=Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
		
		
		int key=6;
		switch (key) {
		case 1:
			useDistinct(bookList);
			break;
			
		case 2:
			collectToMap(bookList);
			break;
			
		case 3:
			finMaxPrice(bookList);
			break;
			
		case 4:
			collectToSet(bookList);
			break;
			
		case 5:
			findmin(bookList);
			break;
		
		case 6:
			findcount(bookList,"v");
			break;
			
		
		default:
			break;
		}
	
	}

}
