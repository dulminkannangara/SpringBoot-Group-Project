package com.lk.springBootGroupProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.springBootGroupProject.entity.User;
import com.lk.springBootGroupProject.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {

	
	@Autowired
	UserService service;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUserList(){
		return service.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public User saveSingleUser(@RequestBody User user){
		
		return service.addUser(user);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public User deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	
	
	
	
	
	
}
