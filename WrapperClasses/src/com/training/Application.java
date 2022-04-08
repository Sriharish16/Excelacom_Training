package com.training;

public class Application {
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		int value=Integer.parseInt(args[0]);
//		++value;
//		System.out.println(++value);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		CurrencyConverter conv=new CurrencyConverter();
		double dblAmount=Double.parseDouble(args[0]);
		System.out.println(conv.inrTousd(dblAmount));
		
		double inrValue=Double.parseDouble(args[1]);
		System.out.println(conv.inrToeuro(inrValue));
		
		
}
	double salary=42500.0;
	int inSal=(int) salary;
	int age=42;
	String strAge=Integer.toString(age);
	int intage=Integer.valueOf(strAge);//converting to primitive type
	
	}
