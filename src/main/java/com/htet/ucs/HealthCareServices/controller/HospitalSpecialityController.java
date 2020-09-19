package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.HospitalSpecialInterface;
import com.htet.ucs.HealthCareServices.services.SpecialityInterface;
@Controller
public class HospitalSpecialityController {
	@Autowired
	private HospitalInterface hospitalInterface;
	@Autowired
	private SpecialityInterface specialityInterface;
	@Autowired
	private HospitalSpecialInterface hospitalSpecialInterface;
	
	//************HOSPITAL SPECIALITY************
	
		/*@PostMapping(path="/addhospitalspecial") // Map ONLY POST Requests
		  public @ResponseBody String addNewHospitalSpecial (@RequestParam Boolean status,@RequestParam Speciality speciality,@RequestParam Hospital hospital) {
		    // @ResponseBody means the returned String is the response, not a view name
		    // @RequestParam means it is a parameter from the GET or POST request
		    HospitalSpecial hs = new HospitalSpecial();	   
		    hs.setStatus(status);
		    hospitalspecialRepository.save(hs);
		    return "Saved";
		  }*/
		
		@GetMapping("/create_hospitalspecial")
		public String createHospitalSpecial(Model model) {
			model.addAttribute("hospitalspecial", new HospitalSpecialDTO());
			model.addAttribute("specialityList", specialityInterface.getAllSpecialityList());
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			return "hospitalspecial";
		}
		@PostMapping("/create_hospitalspecial")
		public String saveHospitalSpecial(@ModelAttribute("hospitalspecial") HospitalSpecialDTO hospitalSpecial, Model model) {
			hospitalSpecialInterface.saveHospitalSpecial(hospitalSpecial);
			return "redirect:/hospitalspecial_list";
		}
		@GetMapping(value="/hospitalspecial_list")
		public String hospitalspecialList(Model model) {
			model.addAttribute("hospitalspecial", hospitalSpecialInterface.getAllHospitalSpecialList());
			return "hospitalspecial_list";
		}
}
