package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ReviewDTO;

public interface ReviewInterface {
	//to set
	void saveReview(ReviewDTO reviewDTO);
	//to get
	List<ReviewDTO> getAllReviewList();
	//to edit
	ReviewDTO findById(Long id);
	//to delete
	void delete(Long id);
}
