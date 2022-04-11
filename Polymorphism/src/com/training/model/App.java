package com.training.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		List<String> names= new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Raju");
		names.add("Pava");
		
		System.out.println((names));

		Collections.sort(names);
		System.out.println((names));

		
		// TODO Auto-generated method stub

	}

}
