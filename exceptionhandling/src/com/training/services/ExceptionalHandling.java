package com.training.services;

public class ExceptionalHandling {
	
	public void usingArrayIndexException(String[]args ) {
	
		
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Methos requires three values to be passed [a,b,c]");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void usingNumberFormatException(String value)
		{
			int age=0;
			try {
				age=Integer.parseInt(value);
			} catch(NumberFormatException e) {
				System.out.println("String Value cannot be wrapped");
			}
			System.out.println(age);
		}
		
		
	

}