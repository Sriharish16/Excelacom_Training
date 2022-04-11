package com.training.model;

import com.training.model.Insurance;
import com.training.model.VehicleInsurance;

public class Application {
	public  static void printPremium(Insurance object) {
		System.out.println(object.calculatePremium());
	}		
		
	
	
	public static void main(String[] args) {
		VehicleInsurance car= new VehicleInsurance(1010,"Ram",5.0,"car",2019);
		printPremium(car);
				

		LifeInsurance life=new LifeInsurance(1011, "harish", 6000, 50);
		printPremium(life);
		
		String[] illness= {"bp","sugar","tyroid"};
		HealthInsurance health= new HealthInsurance(3033,"Viky",5000,illness);
		printPremium(health);
}

}
	
	


