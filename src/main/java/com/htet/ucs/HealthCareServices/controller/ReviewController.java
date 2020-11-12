package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@GetMapping("/admin/create_review")
	public String createReview(Model model) {
		model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
		model.addAttribute("review", new ReviewDTO());
		return "adminReview";
	}
	@PostMapping("/admin/create_review")
	public String saveReview(@ModelAttribute("review") ReviewDTO review, Model model) {
		reviewInterface.saveReview(review);
		return "redirect:/admin/reviews_list";
	}
	@GetMapping("/admin/reviews_list")
	public String reviewList(Model model) {
		model.addAttribute("reviewList", reviewInterface.getAllReviewList());
		return "adminReviewList";
	}
	
	//FOR EDIT AND DELETE CITY
	
		@GetMapping("admin/editReview/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			ReviewDTO dto=reviewInterface.findById(id);
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			model.addAttribute("review", dto);
			return "adminReviewEdit";
		}
		@PostMapping("admin/editReview")
		public String editReview(@ModelAttribute(value="review") ReviewDTO dto,Model model) {
			reviewInterface.saveReview(dto);
			return "redirect:/admin/reviews_list";
		}
		@GetMapping("admin/deleteReview/{id}")
		public String delete(@PathVariable Long id) {
			reviewInterface.delete(id);
			return "redirect:/admin/reviews_list";
		}
		
		@RequestMapping("/review_save")
		public @ResponseBody ReviewDTO save_review(@RequestBody ReviewDTO rev) {
			reviewInterface.saveReview(rev);
			return rev;
		}
}
