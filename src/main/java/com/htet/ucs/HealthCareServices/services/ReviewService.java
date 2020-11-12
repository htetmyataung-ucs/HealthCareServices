package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ReviewDTO;
import com.htet.ucs.HealthCareServices.repository.ReviewRepository;
import com.htet.ucs.HealthCareServices.service.mapper.ReviewConverter;

@Service
public class ReviewService implements ReviewInterface{
	@Autowired
	private ReviewRepository reviewRepository;
	@Override
	public void saveReview(ReviewDTO reviewDTO) {
		// TODO Auto-generated method stub
		reviewRepository.save(ReviewConverter.convertToEntity(reviewDTO));
	}

	@Override
	public List<ReviewDTO> getAllReviewList() {
		// TODO Auto-generated method stub
		return reviewRepository.findAll().stream().map(ReviewConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public ReviewDTO findById(Long id) {
		// TODO Auto-generated method stub
		ReviewDTO dto = ReviewConverter.convertToDTO(reviewRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		reviewRepository.deleteById(id);
	}
	
}
