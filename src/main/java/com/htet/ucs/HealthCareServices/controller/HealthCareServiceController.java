package com.htet.ucs.HealthCareServices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCareServiceController {
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
}
