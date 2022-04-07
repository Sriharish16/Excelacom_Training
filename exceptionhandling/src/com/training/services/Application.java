package com.training.services;
import java.util.*;

public class Application {

	public static void main(String[] args) throws Exception {

		
//		Student ram= new Student(1010,"Sriharish",-99);
//		ram.setMarkScored(6);
//		
//		StudentService service = new StudentService(ram);
//
//		
//		System.out.println(service.sendDetails());
//		
//	
//		StudentService service2=new StudentService();
//		try {
//		System.out.println(service2.findRank());
//		
//	}catch(Exception  e) {
//		System.err.println("Name is not passed");
//	}
	
		ExceptionalHandling exHandling= new ExceptionalHandling();
//		exHandling.usingArrayIndexException(args);
//		exHandling.usingNumberFormatException("Dog");
		System.out.println(exHandling.usingFinallyBlock());
		
		//Since we are using try with resource - Scanner will be closed
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter the Number:");
			int num =scan.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}


