package com.day4.classex2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.day4.classex2.model.Job;
import com.day4.classex2.repository.JobRepo;

@Service
public class JobService {
    private JobRepo jobrepo;
   
   public JobService(JobRepo jobrepo) {
        this.jobrepo = jobrepo;
  }

public boolean addJob(Job job) {
    try{    
        jobrepo.save(job);
        return true;
    }
    catch(Exception e)
    {
        return false;
    }
}
public List<Job> getall()
{
    return jobrepo.findAll();
}
public Optional<Job> findById(int id)
{
    return jobrepo.findById(id);


}
}
