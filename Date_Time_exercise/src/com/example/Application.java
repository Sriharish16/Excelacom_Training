package com.example;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student ram=new Student(101,"Ram",LocalDate.of(1972, 10, 12),LocalDateTime.of(2000, Month.JUNE, 5, 9, 30));
	
	Student shyam = new Student(102,"Shyam",LocalDate.now(),LocalDateTime.now());
	
	
	System.out.println("Ram year of birth"+ram.getDateOfBirth().getYear());
	System.out.println("Rams First Birthday"+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
	
	System.out.println("Shyams year of Birthday"+shyam.getDateOfBirth().getYear());
	System.out.println("Shyams sixth Birthday"+shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
	
	
	System.out.println("Shyams previous Birthday"+shyam.getDateOfBirth().minus(2,ChronoUnit.MONTHS));
	
	
	
	
	
	

	
	
	
	}
	

}
