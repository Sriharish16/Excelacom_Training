package com.training.exception;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int phoneNumber;
	private String email;
	
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) throws InvalidEmailException {
		 email.contains("@.com.org.in");
		 try {
			 ();
		 }catch{
			 InvalidEmailException e;
			 e.printStackTrace();
		this.email = email;
	}

	}	

	private Exception InvalidEmailException() {
		// TODO Auto-generated method stub
		return null;
	}


	public Customer(int customerId, String customerName, int phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}


	public void getMessage() {
		// TODO Auto-generated method stub
		
	} 
	
	
	
}
