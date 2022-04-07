package com.training1;



public class BankAccountService {

	private int rateOfInterest;

	public double calculateInterest(BankAccount account) {
		
		double simpleInterest =0.05;
		
		if(account.getAccountNumber()<=5000) {
			simpleInterest=0.06;
			
		}
		
		return account.getBalance()*1*simpleInterest;
	}
		
		//overloaded Method
		public void calculateInterest(BankAccount[] accounts) {
			
			for(BankAccount eachAccount : accounts) {
				
				System.out.println("Calulate Interest"+calculateInterest(eachAccount));
				
				
			}
			
		}
		
		public double[] findInterest(BankAccount[] accounts) {
			
			double[] values= new double[5];
			
			int i=0;
			
			for(BankAccount eachAccount:accounts) {
				
				values[i]=calculateInterest(eachAccount);
				
				i++;
	
			}
			return values;
		}
		
		private  double calculateByAccountType(BankAccount account, double  rateOfInterest) {
			
			return account.getBalance()*1*rateOfInterest;
		}
//String type= account.getAccountType();
//			
//			double rateOfInterest=0.07;
//			if(type.equals("savings")) {
//				
//				rateOfInterest =0.05;
//			}
//			if(type.equals("fixed")||type.equals("recurring")) {rateOfInterest=0.06;
				
//				return rateOfInterest;
			
			
		
		
		public double [] findInterestByAccountType(BankAccount[] accounts) {
			int i=0;
			
			
			double[] values=new double[accounts.length];
			
			for(BankAccount eachAccount : accounts) {
				if(eachAccount!=null) {
					String key=eachAccount.getAccountType();
				
			
			switch(key) {
			case "savings":
				values[i]=calculateByAccountType(eachAccount,0.05);
				
				break;
				
			case "fixed":
				values[i]=calculateByAccountType(eachAccount,0.07);
			
				break;
				
			case "recurring":
				values[i]=calculateByAccountType(eachAccount,0.07); 
				break;

			default:
				break;
			}
			i++;
			}
			
			
		}
			return values;
			
	
}
}

