package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.DoctorDTO;
import com.htet.ucs.HealthCareServices.services.DoctorInterface;
import com.htet.ucs.HealthCareServices.services.SpecialityInterface;

@Controller
public class DoctorController {
	@Autowired
	private SpecialityInterface specialityInterface;
	@Autowired
	private DoctorInterface doctorInterface;
	
	//*************DOCTOR CONTROLLER****************

	@GetMapping("admin/create_doctor")
	public String createDoctor(Model model) {

		model.addAttribute("doctor", new DoctorDTO());
		model.addAttribute("specialityList", specialityInterface.getAllSpecialityList());
		return "adminDoctor";
	}

	@PostMapping("admin/create_doctor")
	public String saveDoctor(@ModelAttribute("doctor") DoctorDTO d, Model model) {
		doctorInterface.saveDoctor(d);
		return "redirect:/admin/doctor_list";
	}

	@GetMapping("admin/doctor_list")
	public String doctorList(Model model) {
		model.addAttribute("doctorList",doctorInterface.getAllDoctorList());
		return "adminDoctorList";
	}
	
	//FOR EDIT AND DELETE CITY
	
			@GetMapping("admin/editDoctor/{id}")
			public String edit(@PathVariable Long id,Model model) {
				if(id==null) {
					
				}
				DoctorDTO dto=doctorInterface.findById(id);
				model.addAttribute("doctor", dto);
				model.addAttribute("specialityList", specialityInterface.getAllSpecialityList());
				return "adminDoctorEdit";
			}
			@PostMapping("admin/editDoctor")
			public String editDoctor(@ModelAttribute(value="doctor") DoctorDTO dto,Model model) {
				doctorInterface.saveDoctor(dto);
				return "redirect:/admin/doctor_list";
			}
			@GetMapping("admin/deleteDoctor/{id}")
			public String delete(@PathVariable Long id) {
				doctorInterface.delete(id);
				return "redirect:/admin/doctor_list";
			}
	
	
}
