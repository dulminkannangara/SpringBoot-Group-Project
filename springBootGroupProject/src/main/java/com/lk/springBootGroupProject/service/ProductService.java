package com.lk.springBootGroupProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.springBootGroupProject.entity.Product;
import com.lk.springBootGroupProject.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public Product addProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	public Product updateProduct(Product product) {
		
		Product prdt = repository.findById(product.getId()).orElse(null);
		if(prdt!=null) {
			prdt.setBuy_price(product.getBuy_price());
			prdt.setCat(product.getCat());
			prdt.setDescription(product.getDescription());
			prdt.setName(product.getName());
			prdt.setQty(product.getQty());
			prdt.setSale_price(product.getSale_price());
			
			repository.save(prdt);
		}
		
		return prdt;
	}

	public Product deleteProduct(int id) {
		
		Product prdt = repository.findById(id).orElse(null);
		if(prdt!=null) {
			repository.delete(prdt);
			
		}
		
		return prdt;
	}
	
	
	
}
