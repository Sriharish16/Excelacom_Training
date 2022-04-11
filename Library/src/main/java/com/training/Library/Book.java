package com.training.Library;

public class Book {
	
	public String name;
	public String Author;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(String name, String author) {
		super();
		this.name = name;
		Author = author;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", Author=" + Author + "]";
	}
	
	
	
	

}
