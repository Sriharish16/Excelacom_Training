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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping(path="/drivers/srch/number/{mobileNumber}")
	public List<Driver>getDriverByMobileNumber(@PathVariable("mobileNumber")long number)
	{
	return this.service.srchByMobileNumber(number);
	

}
	@GetMapping(path="/drivers/srch/{name}")
	public List<Driver>getDriverByName(@PathVariable("name")String name)
	{
	return this.service.findByName(name);
	}
	

	@GetMapping(path="/drivers/rating/{rating}")
	public List<Driver>getDriverByRating(@PathVariable("rating")double rating)
	{
	return this.service.srchByDriverRating(rating);
	}
	
	@PutMapping(path="/drivers/update/{id}/{rating}")
	public ResponseEntity<String> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating){
		int rowUpdated= this.service.updateRating(id, updatedRating);
		return ResponseEntity.status(HttpStatus.OK).body(rowUpdated+"updated");
	}
	
	@GetMapping(path="/drivers/sort/{propName}")
	public List<Driver>sortByName(@PathVariable("propName")String propName){
		return this.service.sortedList(propName);
	}
	}
	


