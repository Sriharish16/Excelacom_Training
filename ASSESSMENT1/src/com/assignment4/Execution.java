package com.assignment4;
import java.util.*;
import com.assignment1.*;
import com.assignment2.*;
import assignment3.*;
import Testing.*;

public class Execution {

	public static void main(String[] args) {
		
		Customer cust = new Customer(1000, "Sriharish", 86674561);
		Employee emp=new Employee("ABC", "Poovarasan", 857596456, 50000);
		Hotel hot=new Hotel("RT", 50, 50);
		
		System.out.println("Customer ID is:"+cust.getCustomerID());
		System.out.println("Customer Name is:"+cust.getName());
		System.out.println("Customer Phone is:"+cust.getPhone());
		
		System.out.println("Employee ID is:"+emp.getEmployeeID());
		System.out.println("Employee Name is:"+emp.getEmployeeName());
		System.out.println("Employee Phone is:"+emp.getEmployeePhone());
		System.out.println("Employee Salary is:"+emp.getSalary());
		
		System.out.println("Hotel Name:"+hot.getHotelName());
		System.out.println("No Of tables:"+hot.getNoOfTables());
		System.out.println("No Of Servants:"+hot.getNoOfServants());
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer ID:");
		int custid=sc.nextInt();
		cust.setCustomerID(custid);
		System.out.println("Customer ID:"+cust.getCustomerID());
		
		EmployeeService scd= new EmployeeService();
		System.out.println("Bonus is:"+scd.calculatebonus(emp));
		
		
		
		sc.close();
		
		
		

	}

	}


