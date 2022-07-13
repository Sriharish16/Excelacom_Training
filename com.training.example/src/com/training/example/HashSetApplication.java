package com.training.example;

import java.util.HashSet;
import java.util.*;

public class HashSetApplication {

	public static void main(String[] args) { 
		
		Student  ram=new Student(101,"ram",78);
		Student shyam = new Student(102, "shyam", 68);
		Student magesh=new Student(103,"Magesh",88);
		Student chinnaMagesh = new Student(103,"Magesh",88);
		
		Set<Student> set= new HashSet<>();
		
		set.add(magesh);
		set.add(chinnaMagesh);
		set.add(shyam);
		set.add(ram);
		                 
		System.out.println(set);
		
		System.out.println(set.size());
		
	
	}

}
