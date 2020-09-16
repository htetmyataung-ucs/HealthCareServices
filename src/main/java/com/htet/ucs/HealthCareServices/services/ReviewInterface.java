package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ReviewDTO;

public interface ReviewInterface {
	void saveReview(ReviewDTO reviewDTO);
	List<ReviewDTO> getAllReviewList();
}
