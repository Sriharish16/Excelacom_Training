package com.example;
import java.io.File;
public class Application {

	public static void main(String[] args) {
		
		Book java=new Book(1001,"Bala guru Java","rsfsfsak",7990);
		
		BookService service= new BookService();
		
		boolean result=service.writeToFile(new File("books.txt"), java);
//		
//		
		if(result)
		{
			System.out.println("one record added to file");
		}
//         service.readFromFile(new File("Book.txt"))
//               .forEach(System.out::println);
	}

}
	

