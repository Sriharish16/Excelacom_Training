package com.training;

import java.util.function.*;



public interface Conditional<T> {
	
	public boolean test(T t);
	
	default boolean negate(Double value) {
		
		return value<=80.0;
		
	}
	
	public static String getMessage() {
		
		return"HI from static method in interface";
	
	}

}
