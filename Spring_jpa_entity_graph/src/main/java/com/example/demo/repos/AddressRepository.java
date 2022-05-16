package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	
	//If more than one entity use "LOAD" Type...
	@EntityGraph(attributePaths= {"user","city"},type=EntityGraphType.LOAD)
	List<Address>findAll();
	
//If only one entity use "FETCH" Type...
	
//	@EntityGraph(attributePaths= {"user"},type=EntityGraphType.FETCH)
//	List<Address>findAll();
	}


