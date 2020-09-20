package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.ReviewDTO;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.ReviewInterface;

@Controller
public class ReviewController {
	@Autowired
	private HospitalInterface hospitalInterface;
	@Autowired
	private ReviewInterface reviewInterface;
	
	
	//**********REVIEW**********
	
	@GetMapping("/create_review")
	public String createReview(Model model) {
		model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
		model.addAttribute("review", new ReviewDTO());
		return "reviews";
	}
	@PostMapping("/create_review")
	public String saveReview(@ModelAttribute("review") ReviewDTO review, Model model) {
		reviewInterface.saveReview(review);
		return "redirect:/reviews_list";
	}
	@GetMapping(value="/reviews_list")
	public String reviewList(Model model) {
		model.addAttribute("reviewList", reviewInterface.getAllReviewList());
		return "reviews_list";
	}
	
}
