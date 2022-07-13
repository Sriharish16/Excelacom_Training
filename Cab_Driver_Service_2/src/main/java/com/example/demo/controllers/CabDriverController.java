package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;

@RestController
@RequestMapping(path="/client")
public class CabDriverController {
	
private RestTemplate template;
	
	private String baseURL = "http://CAB-DRIVER-SERVICE/api/v1/drivers";

	@Autowired
	public CabDriverController(RestTemplate template) {
		super();
		this.template = template;
	}
	@GetMapping(path = "/drivers")
	public String  getDrivers() {
		
		//return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
		return this.template.getForObject(baseURL , String.class); //(another method)
	}
	
	
@GetMapping(path="/client/drivers/{id}")
	
	public String getDriverById(@PathVariable int id) {  
		
		return this.template.getForObject(baseURL+id, String.class);
		
		
		}
@GetMapping(path="/drivers/json")
	public CabDriver[]getDriverAsJson(){
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", CabDriver[].class);

}

@GetMapping(path="/srch/drivers/{name}")
public String getDriverByName(@PathVariable String name) {
	return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", String.class);
}
}
