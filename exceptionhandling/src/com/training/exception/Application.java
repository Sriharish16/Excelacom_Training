package com.training.exception;

public class Application {

	public static void main(String[] args) {

		Customer InvObj= new Customer(123,"Sriharish",98765432,"cyberwarrior@gmail.com");
		
		InvObj.getMessage();
	}

}
