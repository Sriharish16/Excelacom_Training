package com.training.credit_card_service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CreditCard credit= new CreditCard(101,"Sriharish",50000);
    	
    	CreditCard credit1=new CreditCard(201,"Bill Goldberg",25000);
    	
    	CreditCard credit2= new CreditCard(301, "Mark Zuckerberg", 40000);
    	
    	System.out.println("Total AmountDue:");
    	
    	System.out.println(credit.getAmountDue()+credit1.getAmountDue()+credit2.getAmountDue());
    	
    	
    
    }
}
