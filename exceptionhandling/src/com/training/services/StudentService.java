package com.training.services;

public class StudentService {
	
	private Student student;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	//Applying the Handle Rule of Exception Handling
	public String sendDetails() {
		
		String name =null;
		
	try {
		
		name=this.student.getFirstName();
		
	} catch(NullPointerException e) {
		
		System.out.println("Student Object is not passed check again");
	}
	return name;
	}
	
	//Applying the Declare rule of Exception Handling
public String findRank() throws NullPointerException  {
	
	String grade ="A";
	if(this.student.getMarkScored()>90) {
		
		grade="0";
		
	}
	return grade;
}

}
