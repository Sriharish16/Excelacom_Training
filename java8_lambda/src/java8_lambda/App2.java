package java8_lambda;

import java.util.List;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.*;

public class App2 {

	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		
		Predicate<String>str=(value)->value.startsWith("S");
		Consumer<String>str1=(value1)->{if(str.test(value1)) {System.out.println(value1);}};
		names.forEach(str1);
	//	System.out.println(str);
		
//		for(String eachName:names){
//			System.out.println(eachName);
//		}
		
	//	names.forEach(value->System.out.println(value));
	//	names.forEach(System.out::println);
	}
}
