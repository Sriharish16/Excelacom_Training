package com.training.Service;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;


//A class can only extend another class but it can implement one or more  interface

public class CurrencyConverter implements Function, CheckCondition{

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

}
