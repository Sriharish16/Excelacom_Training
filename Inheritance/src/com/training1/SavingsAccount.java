package com.training1;

public class SavingsAccount extends BankAccount
{

	private  String nominee;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.setNominee(nominee);
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	//Whenever sub class Constructor is called its super class.
	//Constructor also called. Even if super() key word is not Present.
	
//	public SavingsAccount()
//	{
//		super();
//	
//		System.out.println("Constructor of SUB CLASS Called");
//	
//	}
	
//	public SavingsAccount() {
//		super(1020,"ram",5000,"Fixed");
//		System.out.println("Constructor of subclass called");
//	}
	
	
}
