package com.assessment;


public class MobileBill {

	private String customerName;
	private long mobileNumber;
	private String planName;
	private Address address;
	int amount;
	
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MobileBill(String customerName, long mobileNumber, String planName, Address string) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address = string;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

public int findAmount()
{

	
	switch(getPlanName()) 
	{
	
	case "prepaid":
		amount=200;
		break;
	case "Postpaid":
		amount=100;
		break;

	
	}

	return amount;
	
}	
}
