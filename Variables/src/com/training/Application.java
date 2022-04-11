package com.training;

public class Application {
	public static void main(String[]args) {
		BankAccount account=new BankAccount("Ramesh",1000);
		System.out.println("Current Balance of ramesh:"+account.getUpdatedBalance(2000));
		System.out.println("Account Number of Ramesh:"+account.getAccountNumber());
		
	    BankAccount account2=new BankAccount("Suresh",2000);
			System.out.println("Current Balance of Suresh:"+account2.getUpdatedBalance(3000));
			System.out.println("Account Number of Suresh:"+account2.getAccountNumber());
	   
}

}