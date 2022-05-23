package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DriverDTO {
	
//	@Autowired
//	RestTemplate template;
//	
//	@GetMapping(path="/client/drivers")

	private int id;
	private String name;
	private long mobileNumber;
	private double rating;
}
