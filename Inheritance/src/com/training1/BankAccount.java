package com.training1;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private  String accountType;
	
	public BankAccount() {
		super();
		System.out.println("Zero Arg Constructor of SUPER Class Called");
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountNumber, String accountHolderName) {
		super();
		System.out.println("Two arg constructor of SUPER class Called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	
	
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		System.out.println("Four arg constructor of SUPER class Called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType=accountType;
	}

	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+this.accountNumber+","+this.accountHolderName+","+this.balance+","+this.accountType;
	
	
	}
}
