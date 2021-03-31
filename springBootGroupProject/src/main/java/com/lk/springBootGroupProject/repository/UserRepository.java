package com.lk.springBootGroupProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lk.springBootGroupProject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
	
	
	
}
