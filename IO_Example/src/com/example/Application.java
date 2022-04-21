package com.example;
import java.io.File;
public class Application {

	public static void main(String[] args) {
		
//	Book java=new Book(1001,"Bala guru Java","rsfsfsak",7990);
//		
//		BookService service= new BookService();
//		
//	boolean result=service.writeToFile(new File("books.txt"), java);
//		
//	
//	if(result)
//		{
//			System.out.println("one record added to file");
//		}
//        service.readFromFile(new File("books.txt"))
//              .forEach(System.out::println);
		
		BookService service = new BookService();
		
		
		
			Book book = new Book(8847,"Oracle","Harish",560);

		
		File file = new File("book.ser");
		
		int ch=2;
		
		if(ch==1) {
		
		boolean result = service.writeToStream(file, book);
		
		if(result) {
			
			System.out.println("One Record serialized");
			
		}
		
		}
		
		else {
			Book fromFile = (Book) service.readFromStream(file);
			
		//	System.out.println(fromFile.getBookName());
			
			System.out.println(fromFile);
		}
	}

}


	

