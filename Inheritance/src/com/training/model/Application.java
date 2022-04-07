package com.training.model;

import com.training1.BankAccount;

public class Application {

	public static void main(String[] args) {
		
		BankAccount ramAccount= new BankAccount(323,"raja",40000,"fixed");
		
		BankAccount account =new BankAccount(1010, "Ramesh", 50000, "Savings");
		
		System.out.println(account.toString());
		System.out.println(ramAccount.toString());
	}

}
