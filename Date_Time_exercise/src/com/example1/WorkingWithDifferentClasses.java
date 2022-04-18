package com.example1;
import java.time.*;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class WorkingWithDifferentClasses {

	public static void main(String[] args) {
		
		java.util.Date date1 = new java.util.Date();
	//	java.sql.Date date2 = new java.sql.Date(1020303);
		
		System.out.println(date1);
		
		System.out.println(date1.getTime());
		
		//System.out.println(date1.getTime());
		
		java.sql.Date date2= new java.sql.Date(date1.getTime());
		
		System.out.println(date2);
		
		LocalDate localDate= date2.toLocalDate();
		
		System.out.println(localDate.getDayOfWeek());
		
		System.out.println(localDate.getMonthValue());

		java.sql.Date sqlDate2 = new java.sql.Date(localDate.toEpochDay());
		
		System.out.println("SQL Date 2:"+sqlDate2);
		
	}

}
