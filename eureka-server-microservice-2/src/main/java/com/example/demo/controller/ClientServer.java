package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.controllers.DriverDTO;

@RestController
@RequestMapping(path = "/api/v1")
public class ClientServer {

	@Autowired
	private RestTemplate template;
	
//	private String baseURL = "http://client-one/api/v1";
//	
//	@Autowired
//	public ClientServer(RestTemplate template) {
//		super();
//		this.template = template;
//	}
//	
//	@GetMapping(path = "/client/books")
//	public String  getBooks() {
//		
//		//return this.template.getForObject("http://client-one/api/v1/books",String.class);
//		return this.template.getForObject(baseURL +"/books", String.class); //(another method)
//	}
//	
//	@GetMapping(path="/client/books/{id}")
//	
//	public String getBookById(@PathVariable int id) {  
//		
//		return this.template.getForObject(baseURL+"/books/"+id, String.class);
//	}


	@GetMapping(path = "/client/drivers")
	public DriverDTO[] getDrivers() {
		
		return template.getForObject("http://microservice-one/api/v1/drivers", DriverDTO[].class);
	}
}