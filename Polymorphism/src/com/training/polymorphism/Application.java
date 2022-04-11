package com.training.polymorphism;

public class Application {

	public static void main(String[] args) {

		ObjectFactory factory =new ObjectFactory();
		
		Conditional profObj = factory.getConditional(1);
		Conditional Object=factory.getConditional(2);
		Conditional Horse= factory.getConditional(3);
		System.out.println(profObj.test("Chennai"));
		System.out.println("Allowance:="+ factory.getValue(profObj,"Chennai"));
		System.out.println("Allowance:="+factory.getValue(Object, "90"));
		
	}

}
