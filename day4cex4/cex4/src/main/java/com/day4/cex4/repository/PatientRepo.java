package com.day4.cex4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.cex4.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
    
}
