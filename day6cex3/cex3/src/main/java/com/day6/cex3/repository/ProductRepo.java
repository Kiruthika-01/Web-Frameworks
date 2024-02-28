package com.day6.cex3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.cex3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    
}
