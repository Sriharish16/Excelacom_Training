package com.training.model;

public class HealthInsurance extends Insurance {
	
	private String[] preExistingDiseases;

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(int policyNumber, String policyHolderName, double premium, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName, premium);
		this.preExistingDiseases = preExistingDiseases;
	}

	@Override
	public double calculatePremium() {
		
		double premium =10000;
		for(String eachItem :preExistingDiseases) {
//			String Item=eachItem.toLowerCase();
			if(eachItem.equalsIgnoreCase("bp")|| eachItem.equals("Sugar")) {
				premium=15000;
			}
		}
		// TODO Auto-generated method stub
		return premium;
	}

	
	
}
