package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.PatientDTO;
import com.htet.ucs.HealthCareServices.services.PatientInterface;

@Controller
public class PatientController {
	@Autowired
	private PatientInterface patientInterface;
	//PATIENT
	
	@GetMapping("/create_patient")
	public String createPatient(Model model) {
		model.addAttribute("patient", new PatientDTO());
		return "patient";
	}

	@PostMapping("/create_patient")
	public String savePatient(@ModelAttribute("patient") PatientDTO patient, Model model) {
		patientInterface.savePatient(patient);
		return "redirect:/patientList";
	}

	@GetMapping(value="/patientList")
	public String patientList(Model model) {
		model.addAttribute("patientList", patientInterface.getAllPatientList());		
		return "patient_list";
	}
	
	
}
