package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.PatientDTO;
import com.htet.ucs.HealthCareServices.model.Patient;

public class PatientConverter {
	public static Patient convertToEntity(PatientDTO patientDTO) {
		Patient patient = new Patient();
		patient.setName(patientDTO.getName());
		patient.setPhone(patientDTO.getPhone());
		patient.setNrc(patientDTO.getNrc());
		patient.setAge(patientDTO.getAge());
		patient.setAddress(patientDTO.getAddress());
		patient.setBloodType(patientDTO.getBloodType());
		patient.getUser().setId(patientDTO.getUserId());
		patient.setBooking(patientDTO.getBooking());
		return patient;
	}
	public static PatientDTO convertToDTO(Patient patientDTO) {
		PatientDTO patient = new PatientDTO();
		patient.setId(patientDTO.getId());
		patient.setName(patientDTO.getName());
		patient.setPhone(patientDTO.getPhone());
		patient.setNrc(patientDTO.getNrc());
		patient.setAge(patientDTO.getAge());
		patient.setAddress(patientDTO.getAddress());
		patient.setBloodType(patientDTO.getBloodType());
		patient.setUserName(patientDTO.getUser().getName());
		patient.setBooking(patientDTO.getBooking());
		return patient;
	}
}
