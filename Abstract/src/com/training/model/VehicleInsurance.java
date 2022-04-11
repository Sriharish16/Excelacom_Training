package com.training.model;

public class VehicleInsurance extends Insurance {
	
	private String vehicleModel;
	private int yearOfManufacture;
	

	public VehicleInsurance() {
		super();
	}


	public VehicleInsurance(int policyNumber, String policyHolderName, double premium) {
		super(policyNumber, policyHolderName, premium);
	}


	@Override
	public double calculatePremium() {
		
		double premium =1000;
		if(yearOfManufacture<2020 && vehicleModel.equals("car")) {
			premium =2000;
		}
		return premium;
	}


	public VehicleInsurance(int policyNumber, String policyHolderName, double premium, String vehicleModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName, premium);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}


	public String getVehicleModel(){
		return vehicleModel;
	}


	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}


	public int getYearOfManufacture() {
		return yearOfManufacture;
	}


	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	

}
