package com.day4.cwex3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.cwex3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

    
} 