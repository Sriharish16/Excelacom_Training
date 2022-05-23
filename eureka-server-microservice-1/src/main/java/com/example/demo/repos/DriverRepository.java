package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Driver;
@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
	
	public List<Driver>findByName(String srchName);
	
	List<Driver>findByMobileNumber(long mobileNumber);
	
	
	@Query(value="from Driver where rating=:srchValue")
	List<Driver>searchByRating(@Param("srchValue")double rating);
	
	@Query(value="update Driver set rating=:updatedRating where id=:srchId")
	
	@Modifying
	@Transactional
	int modifyRating(@Param("srchId")int driverId,@Param ("updatedRating")double updatedRating);
	
	
	

	

}
