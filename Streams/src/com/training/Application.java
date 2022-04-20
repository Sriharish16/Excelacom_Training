package com.training;

import java.util.List;
public class Application {

	public static void print(List<Book> books)
	{

for(Book eachBook:books)
{
	System.out.println(eachBook);
}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(104,"Maven","harish",550);
		Book html=new Book(107,"html","priya",1450);
		Book python=new Book(109,"python","sathya",850);
		
CrudRepository service=new BookService();

System.out.println(service.add(java));
service.add(spring);
service.add(maven);
service.add(html);
service.add(python);



//List<Book> bookList=service.findAll();
List<String>nameList=((BookService)service).getBookNames();
nameList.forEach(System.out::println);
System.out.println("===================================================================");
System.out.println("Greater Than");
List<String>bookList=((BookService)service).getBookNameGrtThanPrice(800);
bookList.forEach(System.out::println);


System.out.println("Sorted by number");

List<Book>bookList1=((BookService)service).sortedByName();
bookList1.forEach(System.out::println);

//System.out.println("Using Streams");
//
//((BookService)service)
//				.findBookGrtThan(100)
//							.forEach(System.out::println);
//
//print(service.findAll());
//System.out.println("Book found"+service.findById(101));
//
//service.remove(python);
//System.out.println("==================================================================");
//print(service.findAll());
//
//Book react=new Book(203,"reactjs","rahul",878);
//service.update(react);
//print(service.findAll());
//
//
//	} 

}}