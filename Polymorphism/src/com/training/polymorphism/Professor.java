package com.training.polymorphism;

public class Professor implements Conditional {

	private String qualification;
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public boolean test(Object value) {
		
		String strValue=(String)value;
		
		boolean result= false;
		if(strValue.equalsIgnoreCase("chennai")) {
			result=true;
		}
		
		// TODO Auto-generated method stub
		return result;
	}
	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
