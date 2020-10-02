package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

		@GetMapping("admin/create_hospitalCategory")
		public String createHospitalCategory(Model model) {
			model.addAttribute("hospitalcategory", new HospitalCategoryDTO());
			return "adminHospitalCategory";
		}
		@PostMapping("admin/create_hospitalCategory")
		public String saveHospitalCategory(@ModelAttribute("hospitalcategory") HospitalCategoryDTO hc, Model model) {
			hospitalCategoryInterface.saveHospitalCategory(hc);
			return "redirect:/admin/hospitalcategory_list";
		}	
		@GetMapping(value="admin/hospitalcategory_list")
		public String hospitalcategoryList(Model model) {
			model.addAttribute("hospitalCategoryList",	hospitalCategoryInterface.getAllHospitalCategoryList());
			return "adminHospitalCategoryList";
		}
		
		
		//FOR EDIT AND DELETE CITY
		
		@GetMapping("admin/editHospitalCategory/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			HospitalCategoryDTO dto=hospitalCategoryInterface.findById(id);
			model.addAttribute("hospitalCategory", dto);
			return "adminHospitalCategoryEdit";
		}
		@PostMapping("admin/editHospitalCategory")
		public String editHospitalCategory(@ModelAttribute(value="hospitalCategory") HospitalCategoryDTO dto,Model model) {
			hospitalCategoryInterface.saveHospitalCategory(dto);
			return "redirect:/admin/hospitalcategory_list";
		}
		@GetMapping("admin/deleteHospitalCategory/{id}")
		public String delete(@PathVariable Long id) {
			hospitalCategoryInterface.delete(id);
			return "redirect:/admin/hospitalcategory_list";
		}
		
}
