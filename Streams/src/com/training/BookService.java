package com.training;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.*;

public class BookService implements CrudRepository {
	
	private ArrayList<Book> bookList;

	public BookService() {
		super();
		this.bookList=new ArrayList<Book>();

	}

	public List<Book>sortedByName(){
//		
//		return this.bookList.stream()
//				.sorted(Comparator.comparing(Book::getBookName))
//							.collect(toList());
		
		return this.bookList.stream().sorted(Comparator.reverseOrder()).collect(toList());
	}
	
	public List<String>getBookNames() {
		return this.bookList
							.stream().map(e->e.getBookName()).collect(toList());
	}
	
	public List<String>getBookNameGrtThanPrice(double price) {
		return this.bookList
				.stream()
				.filter(e->e.getPrice()>price)
				.map(e->e.getBookName())
						.collect(toList());
	}
	
	public List<Book>getBookGrtThan(double price){
		List<Book>grtThanList=new ArrayList<>();
		Predicate<Double>grtThan=(value)->value>price;
		return grtThanList;
	}
	
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		Book found=null;
		for(Book eachBook:this.bookList)
		{
			if(eachBook.getBookNumber()==id)
				 found=eachBook;
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}
	
	public Book update(Book book)
	{
		if(this.bookList.contains(book))
		{
			System.out.println("inside if block");
			
		}
		else
		{  System.out.println("add book:");
			add(book);
		}
		return null;
	}

}
