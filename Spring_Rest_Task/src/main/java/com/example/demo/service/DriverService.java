package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repos.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository repo;
	
	
	public List<Driver>findAll(){
		return this.repo.findAll();
	}
	
	public Driver add(Driver entity) {
		return this.repo.save(entity);
		
	}
	
	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(id+" Not found "));
		
	}
	public String delete(int id) {
		String message;
		try {
		 this.repo.deleteById(id);
		 message="One element deleted";
		 return message;
		 
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			message="Not found";
			
			
		}
		return message;
	
	
	
	}
}
