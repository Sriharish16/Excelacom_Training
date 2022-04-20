package com.example.model;

public class SecondApplication extends Student {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student shyam=new SecondApplication();
		shyam.setRollNumber(1010);
		shyam.setMarkScored(1200);
		shyam.setFirstName("Shyam");
		shyam.setBranch("Musiri");
		System.out.println(shyam.getRollNumber());
		System.out.println(shyam.getMarkScored());
		System.out.println(shyam.getFirstName());
		System.out.println(shyam.getBranch());
	}

}
