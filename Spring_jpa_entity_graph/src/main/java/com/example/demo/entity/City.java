package com.example.demo.entity;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name="sri_city")
@AllArgsConstructor
@NoArgsConstructor

public class City {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

}
