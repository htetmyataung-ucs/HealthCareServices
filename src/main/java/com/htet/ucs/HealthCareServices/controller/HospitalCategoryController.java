package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;
import com.htet.ucs.HealthCareServices.services.HospitalCategoryInterface;

@Controller
public class HospitalCategoryController {
	@Autowired
	private HospitalCategoryInterface hospitalCategoryInterface;

	//**************HOSPITAL CATEGORY*****************
	
		/*@PostMapping(path="/addhospitalcategory") // Map ONLY POST Requests
		  public @ResponseBody String addNewHospitalCategory (@RequestParam String name) {
		    // @ResponseBody means the returned String is the response, not a view name
		    // @RequestParam means it is a parameter from the GET or POST request

		    HospitalCategory hc = new HospitalCategory();
		   
		    hc.setName(name);
		    hospitalcategoryRepository.save(hc);
		    return "Saved";
		  }*/

		@GetMapping("/create_hospitalCategory")
		public String createHospitalCategory(Model model) {
			model.addAttribute("hospitalcategory", new HospitalCategoryDTO());
			return "hospitalcategory";
		}
		@PostMapping("/create_hospitalCategory")
		public String saveHospitalCategory(@ModelAttribute("hospitalcategory") HospitalCategoryDTO hc, Model model) {
			hospitalCategoryInterface.saveHospitalCategory(hc);
			return "redirect:/hospitalcategory_list";
		}	
		@GetMapping(value="/hospitalcategory_list")
		public String hospitalcategoryList(Model model) {
			model.addAttribute("hospitalcategory",	hospitalCategoryInterface.getAllHospitalCategoryList());
			return "hospitalcategory_list";
		}
		
}
