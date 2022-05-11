package com.example.demo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
	
	private DoctorRepository repo;
@Autowired
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo = repo;
	}
	public Doctor add(Doctor entity) {
		return this.repo.save(entity);
	}
	
	public List<Doctor>findAll(){
		return this.repo.findAll();
	}
	public List<Doctor>findByDepart(String srchString){
		return this.repo.findByDepartment(srchString);
	}
	public Doctor findByDoctorName(String srch){
		return this.repo.findByDoctorName(srch);
	}
	public List<Doctor>findByDoctorAndDepart(String srch1,String dept){
		return this.repo.findByDoctorNameAndDepartment(srch1, dept);
	}
	public List<Doctor>findByNameOrDept(String name,String dept){
		return this.repo.getByNameDept(name, dept);
	}
}
