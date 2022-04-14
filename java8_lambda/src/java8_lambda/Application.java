package java8_lambda;

import java8_lambda.CurrencyConverter;
import java8_lambda.Converter;

public class Application {
	
	
	public static void print(Converter<Double,Double>conv) {
		System.out.println(conv.convert(100.00));
		
	}

	public static void main(String[] args) {

		Converter<Double, Double>obj= new CurrencyConverter();
		
		System.out.println(obj.convert(50.0));
		
		Converter<Double, Double>lambda=(val)->val*200.0;
		System.out.println(lambda.convert(20.0));
		
		
		System.out.println(lambda.convert(40.3));
		
		
		Converter<String, Integer>strLength=(str)->str.length();
		System.out.println(strLength.convert("Chennai"));
		
		
	}

}
