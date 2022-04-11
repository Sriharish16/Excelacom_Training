package com.training.polymorphism;

public class Principal implements Conditional {
	private String typeOfCollege;

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}

	@Override
	public boolean test(Object value) {
		
		String strLocation =(String)value;
		// TODO Auto-generated method stub
		boolean result=false;
		if(this.typeOfCollege.equals("Engg")&& strLocation.equals("rural")) {
			result= true;
			
		}
		return result;
	}

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

}
