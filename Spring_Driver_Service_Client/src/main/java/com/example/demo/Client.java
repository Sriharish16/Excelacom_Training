package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Client {
	
	String BASEURL="http://localhost:8080/api/v1/users";
	
	private RestTemplate template;
	
	@Autowired

	public Client(RestTemplate template) {
		super();
		this.template = template;
	}
	public String invokeGetAll() {
		return template.getForObject(BASEURL, String.class);
	}
	
	public Driver[] invokeAllAsObject(){
		return template.getForObject(BASEURL, Driver[].class);
	}
	
	public void add() {
		HttpHeaders header= new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		int id;
		String name;
		long mobileNumber;
		double rating;
		
		HashMap<String, Object>map= new HashMap<>();
		
		map.put("id",122);
		map.put("name","Siva");
		map.put("mobileNumber",6536659);
		map.put("rating",5.2);
		
		HttpEntity<Map<String,Object>>entity= new HttpEntity(map,header);
		ResponseEntity<Driver>resp=this.template.postForEntity(BASEURL, entity, Driver.class);
		
		System.out.println("Status Code="+resp.getStatusCodeValue());
		System.out.println("Body="+resp.getBody());
		System.out.println(("Location="+resp.getHeaders().get("location")));
		
	}

}
