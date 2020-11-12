package com.htet.ucs.HealthCareServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;
import com.htet.ucs.HealthCareServices.services.DoctorInterface;
import com.htet.ucs.HealthCareServices.services.HospitalDoctorInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
@Controller
public class HospitalDoctorController {
	@Autowired
	private HospitalDoctorInterface hospitalDoctorInterface;
	@Autowired
	private HospitalInterface hospitalInterface;
	@Autowired
	private DoctorInterface doctorInterface;
	
	//***************HOSPITAL DOCTOR CONTROLLER**********
	
		@GetMapping("admin/create_hospitalDoctor")
		public String createHospitalDoctor(Model model) {
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			model.addAttribute("hospitaldoctor", new HospitalDoctorDTO());
			model.addAttribute("doctorList", doctorInterface.getAllDoctorList()); 
			return "adminHospitalDoctor";
		}

		@PostMapping("admin/create_hospitalDoctor")
		public String saveHospitalDoctor(@ModelAttribute("hospitaldoctor") HospitalDoctorDTO hd, Model model) {
			hospitalDoctorInterface.saveHospitalDoctor(hd);
			return "redirect:/admin/hospitaldoctorlist";
		}

		@GetMapping("admin/hospitaldoctorlist")
		public String hospitalDoctorList(Model model){
			model.addAttribute("hospitaldoctorList",hospitalDoctorInterface.getAllHospitalDoctorList());
			return "adminHospitalDoctorList";
		}

		//FOR EDIT AND DELETE CITY
		
		@GetMapping("admin/editHospitalDoctor/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			HospitalDoctorDTO dto=hospitalDoctorInterface.findById(id);
			model.addAttribute("hospitaldoctor", dto);
			model.addAttribute("doctorList", doctorInterface.getAllDoctorList()); 
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			return "adminHospitalDoctorEdit";
		}
		@PostMapping("admin/editHospitalDoctor")
		public String editHospitalDoctor(@ModelAttribute(value="hospitaldoctor") HospitalDoctorDTO dto,Model model) {
			hospitalDoctorInterface.saveHospitalDoctor(dto);
			return "redirect:/admin/hospitaldoctorlist";
		}
		@GetMapping("admin/deleteHospitalDoctor/{id}")
		public String delete(@PathVariable Long id) {
			hospitalDoctorInterface.delete(id);
			return "redirect:/admin/hospitaldoctorlist";
		}
		
		
		@GetMapping("/allInfoByHospitalId/{id}")
		public @ResponseBody List<HospitalDoctorDTO> hospitalDoctorInfo(Model model, @PathVariable Long id){
			return hospitalDoctorInterface.getAllDetailByHospitalId(id);
		}

}
