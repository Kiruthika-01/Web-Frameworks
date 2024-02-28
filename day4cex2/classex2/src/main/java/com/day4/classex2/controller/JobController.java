package com.day4.classex2.controller;

// import org.springframework.web.bind.annotation.RestController;

import com.day4.classex2.model.Job;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;



// @RestController
// public class JobController {
//     @PostMapping("/api/job")
//     public ResponseEntity<Job> postJob(@RequestBody Job job)
//     {

//     }
//     @GetMapping("/api/job")
//     public ResponseEntity<Job> getJob()
//     {

//     }
//     @GetMapping("/api/job/{jobid}")
//     public ResponseEntity<Job> postJobId(@PathVariable )
//     {

//     }
    
// }


// package com.example.springapp.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/api")
public class JobController {

    @Autowired
    private com.day4.classex2.service.JobService ser;

    @PostMapping("/job")
    public ResponseEntity<Job> postjob(@RequestBody Job job)
    {
        if(ser.addJob(job))
        {
            return new ResponseEntity<>(job, HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
        }
    }


    @GetMapping("/job")
    public ResponseEntity<List<Job>> getJob()
    {
        List<Job> jb = ser.getall();
        if(jb.size() > 0)
        {
            return new ResponseEntity<List<Job>>(jb, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


     @GetMapping("/job/{jobId}")
    public ResponseEntity<Optional<Job>> findJ(@PathVariable int jobId)
    {
        Optional<Job> jo = ser.findById(jobId);

        if(!jo.isEmpty())
        {
            return new ResponseEntity<Optional<Job>>(jo, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }   
    
}

