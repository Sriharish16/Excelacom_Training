package com.example;
import java.util.*;
import java.time.*;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private LocalDate dateOfBirth;
	private LocalDateTime dateOfJoining;
	
	public Student(int rollNumber, String studentName, LocalDate dateOfBirth, LocalDateTime dateOfJoining) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the dateOfJoining
	 */
	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	
	
	
	
	

}
