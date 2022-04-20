package com.training1;

import com.training.*;
import static java.util.stream.Collectors.*;
import java.util.*;
import java.util.stream.*;


public class HandleDuplicates {

	public static void main(String[] args) {

		List<Integer>ageList=Arrays.asList(45,55,65,78,55,80,45);
		
		Set<Integer>filtered=new HashSet<>();
		
		List<Integer>list= ageList
				.stream()
				.filter(e->!filtered.add(e))
				.collect(toList());
		
		System.out.println(list);
		
	}


}
