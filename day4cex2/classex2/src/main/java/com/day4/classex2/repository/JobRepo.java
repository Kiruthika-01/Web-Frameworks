package com.day4.classex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.classex2.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {

    
} 
