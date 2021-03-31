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

import com.lk.springBootGroupProject.entity.Product;
import com.lk.springBootGroupProject.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return	service.addProduct(product);
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PutMapping("updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public Product deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	
	
	
}
