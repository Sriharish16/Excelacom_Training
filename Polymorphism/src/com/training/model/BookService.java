package com.training.model;

import java.util.List;
import java.util.ArrayList;

public class BookService implements CrudRepository {
	
	private ArrayList<Book>bookList;


	public BookService() {
		super();
		this.bookList=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Book book) {
		
//		boolean result=bookList.add(book);
//		return result;
		return bookList.add(book);
		
	}

	@Override
	public Book findById(int id) {
		Book found=null;
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
				found=eachBook;
		}
		}
		return found;	}

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

	@Override
	public Book update(Book book) {
		if(this.bookList.contains(book)) {
			//System.out.println("Inside If block ##########################");
			
		}else {
			//System.out.println("Inside Else Block #####################");
			add(book);
		}
		return null;
	}

	public Book update(Book oldBook, Book newBook) {
		
		if(this.bookList.contains(oldBook)) {
			int idxPos=this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, newBook);
			
		}
		return newBook;
		
	}
}
