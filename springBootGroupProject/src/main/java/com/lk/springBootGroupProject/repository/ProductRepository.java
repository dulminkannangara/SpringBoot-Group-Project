package com.lk.springBootGroupProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lk.springBootGroupProject.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
