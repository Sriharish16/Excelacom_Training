package com.training1;

import com.training1.BankAccountService;

public class SavingsAccountService extends BankAccountService{
	
	public String getCustomerInfo(SavingsAccount account) {
		return account.getAccountHolderName();
	}

public double calculateInterest(BankAccount account) {
		
		double simpleInterest =0.10;
		
		if(account.getAccountNumber()<=5000) {
			simpleInterest=0.11;
			
		}
		
		return account.getBalance()*1*simpleInterest;
	
	
	
}	
}

