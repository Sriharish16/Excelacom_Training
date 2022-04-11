package com.training.services;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		StringService service=new StringService();
		
		int key;
		
		System.out.println("Enter the Key");
		
		key=sc.nextInt();
		
		switch (key) {
		
		case 1:
			
			service.stringEquals("Ram","Ram");
			
			break;
			
		case 2:
			
			service.stringObjectEquals();
			
			break;
			
			
		case 3:
			
			service.usingtrim("    Ram     ");
			
		case 4:
			
			service.LengthofStirng("      Ram      " );
			
			break;
			
		case  5:
			
			service.usingSubString("Sriharish");
			
			break;
			
		case 6:
			
			service.usingCharAtAndIndexOf("Good Morning");
			
			break;
			
		case 7:
			
			service.usingReplace("Good Morning", "mood Good");
			
			break;
			
		case 8:
			
			service.usingConcat("Get", "Lost");
			
			break;
			
		case 9:
			
			service.usingCompareto("Computer", "word");
			
			break;
			
		case 10:
			
			service.usingStringFormat("Sriharish", 500 );
			break;
			
		case 11:
			
			service.usingPrefixAndSuffix("Sri", "Harish");
			break;
			
		default:
			
			break;
		}
		
	}

}
