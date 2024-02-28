package com.day8.cex3.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.day8.cex3.model.Student;
import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

    List<Student> findByMarksGreaterThan(int marks); 
    List<Student> findByMarksLessThan(int marks); 
}
