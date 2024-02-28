package com.day6.cex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.cex1.model.Children;

public interface ChildRepo extends JpaRepository<Children,Integer> {

    
} 