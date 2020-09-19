package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.services.HospitalDetailInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;

@Controller
public class HospitalDetailController {
	@Autowired
	private HospitalInterface hospitalInterface;
	@Autowired 
	private HospitalDetailInterface hospitalDetailInterface;
	
	//*************HOSPITAL DETAIL***************
	
	@GetMapping("/create_hospitalDetail")
	public String createHospitalDetail(Model model) {
		model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
		model.addAttribute("hospitaldetail", new HospitalDetailDTO());
		return "hospitaldetail";
	}
	@PostMapping("/create_hospitalDetail")
	public String saveHospitalDetail(@ModelAttribute("hospitaldetail") HospitalDetailDTO hdDTO, Model model) {
		hospitalDetailInterface.saveHospitalDetail(hdDTO);
		return "redirect:/hospitaldetail_list";
	}
	@GetMapping(value="/hospitaldetail_list")
	public String HospitalDetailList(Model model) {
		model.addAttribute("hospitalDetailList", hospitalDetailInterface.getAllHospitalDetailList());
		return "hospitaldetail_list";
	}
		
}
