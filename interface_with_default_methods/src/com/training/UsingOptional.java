package com.training;

import java.util.Optional;

public class UsingOptional {
	
	public static  Optional<String>getValue(int key){
		Optional<String>response=Optional.empty();
		if(key==1) {
			response =Optional.of("Hi");
		}
		return response;
	}
	public static Object getString(int key) {
		
		switch(key) {
		
		case 1:
			
			return new String("chocobar");
			
		case 2:
			
		return new StringBuffer("cassatta");
		
		default :
			
			return null;
			
}
		
	}
	public static void main(String[]args) {
		
		//System.out.println(getString(3).toString());
	
	Optional<Object>optional=Optional.ofNullable(getString(3));
	if(optional.isPresent())
	{
		System.out.println("Value is Present"+optional.get());
	}
	else
	{
		System.out.println("Value is not Present");
		
	}
	
	System.out.println(optional.orElse("Vannila").toString());
	
//Optional<Object>opt1=Optional.ofNullable(getString(3));
//
//opt1.orElseThrow(
//		 ()->new RuntimeException("No Object for value try again"));
 //call the getvalue method by passing 1 as argument
 //call the same method again by passing 2 as argument
 //print the results
Optional<String>resp=getValue(1);
if(resp.isPresent()) 
{
	System.out.println(resp.get().toString());
	}
else{
		System.out.println("Invalid choice Enter 1");
	}
}
}
