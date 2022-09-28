package com.sony.model;

import java.util.UUID;

import lombok.Data;

@Data
public class User {

	private String Id;
	private String  firstname;
	private String lastname;
	private String email;
	private String city;
	
	public User() {
		this.setId(UUID.randomUUID().toString());
	}

	public User(String firstname, String lastname, String email, String city) {
		this();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
	}
	
}
