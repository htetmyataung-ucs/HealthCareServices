package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		@GetMapping("admin/create_hospitalType")
		public String createHospitalType(Model model) {
			model.addAttribute("hospitaltype", new HospitalTypeDTO());
			return "adminHospitalType";
		}

		@PostMapping("admin/create_hospitalType")
		public String saveHospitaltype(@ModelAttribute("hospitaltype") HospitalTypeDTO ht, Model model) {
			hospitalTypeInterface.saveHospitalType(ht);
			return "redirect:/admin/hospitaltype_list";
		}
		
		@GetMapping("admin/hospitaltype_list")
		public String hospitaltypeList(Model model) {
			model.addAttribute("hospitalTypeList",	hospitalTypeInterface.getAllHospitalTypeList());
			return "adminHospitalTypeList";
		}
		
		
		//FOR EDIT AND DELETE CITY
		
		@GetMapping("admin/edit_hospitalType/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			HospitalTypeDTO dto=hospitalTypeInterface.findById(id);
			model.addAttribute("hospitalType", dto);
			return "adminHospitalTypeEdit";
		}
		@PostMapping("admin/edit_hospitalType")
		public String editHospitalType(@ModelAttribute(value="hospitalType") HospitalTypeDTO dto,Model model) {
			hospitalTypeInterface.saveHospitalType(dto);
			return "redirect:/admin/hospitaltype_list";
		}
		@GetMapping("admin/delete_hospitalType/{id}")
		public String delete(@PathVariable Long id) {
			hospitalTypeInterface.delete(id);
			return "redirect:/admin/hospitaltype_list";
		}
		
}
