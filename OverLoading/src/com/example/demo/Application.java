package com.example.demo;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name:");
		
		String name=sc.next();
		
		System.out.println("Enter the Farenheit Temp");
		
		double farenTemp=sc.nextDouble();
		
		Converter convObj=new Converter();
		
		System.out.println(convObj.convert(name));
		System.out.println("Celsius is"+convObj.convert(farenTemp));
		
		System.out.println("Enter the amt:");
		double amt=sc.nextDouble();
		System.out.println("Enter the frm:");
		int frm=sc.nextInt();
		
		System.out.println(convObj.convert(amt,frm));
		
		sc.close();

	}

}
