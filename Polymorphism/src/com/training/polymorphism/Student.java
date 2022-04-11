package com.training.polymorphism;

public class Student implements Conditional{
	
	public int markScored;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getMarkScored() {
		return markScored;
	}





	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}





	@Override
	public boolean test(Object value) {
		
		String strBranch= (String)value;
		boolean result =false;
		
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ECE")) {
			result=true;
		}
		
		return result;
	}





	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}

}
