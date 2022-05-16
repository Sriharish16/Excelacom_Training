package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.repos.DriverRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
	}
@Bean
public CommandLineRunner runner() {
	return new CommandLineRunner() {
		@Autowired
		
		DriverRepository repo;

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			
			repo.save(new Driver(102,"Damu",655637383,4.5));
		}
	
		
	};
}
}
