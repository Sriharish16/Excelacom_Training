package com.training.model;

import java.util.List;

import com.training.model.Book;

public interface CrudRepository {
	
	public boolean add(Book book);
	public Book findById(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book book);
	public Book update(Book oldBook,Book recentBook);

}
