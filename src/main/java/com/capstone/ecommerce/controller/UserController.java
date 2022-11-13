package com.capstone.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.ecommerce.models.User;
import com.capstone.ecommerce.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.uService.addUser(user);
	}
	
	@GetMapping("/users/getUsers")
	public List<User> getUsers() {
		return this.uService.getUsers();
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return this.uService.updateUser(user);
	}
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus>deleteUser(@PathVariable String userId) {
		try {
			this.uService.deleteUser(Integer.parseInt(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
