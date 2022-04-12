package com.training;
import java.util.*;

import com.training.Student;

public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram =new Student(101,"Anand",78);
		Student shyam=new Student(102,"Basky",58);
		Student mukesh=new Student(103,"mugesh",65);
		
		HashMap<Integer, Student>map=new HashMap<>();
		
		
		map.put(900, ram);
		map.put(901,shyam);
		map.put(902, mukesh);
		
		System.out.println(map.get(900));
		System.out.println(map.get(901));
		System.out.println(map.get(902));
		
	//Using keyset method to get all keys together..	
	Set<Integer>keys=map.keySet();	
		
		for(Integer key:keys) {
			
			System.out.println(map.get(key));
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			//Using Collections method to get all Values to print the  Values
			Collection<Student>list=map.values();
			
			for(Student eachStudent:list) {
				
				System.out.println(eachStudent);
			}
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			//Together both the key and values, then use this....
			
			Set<Map.Entry<Integer, Student>>list2=map.entrySet();
			for(Map.Entry<Integer, Student>eachEntry :list2) {
				
				System.out.println(eachEntry.getKey());
				System.out.println(eachEntry.getValue());
			}
			
			
		}
		
		
//		Student added=map.put(901, mukesh);
//		
//		if(added!=null) {
//			map.put(904, added);
//			
//		}
//		System.out.println(map.get(901));
//		
//		System.out.println(map.get(904));
		

	}

}
