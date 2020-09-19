package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	
		@GetMapping("/create_hospitalDoctor")
		public String createHospitalDoctor(Model model) {
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			model.addAttribute("hospitaldoctor", new HospitalDoctorDTO());
			model.addAttribute("doctorList", doctorInterface.getAllDoctorList()); 
			return "hospitaldoctor";
		}

		@PostMapping("/create_hospitalDoctor")
		public String saveHospitalDoctor(@ModelAttribute("hospitaldoctor") HospitalDoctorDTO hd, Model model) {
			hospitalDoctorInterface.saveHospitalDoctor(hd);
			return "redirect:/hospitaldoctorlist";
		}

		@GetMapping("/hospitaldoctorlist")
		public String hospitalDoctorList(Model model){
			model.addAttribute("hospitaldoctor",hospitalDoctorInterface.getAllHospitalDoctorList());
			return "hospitaldoctor_list";
		}

}
