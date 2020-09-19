package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;
import com.htet.ucs.HealthCareServices.services.HospitalTypeInterface;
@Controller
public class HospitalTypeController {
	
	@Autowired
	private HospitalTypeInterface hospitalTypeInterface;
	
	//****************HOSPITAL TYPE*****************
	
		/*@PostMapping(path="/addhospitaltype") // Map ONLY POST Requests
		  public @ResponseBody String addNewHospitalType (@RequestParam String name) {
		    // @ResponseBody means the returned String is the response, not a view name
		    // @RequestParam means it is a parameter from the GET or POST request

		    HospitalTypeDTO ht = new HospitalTypeDTO();
		   
		    ht.setName(name);
		    hospitalTypeInterface.saveHospitalType(ht);
		    return "Saved";
		  }*/
		
		@GetMapping("/create_hospitalType")
		public String createHospitalType(Model model) {
			model.addAttribute("hospitaltype", new HospitalTypeDTO());
			return "hospitaltype";
		}

		@PostMapping("/create_hospitalType")
		public String saveHospitaltype(@ModelAttribute("hospitaltype") HospitalTypeDTO ht, Model model) {
			hospitalTypeInterface.saveHospitalType(ht);
			return "redirect:/hospitaltype_list";
		}
		
		@GetMapping("/hospitaltype_list")
		public String hospitaltypeList(Model model) {
			model.addAttribute("hospitaltype",	hospitalTypeInterface.getAllHospitalTypeList());
			return "hospitaltype_list";
		}
		
		
		
}
