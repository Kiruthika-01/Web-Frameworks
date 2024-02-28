package com.day4.cex4.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.day4.cex4.model.Patient;
import com.day4.cex4.repository.PatientRepo;

import java.util.*;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepo patientRepo;

    public boolean addPatient(Patient patient)
    {
        try{
            patientRepo.save(patient);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Patient> getPatients()
    {
        return patientRepo.findAll();
    }

    public Patient getPatientById(int patientId)
    {
        return patientRepo.findById(patientId).orElse(null);
    }
}