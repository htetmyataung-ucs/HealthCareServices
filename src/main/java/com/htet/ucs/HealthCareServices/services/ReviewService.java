package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ReviewDTO;
import com.htet.ucs.HealthCareServices.model.Reviews;
import com.htet.ucs.HealthCareServices.repository.ReviewRepository;

@Service
public class ReviewService implements ReviewInterface{
	@Autowired
	private ReviewRepository reviewRepository;
	@Override
	public void saveReview(ReviewDTO reviewDTO) {
		// TODO Auto-generated method stub
		reviewRepository.save(convertReview(reviewDTO));
	}

	@Override
	public List<ReviewDTO> getAllReviewList() {
		// TODO Auto-generated method stub
		List<Reviews> review = reviewRepository.findAll();
		List<ReviewDTO> reviewDTO = review.stream().map(r->convertReviewDTO(r)).collect(Collectors.toList());
		return reviewDTO;
	}
	Reviews convertReview(ReviewDTO reviewDTO) {
		Reviews review = new Reviews();
		review.setDescription(reviewDTO.getDescription());
		review.setRating(reviewDTO.getRating());
		review.setHospital(reviewDTO.getHospital());
		return review;
	}
	ReviewDTO convertReviewDTO(Reviews reviewDTO) {
		ReviewDTO review = new ReviewDTO();
		review.setDescription(reviewDTO.getDescription());
		review.setRating(reviewDTO.getRating());
		review.setHospital(reviewDTO.getHospital());
		return review;
	}
}
