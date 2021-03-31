package com.lk.springBootGroupProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lk.springBootGroupProject.entity.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer>{

	
	
}
