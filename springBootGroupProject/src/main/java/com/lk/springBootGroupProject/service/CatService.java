package com.lk.springBootGroupProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.springBootGroupProject.entity.Cat;
import com.lk.springBootGroupProject.repository.CatRepository;

@Service
public class CatService {

	@Autowired
	CatRepository repository;

	public List<Cat> getAllCats() {
		return repository.findAll();
	}

	public Cat addCat(Cat cat) {
		return repository.save(cat);
	}

	public Cat updateCat(Cat cat) {
		
		Cat ct = repository.findById(cat.getId()).orElse(null);
		if(ct!=null) {
			ct.setName(cat.getName());
			ct.setDescription(cat.getDescription());
			
			repository.save(cat);
		}
		
		return ct;
	}

	public Cat deleteCat(int id) {
		
		Cat ct = repository.findById(id).orElse(null);
		if(ct!=null) {
			repository.delete(ct);
		}
		return ct;
	}
	
}
