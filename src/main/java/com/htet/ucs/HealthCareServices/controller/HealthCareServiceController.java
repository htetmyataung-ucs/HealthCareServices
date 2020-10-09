package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.services.RoleInterface;
import com.htet.ucs.HealthCareServices.services.UserInterface;

@Controller
public class HealthCareServiceController {
	@Autowired
	private RoleInterface roleInterface;
	@Autowired
	private UserInterface userInterface;
	@GetMapping("/user")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/admin")
	public String admin(Model model) {
		return "adminDashboard";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	@GetMapping("/accessdenied")
	 public String accessDenied() {
		 return "403";
	 }
	@GetMapping("/registerTest")
	public String registerTest(Model model) {
		model.addAttribute("user", new UserDTO());
		model.addAttribute("roleList", roleInterface.getAllRoll());
		return "registerTest";
	}
	@PostMapping("/registerTest")
	public String saveUser(@ModelAttribute("user") UserDTO user, Model model) {
		userInterface.saveUser(user);
		return "redirect:/login";
	}

}
