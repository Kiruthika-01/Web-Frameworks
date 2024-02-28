package com.day6.cex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.cex2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    
} 
