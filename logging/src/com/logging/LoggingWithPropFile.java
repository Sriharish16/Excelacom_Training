package com.logging;

public class LoggingWithPropFile {
	
	public static void main(String[] args) {
		
		String file = LoggingWithPropFile.class.getClassLoader()
						.getResource("logging.properties")
						.getFile();
		
		System.out.println(file);
		
		System.setProperty("java.util.logging.config.file",file);
		
		Book.log.info("Logging Prperties Done Right");
		
		Book java = new Book();
		
		Book.log.info(java.toString());
		
	}

}
