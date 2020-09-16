package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;
import com.htet.ucs.HealthCareServices.services.SpecialityInterface;

public class SpecialityController {
	@Autowired
	private SpecialityInterface specialityInterface;


	/*@PostMapping(path = "/addspeciality") // Map ONLY POST Requests
	public @ResponseBody String addNewSpeciality(@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		SpecialityDTO s = new SpecialityDTO();

		s.setName(name);
		specialityInterface.saveSpeciality(s);
		return "Saved";
	}*/

	@GetMapping("/create_speciality")

	public String createSpeciality(Model model) {

		model.addAttribute("speciality", new SpecialityDTO());

		return "speciality";
	}

	@PostMapping("/create_speciality")
	public String saveSpeciality(@ModelAttribute("speciality") SpecialityDTO s, Model model) {

		specialityInterface.saveSpeciality(s);
		return "redirect:/speciality_list";
	}

	@GetMapping(value="/speciality_list")
	public String specialityList(Model model) {
		model.addAttribute("speciality", specialityInterface.getAllSpecialityList());
		return "speciality_list";
	}
	/*
	 * @GetMapping("/specialitylist") public @ResponseBody List<Speciality>
	 * getSpecialityList(){ return specialityRepository.findAll(); }
	 */
	
	
}
