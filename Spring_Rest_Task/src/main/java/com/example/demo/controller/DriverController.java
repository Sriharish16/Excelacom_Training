package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(path="/api/v1")
public class DriverController {
	
	private DriverService service;
@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	@GetMapping(path="/drivers")
	public List<Driver>getAllDriver(){
		return this.service.findAll();
	}
	
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		
		Driver driver =this.service.add(entity);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id").buildAndExpand(entity.getId()).toUri();
		return ResponseEntity.status(HttpStatus.CREATED).body(driver);
		
}
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id")int id ){
		return this.service.findById(id);
		
	}
//	@DeleteMapping(path="/drivers/remove/{id}")
//	public void removeDriver(@PathVariable("id")int id) {
//		this.service.delete(id);
//	}
//	
	@DeleteMapping(path="/drivers/remove/{id}")
	public String removeDriver(@PathVariable("id") int id)
	{
		 return this.service.delete(id);
		 
	}
	
	

}
