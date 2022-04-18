package com.training;

public class Application {

	public static void main(String[] args) {
		
		StudentResultService service= new StudentResultService();
		
		System.out.println("Is Pass:"+service.test(90.0));
		
		
		System.out.println("Is faliled:"+service.negate(101.000));
	
System.out.println(Conditional.getMessage());
	}

}
