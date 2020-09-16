package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.DoctorDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;
import com.htet.ucs.HealthCareServices.services.DoctorInterface;
import com.htet.ucs.HealthCareServices.services.HospitalDoctorInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.SpecialityInterface;

@Controller
public class DoctorController {
	@Autowired
	private SpecialityInterface specialityInterface;
	@Autowired
	private DoctorInterface doctorInterface;
	@Autowired
	private HospitalDoctorInterface hospitalDoctorInterface;
	@Autowired
	private HospitalInterface hospitalInterface;
	
	//*************DOCTOR CONTROLLER****************

	@GetMapping("/create_doctor")
	public String createDoctor(Model model) {

		model.addAttribute("doctor", new DoctorDTO());
		model.addAttribute("speciality", specialityInterface.getAllSpecialityList());
		return "doctor";
	}

	@PostMapping("/create_doctor")
	public String saveDoctor(@ModelAttribute("doctor") DoctorDTO d, Model model) {
		doctorInterface.saveDoctor(d);
		return "redirect:/doctor_list";
	}

	@GetMapping("/doctor_list")
	public String doctorList(Model model) {
		model.addAttribute("doctor",doctorInterface.getAllDoctorList());
		return "doctor_list";
	}
	
	//***************HOSPITAL DOCTOR CONTROLLER**********
	
	@GetMapping("/create_hospitalDuoctor")
	public String createHospitalDoctor(Model model) {
		model.addAttribute("hospital", hospitalInterface.getAllHospitalList());
		model.addAttribute("hospitaldoctor", new HospitalDoctorDTO());
		model.addAttribute("doctor", doctorInterface.getAllDoctorList()); 
		return "hospitaldoctor";
	}

	@PostMapping("/create_hospitalDuoctor")
	public String saveHospitalDoctor(@ModelAttribute("hospitaldoctor") HospitalDoctorDTO hd, Model model) {
		hospitalDoctorInterface.saveHospitalDoctor(hd);
		return "redirect:/hospitaldoctorlist";
	}

	@GetMapping("/hospitaldoctorlist")
	public String hospitalDoctorList(Model model){
		model.addAttribute("hospitalDoctor",hospitalDoctorInterface.getAllHospitalDoctorList());
		return "hospitaldoctor_list";
	}

}
