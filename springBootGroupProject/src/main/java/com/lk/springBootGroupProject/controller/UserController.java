package com.lk.springBootGroupProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.springBootGroupProject.entity.User;
import com.lk.springBootGroupProject.service.UserService;




@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {

	
	@Autowired
	UserService service;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUserList(){
		return service.getAllUsers();
	}
	
}
