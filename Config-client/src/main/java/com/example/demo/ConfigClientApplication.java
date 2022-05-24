package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.repository.DoctorRepository;

@SpringBootApplication
//@RestController

public class ConfigClientApplication {

//	
//	@Value("${customer.firstName}")
//	private String name;

//	@GetMapping(path ="/names")
//	public String getName() {
//		return this.name;
//	}
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ConfigClientApplication.class, args);
		
		DoctorRepository repo =ctx.getBean(DoctorRepository.class);
		repo.findAll().forEach(System.out::println);
		
	
		
	}

}
