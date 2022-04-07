package com.model;

import com.example.model.Student;

public class Application {
	public static void main(String[] args) {
		Student ram=new Student();
//		ram.setRollNumber(56020);
		//default method unable to access
		//because student class is in com.example.model.package
		//and Application is in com.example is in com.example.package
		
		
		//public method can access
		ram.setFirstName("Sriharish");
		
		//Unable to access because application is not a subclass of student
//		ram.setMarkScored(1200);
		
		//Unable to acces because it is private
//		ram.setBranch("Musiri");
		System.out.println("Roll Number:"+ram.getRollNumber());
		System.out.println("Name is:"+ram.getFirstName());
		System.out.println("Mark Scored"+ram.getMarkScored());
		System.out.println("Branch:"+ram.getBranch());
		
	}
	Student shyam=new Student(490,"Shyam", 89, "Mech");
	System.out.println(shyam.getRollNumber());