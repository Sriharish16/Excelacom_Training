package com.training;

public class LoanApplication {
	
	private int applicationNumber;
	private Customer customer;
	private double loanAmount;


	public LoanApplication(int applicationNumber, int applicationid, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customer = applicationid;
		this.loanAmount = loanAmount;
	}

	public int getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", customer=" + customer + ", loanAmount="
				+ loanAmount + "]";
	}
	
	
	
	

}
