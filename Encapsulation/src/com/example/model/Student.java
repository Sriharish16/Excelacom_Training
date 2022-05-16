package com.example.model;

public class Student {
	
	private int rollNumber;
	private String firstName;
	private String Branch;
	private double markScored;
	private String branch;
	public int getRollNumber() {
		return rollNumber;
	}
	void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		
		if(markScored<0) {
			throw new RuntimeException(" Mark should be Positive Integer");
		}else {
			
		}
		this.markScored = markScored;
	}


	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		this.Branch = branch;
	
	}
	public Student() {
		super();
		if(markScored<0) {
			throw new RuntimeException("Marked Scored should be posittive");
		}
		else {
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}
	}
	
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,99,branch);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}                                                                                                                                   

}
