package com.training.Hash;
import com.training.Hash1.Appointment;
import java.util.*;

public class Application {

	public static void main(String[] args) {

		Set<Patient>pcObj=new HashSet<>();
	
	
		Patient ram=new Patient(01,"ram","Trichy",80922);
		Patient shyam= new Patient(02,"shyam","Musiri",12345);
		Patient ravi= new Patient(03,"ravi","Theni",45678);
		
		
		pcObj.add(ram);
		pcObj.add(shyam);
		pcObj.add(ravi);
	
		Set<Doctor>keys= new HashSet<>();
		
		Doctor raja = new Doctor(101,"Wilson","ENT",pcObj);
		keys.add(raja);
		
		for(Doctor dc:keys)
			
		System.out.println(dc);
		
		System.out.println("===============================================================================================================");
		
		Map<Doctor,Set<Patient>>map1=new HashMap<>();
		map1.put(raja, pcObj);
		Appointment app= new Appointment(map1);
		
		System.out.println(app);
		
		System.out.println("===============================================================================================================");
	}
	
	
}