package com.htet.ucs.HealthCareServices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCareServiceController {
	@GetMapping("/user")
	public String index(Model model) {
		return "index";
	}
	@GetMapping("/admin")
	public String admin(Model model) {
		return "adminDashboard";
	}
}
