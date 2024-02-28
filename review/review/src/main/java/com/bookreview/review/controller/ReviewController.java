



package com.bookreview.review.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.bookreview.review.model.ReviewDetails;
import com.bookreview.review.service.ReviewDetailsService;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class ReviewController {
    private final ReviewDetailsService reviewdetailsservice;
    public ReviewController(ReviewDetailsService reviewdetailsservice)
    {
          this.reviewdetailsservice=reviewdetailsservice;
    }
   
    @PostMapping("/review")
    public ResponseEntity<ReviewDetails>postReviewDetails(@RequestBody ReviewDetails reviewDetails)
    {
        ReviewDetails postReviewDetails=reviewdetailsservice.postReviewDetails(reviewDetails);
         return new ResponseEntity<>(postReviewDetails,HttpStatus.CREATED);
    } 
   
      @GetMapping("/reviews")
      public ResponseEntity<List<ReviewDetails>>getAllReviews(){
        List<ReviewDetails>reviewDetails=reviewdetailsservice.getAllReviews();
        return new ResponseEntity<>(reviewDetails,HttpStatus.OK);
    } 
      @GetMapping("/reviews/{book_id}")
       public ResponseEntity<ReviewDetails>getById(@PathVariable int book_id){
        ReviewDetails reviewDetail1=reviewdetailsservice.getReviewDetailsById(book_id);
        if(reviewDetail1!=null){
            return new ResponseEntity<>(reviewDetail1,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } 
    @PutMapping("/reviewbook/{book_id}")
    public ResponseEntity<ReviewDetails> putReview(@PathVariable("book_id") int book_id,ReviewDetails reviewDetails)
    {
         ReviewDetails reviewDetail2=reviewdetailsservice.putReviewDetails(book_id, reviewDetails);
         if(reviewDetail2!=null){
            return new ResponseEntity<>(reviewDetail2,HttpStatus.OK);
        }
         else{
            return new ResponseEntity<>(reviewDetail2,HttpStatus.NOT_FOUND);
         }
    }
     @DeleteMapping("/reviewsdelete/{book_id}")
     public void deletebook_id(@PathVariable("book_id") int book_id)
     {
        reviewdetailsservice.deletebook_id(book_id);
     }
    
}