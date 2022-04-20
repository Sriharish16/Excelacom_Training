package com.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

	public static void main(String[] args) {
		Logger log =Logger.getLogger("com.example.Application");
		log.setLevel(Level.FINE);
		log.info("info message");
		
		log.warning("Warning msg**************");
		log.severe("Severe Messagge %%%%%%%%%%%%%%");
		log.fine("I am fine#####################");
		System.out.println("Info Message");
	}

}
