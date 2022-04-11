package com.training.services;

public class StringService {
	
	public void stringEquals(String str1,String str2)
	{
		System.out.println("Is Value same:="+str1.equals(str2));
		System.out.println("Are they Pointing to same Location:"+ str1==str2);
		
	}
	public void stringObjectEquals() {
		
		String ram=new String("Ram");
		
		String sam= new String("Ram");
		
		System.out.println("Is Values1 same :="+ram.equals(sam));
		
		System.out.println("Are they  Poing to same location:"+ram==sam);
	}
	
	public String usingtrim(String str1) {
		
		System.out.println("Without trim:"+str1);
		
		System.out.println("After Trim:"+str1.trim());
		
		return str1.trim();
		
	}
	
	public void LengthofStirng(String str1) {
		
		String resp=usingtrim(str1);
		
		System.out.println(str1.trim().length());
	}
	
	public void usingSubString(String str3) {
		
		System.out.println(str3.substring(2));
		
		System.out.println(str3.substring(3,8));
	}
	
	public void usingCharAtAndIndexOf(String name) {
		
		System.out.println("Index of M is :"+name.indexOf("M"));
		
		System.out.println("Char at the index of given value is:"+" "+name.charAt(3));
	}
	
	public void usingReplace(String str1, String str2) {
		
		System.out.println("Replacing the Good to Bad:" +" "+str1.replace("Good", "Bad"));
	}
	
	public void usingConcat(String str1, String str2) {
	
	//System.out.println("Concating two Strings:"+str1.concat(str2));


	//String Builder is mutable.......
	StringBuilder builder =new StringBuilder();
	builder.append(str2);
	System.out.println(builder.toString());
	
	}
	
	public void usingCompareto(String str1, String str2) {
		
		System.out.println(str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1, double mark) {
		
		String frmtString= String.format("Name is %s", str1);
		
		System.out.println("Format:"+frmtString);
		
		System.out.println(String.format("Mark is %.2f", mark));
		
	}
	
	public void usingPrefixAndSuffix(String str1, String str2) {
		
		String combined= String.format("Combined:%1$s and %2$s",str1,str2);
		
		System.out.println("Prefix and Suffix"+combined);
		
	}
	
}

