package com.training.services;

public class RangeCheckException extends ExceptionalHandling {
	
	private String message;

	public RangeCheckException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

	}


