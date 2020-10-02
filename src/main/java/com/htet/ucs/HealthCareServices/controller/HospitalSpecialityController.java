package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		@GetMapping("admin/create_hospitalspecial")
		public String createHospitalSpecial(Model model) {
			model.addAttribute("hospitalspecial", new HospitalSpecialDTO());
			model.addAttribute("specialityList", specialityInterface.getAllSpecialityList());
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			return "adminHospitalSpeciality";
		}
		@PostMapping("admin/create_hospitalspecial")
		public String saveHospitalSpecial(@ModelAttribute("hospitalspecial") HospitalSpecialDTO hospitalSpecial, Model model) {
			hospitalSpecialInterface.saveHospitalSpecial(hospitalSpecial);
			return "redirect:/admin/hospitalspecial_list";
		}
		@GetMapping(value="admin/hospitalspecial_list")
		public String hospitalspecialList(Model model) {
			model.addAttribute("hospitalSpecialList", hospitalSpecialInterface.getAllHospitalSpecialList());
			return "adminHospitalSpecialityList";
		}
		
		
		//FOR EDIT AND DELETE CITY
		
		@GetMapping("admin/edit_hospitalSpecial/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			HospitalSpecialDTO dto=hospitalSpecialInterface.findById(id);
			model.addAttribute("hospitalspecial", dto);
			model.addAttribute("specialityList", specialityInterface.getAllSpecialityList());
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			return "adminHospitalSpecialityEdit";
		}
		@PostMapping("admin/edit_hospitalSpecial")
		public String editHospitalSpeciality(@ModelAttribute(value="hospitalspecial") HospitalSpecialDTO dto,Model model) {
			hospitalSpecialInterface.saveHospitalSpecial(dto);
			return "redirect:/admin/hospitalspecial_list";
		}
		@GetMapping("admin/delete_hospitalSpecial/{id}")
		public String delete(@PathVariable Long id) {
			hospitalSpecialInterface.delete(id);
			return "redirect:/admin/hospitalspecial_list";
		}
}
