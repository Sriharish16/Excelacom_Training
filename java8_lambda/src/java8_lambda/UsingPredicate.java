package java8_lambda;

import java.util.*;
import java.util.function.*;

public class UsingPredicate {
	
	

	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		
		
	
		
//		
Predicate<String>containsChar =(country)->country.toUpperCase().startsWith("I");
//names.forEach((eachCountry)->{
//    if(containsChar.test(eachCountry))   {
//System.out.println(eachCountry);
//}
//}); 

		
		Consumer<String>consumer=(value)->{if(containsChar.test(value)) {System.out.println(value);}};
		names.forEach(consumer);
//		names.forEach((value)->System.out.println(value));
		
		
	}

}
