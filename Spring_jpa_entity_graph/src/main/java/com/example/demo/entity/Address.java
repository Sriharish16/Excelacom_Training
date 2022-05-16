package com.example.demo.entity;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name="sri_address")
@AllArgsConstructor
@NoArgsConstructor

public class Address {

	
	@Id
	@Column(name="id")
	private int id;
	
	private String title;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
}
