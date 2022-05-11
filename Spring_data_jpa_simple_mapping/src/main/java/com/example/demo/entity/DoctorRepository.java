package com.example.demo.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
	public List<Doctor>findByDepartment(String srch);
	
	public Doctor findByDoctorName(String srch);
	
	public List<Doctor>findByDoctorNameAndDepartment(String docName,String dept);
	
	@Query(nativeQuery=true,value="Select *from sri_doctor where doctor_name=:docName or department=:dept")
	public List<Doctor> getByNameDept(@Param("docName") String docName, @Param("dept")String dept);
}
