package com.sony.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sony.model.User;

import lombok.NoArgsConstructor;

@Service

public class UserManager {

	private Map<String,User>users;
	
	public UserManager() {
		users=new HashMap<>();
		User user;
		
		user =new User("Harish","Murugesan","harish@gmail.com","Trichy");
		users.put(user.getId(),user);
		
		user =new User("Joseph","Nithish","joseph@gmail.com","Salem");
		users.put(user.getId(),user);
		
		user =new User("Kamal","Raj","kamal@gmail.com","Chennai");
		users.put(user.getId(),user);
	}
	
	public Iterable<User>getAllUsers(){
		return this.users.values();
	}
	
	public User getUserById(String id) {
		return this.users.get(id);
	}
}
