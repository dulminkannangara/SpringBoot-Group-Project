package com.lk.springBootGroupProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.springBootGroupProject.entity.User;
import com.lk.springBootGroupProject.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> getAllUsers() {
		return repository.findAll();
		
	}

	
	public User updateUser(User user) {
		
		User uzr =(User) repository.findById(user.getId()).orElse(null);
		if(uzr!=null) {
			
			uzr.setAge(user.getAge());
			uzr.setMobile(user.getMobile());
			uzr.setName(user.getName());
			uzr.setPassword(user.getPassword());
			uzr.setUsername(user.getUsername());
			
			repository.save(uzr);
		}
		
		return uzr;
	}
	
	public User addUser(User user) {
		return	repository.save(user);
		
	}
	
	public User deleteUser(int id) {
		
		User uzr = repository.findById(id).orElse(null);
		if(uzr!=null) {
			 repository.delete(uzr);
			 
		}
		return uzr;
		
	}
	
}
