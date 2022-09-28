package com.sony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sony.model.User;
import com.sony.service.UserManager;
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserManager mgr;
	
	@GetMapping(produces="application/json")
	public Iterable<User> handleGetAll(){
		return mgr.getAllUsers();
	}
	
	@GetMapping(path="/{id}",produces="application/json")
	public ResponseEntity<User> handleGetOne(@PathVariable String id){
		User user=mgr.getUserById(id);
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}
}
