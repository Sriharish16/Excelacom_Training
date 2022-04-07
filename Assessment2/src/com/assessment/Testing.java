package com.assessment;
import com.assessment.*;


public class Testing {

	public static void main(String[] args) {
		
		Address address=new Address(122,"Trichy","KK Nagar");
		MobileBill sc=new MobileBill("Ram", 65656, "Postpaid",address);
		
		System.out.println("the amount:"+sc.findAmount());

	}

}
