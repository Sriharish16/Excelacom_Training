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
	protected void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public String getBranch() {
		return Branch;
	}
	private void setBranch(String branch) {
		this.Branch = branch;
	
	}
	public Student(int rollNumber, String firstName, double markScored, String branch) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,99,branch);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}                                                                                                                                   

}
