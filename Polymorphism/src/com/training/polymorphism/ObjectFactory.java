package com.training.polymorphism;

public class ObjectFactory {
	
	public Conditional getConditional(int key) {
		switch(key) {
		case 1:
			return new Professor("phd");
			
		case 2:
			return new Student(89);
			
		case 3:
			return new Principal("Government");
			
		default:
			return null;
			
		}
	}
public double getValue(Conditional Obj, Object value ) {

boolean result = Obj.test(value);

double travelAllowance =1000;


if(result) {
	travelAllowance =2000;
}

return travelAllowance;
}

}
