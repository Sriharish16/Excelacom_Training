package com.training.polymorphism;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		Conditional Obj= super.getConditional(key);
		
		if(key==3)
			
		return super.getConditional(key);
	}

	@Override
	public double getValue(Conditional Obj, Object value) {
		
		
		// TODO Auto-generated method stub
		return super.getValue(Obj, value);
	}
	
	

}
