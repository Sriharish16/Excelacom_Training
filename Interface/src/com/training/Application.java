package com.training;
import com.training.Service.CurrencyConverter;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.DiscountCalculator;
import com.training.ifaces.Function;

public class Application {

	public static void main(String[] args) {
		//subtype= new subtype
		//supertype= subtype
		Function funObj=new CurrencyConverter();
		
		double response =funObj.apply(200);
		System.out.println(response);
		
		//Line 11 and 12 are identical.
		System.out.println(funObj.apply(300));
		
		System.out.println(funObj.counter);
		
		CheckCondition ccObj= new CurrencyConverter();
		boolean  data= ccObj.test(5000);
		System.out.println(data);

		
		Conditional condObj=new DiscountCalculator();
		boolean data2=condObj.test(50000);
		boolean data1=condObj.negate(4000);
		System.out.println("Conditional:"+data1);
		System.out.println("Discount:"+data2);

	}

}
