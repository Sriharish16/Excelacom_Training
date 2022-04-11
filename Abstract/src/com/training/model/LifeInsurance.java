package com.training.model;

public  class LifeInsurance extends Insurance {
	
	private int Age;

	public LifeInsurance(int age) {
		super();
		Age = age;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public double calculatePremium() {
		double premium=0;
		if (Age<50) {
			premium = 5000;
		}else {
			premium = 10000;
		}
		// TODO Auto-generated method stub
		return premium;
	}

	public LifeInsurance(int policyNumber, String policyHolderName, double premium, int age) {
		super(policyNumber, policyHolderName, premium);
		Age = age;
	}
}
