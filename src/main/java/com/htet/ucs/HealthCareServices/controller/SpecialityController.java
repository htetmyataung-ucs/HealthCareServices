 package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;
import com.htet.ucs.HealthCareServices.services.SpecialityInterface;
@Controller
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

	@GetMapping("admin/create_speciality")
	public String createSpeciality(Model model) {
		model.addAttribute("speciality", new SpecialityDTO());
		return "adminSpeciality";
	}

	@PostMapping("admin/create_speciality")
	public String saveSpeciality(@ModelAttribute("speciality") SpecialityDTO s, Model model) {
		specialityInterface.saveSpeciality(s);
		return "redirect:/admin/speciality_list";
	}

	@GetMapping(value="admin/speciality_list")
	public String specialityList(Model model) {
		model.addAttribute("specialityList", specialityInterface.getAllSpecialityList());
		return "adminSpecialityList";
	}
	/*
	 * @GetMapping("/specialitylist") public @ResponseBody List<Speciality>
	 * getSpecialityList(){ return specialityRepository.findAll(); }
	 */
	
	//FOR EDIT AND DELETE CITY
	
	@GetMapping("admin/edit_speciality/{id}")
	public String edit(@PathVariable Long id,Model model) {
		if(id==null) {
			
		}
		SpecialityDTO dto=specialityInterface.findById(id);
		model.addAttribute("speciality", dto);
		return "adminSpecialityEdit";
	}
	@PostMapping("admin/edit_speciality")
	public String editSpeciality(@ModelAttribute(value="speciality") SpecialityDTO dto,Model model) {
		specialityInterface.saveSpeciality(dto);
		return "redirect:/admin/speciality_list";
	}
	@GetMapping("admin/delete_speciality/{id}")
	public String delete(@PathVariable Long id) {
		specialityInterface.delete(id);
		return "redirect:/admin/speciality_list";
	}
	
	
}
