package com.training.services;

import javax.management.RuntimeErrorException;

public class Student {
	
	private int rollNumber;
	private String firstName;
	private double markScored;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNumber, String firstName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
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
		
		if (markScored<0) {
			throw new RuntimeException("Mark should be greater than zer0");
		}else {
		
			this.markScored = markScored;
		}
	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}
	
	
	
	

}
