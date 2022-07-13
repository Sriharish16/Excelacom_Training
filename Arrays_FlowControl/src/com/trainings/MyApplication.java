package com.trainings;

import java.util.*;

import com.training.model.BankAccount;
import com.training.service.BankAccountService;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService service =new BankAccountService();
		BankAccount[]list = new BankAccount[3];
		int idx=0;
		int choice=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Account Number:");
			
			int accountNumber=sc.nextInt();
			
			System.out.println("Account Holder Name:");
				String accountHolderName= sc.next();
			
			System.out.println("Balance:");
				double balance=sc.nextDouble();
			
			System.out.println("Account type[savings,fixedd,recurring");
				String accountType=sc.next();
	
			
			
			
	BankAccount account=new BankAccount(accountNumber, accountHolderName,  balance, accountType);
				list[idx]=account;
					System.out.println("Enter o or 1 to continue");
					
					choice=sc.nextInt();
			
		}while(choice==1); {
			
			double[] values=service.findInterest(list);
			for(double eachValue:values) {
				System.out.println(eachValue);
			}
				
				
		}
	}
}
			
			
	
	
	
		
			
			
		
	

