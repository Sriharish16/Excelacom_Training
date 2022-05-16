package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="sri_user")
@AllArgsConstructor
@NoArgsConstructor

public class User {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="phonenumber")
	private long Phonenumber;
}
