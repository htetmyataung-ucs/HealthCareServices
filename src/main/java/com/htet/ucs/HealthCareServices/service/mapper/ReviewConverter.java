package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.ReviewDTO;
import com.htet.ucs.HealthCareServices.model.Reviews;

public class ReviewConverter {
	public static Reviews convertToEntity(ReviewDTO reviewDTO) {
		Reviews review = new Reviews();
		review.setDescription(reviewDTO.getDescription());
		review.setRating(reviewDTO.getRating());
		review.getHospital().setId(reviewDTO.getHospitalId());
		return review;
	}
	public static ReviewDTO convertToDTO(Reviews reviewDTO) {
		ReviewDTO review = new ReviewDTO();
		review.setId(reviewDTO.getId());
		review.setDescription(reviewDTO.getDescription());
		review.setRating(reviewDTO.getRating());
		review.setHospitalName(reviewDTO.getHospital().getName());
		return review;
	}
}
