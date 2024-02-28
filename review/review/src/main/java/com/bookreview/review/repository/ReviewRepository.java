package com.bookreview.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookreview.review.model.ReviewDetails;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewDetails,Integer>{

    
}
