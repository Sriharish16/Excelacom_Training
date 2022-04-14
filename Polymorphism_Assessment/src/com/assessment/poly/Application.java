package com.assessment.poly;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory = new ObjectFactory();

		Automobile mcObj=factory.getObject(1);
		factory.printQuote(mcObj);
		
		Automobile tcObj=factory.getObject(2);
		factory.printQuote(tcObj);
		
		System.out.println(tcObj.x);


	}

}
