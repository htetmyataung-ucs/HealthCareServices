package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.services.MedicalShopInterface;
import com.htet.ucs.HealthCareServices.services.TownshipInterface;

@Controller
public class MedicalShopController {
	@Autowired
	private MedicalShopInterface medicalShopInterface;
	@Autowired
	private TownshipInterface townshipInterface;
	
	@GetMapping("/medicalshop")
	public String createMedicalShop(Model model) {
		model.addAttribute("medicalShop", new MedicalShopDTO());
		model.addAttribute("township", townshipInterface.getAllTownshipList());
		return "medicalShop";
	}
	@PostMapping("/medicalshop")
	public String saveMedicalShop(@ModelAttribute("medicalShop")MedicalShopDTO medicalShop, Model model) {
		medicalShopInterface.saveMedicalShop(medicalShop);
		return "redirect:/medicalshop_list";
	}
	@GetMapping("/medicalshop_list")
	public String index(Model model) {
		model.addAttribute("medicalShopList", medicalShopInterface.getMedicalShopList());
		return "medicalShop_list";  
	}
	
}
