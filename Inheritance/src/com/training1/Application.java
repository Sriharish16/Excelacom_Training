package com.training1;

import com.training1.BankAccount;
import com.training1.SavingsAccount;
public class Application {

	public static void main(String[] args) {
		
		SavingsAccount account= new SavingsAccount(500,"Sri",60000,"Joint","Ram");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		
		
		SavingsAccountService service =new SavingsAccountService();
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2= new SavingsAccountService();
		
		SavingsAccountService savingService2 = (SavingsAccountService)service2;
		System.out.println(savingService2.getCustomerInfo(account));
	//	System.out.println(service2.getCustomerInfo);
		// TODO Auto-generated method stub

	}

}
