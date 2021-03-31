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

import com.lk.springBootGroupProject.entity.Cat;
import com.lk.springBootGroupProject.service.CatService;

@RestController
@RequestMapping("/cats")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CatController {
	

		@Autowired
		CatService service;
		
		
		@GetMapping("/getAllCats")
		public List<Cat> getAllCats() {
			return service.getAllCats();
		}
		
		@PostMapping("/addCat")
		public Cat addNewCat(@RequestBody Cat cat) {
			return service.addCat(cat);
		}
		
		@PutMapping("/updateCat")
		public Cat updateCat(@RequestBody Cat cat) {
			return service.updateCat(cat);
		}
		
		@DeleteMapping("/deleteCat/{id}")
		public Cat deleteCat(@PathVariable int id) {
		return	service.deleteCat(id);
		}
		
		
	
}
