package com.bookreview.review.service;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;


import com.bookreview.review.model.ReviewDetails;
import com.bookreview.review.repository.ReviewRepository;

@Service
public class ReviewDetailsService {
    private ReviewRepository reviewRepository;
    public ReviewDetailsService(ReviewRepository reviewRepository)
    {
        this.reviewRepository=reviewRepository;
    }
    public ReviewDetails postReviewDetails(ReviewDetails reviewDetails)
    {
        return reviewRepository.save(reviewDetails);
    }
    public List<ReviewDetails> getAllReviews()
    {
        return reviewRepository.findAll();
    }
    public ReviewDetails getReviewDetailsById(int book_id){
        Optional<ReviewDetails>optionalDetails=reviewRepository.findById(book_id);
        return optionalDetails.orElse(null);
    }
    public ReviewDetails putReviewDetails(int book_id,ReviewDetails reviewDetails)
    {
        return reviewRepository.save(reviewDetails);
    }
    public void deletebook_id(int book_id)
    {
        reviewRepository.deleteById(book_id);
    }
}