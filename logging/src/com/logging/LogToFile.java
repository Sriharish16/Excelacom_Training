package com.logging;
import java.io.IOException;
import java.util.logging.*;
public class LogToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log= Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler= null;
		try {
		 handler= new FileHandler("logs.log");
		 log.addHandler(handler);
		 throw new RuntimeException("K is a great Programmer");
		
	}
		catch(SecurityException e) {
		
			log.warning(e.getMessage())	;
}
		catch(IOException e) {
			
			log.warning(e.getMessage());	

		}
log.addHandler(handler);

	}
	
}
