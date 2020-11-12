package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.PostDTO;
import com.htet.ucs.HealthCareServices.services.PostInterface;

@Controller
public class PostController {	
	@Autowired
	private PostInterface postInterface;
	
	@GetMapping("/post")
	public String post(Model model) {
		model.addAttribute("post", new PostDTO());
		model.addAttribute("postList",postInterface.getAllPostList());
		model.addAttribute("orderPostList", postInterface.getAllOrderByDate());
		return "post";
	}
	@PostMapping("/post")
	public String savePost(@ModelAttribute(value = "post") PostDTO post,Model model) {
		postInterface.postSave(post);
		return "redirect:/post";
	}
}

