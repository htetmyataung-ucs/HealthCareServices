package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.PatientDTO;
import com.htet.ucs.HealthCareServices.model.Patient;
import com.htet.ucs.HealthCareServices.repository.PatientRepository;

@Service
public class PatientService implements PatientInterface{
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void savePatient(PatientDTO patientDTO) {
		// TODO Auto-generated method stub
		patientRepository.save(convertPatient(patientDTO));
	}

	@Override
	public List<PatientDTO> getAllPatientList() {
		// TODO Auto-generated method stub
		List<Patient> patient = patientRepository.findAll();
		List<PatientDTO> patientDTO= patient.stream().map(p->convertPatientDTO(p)).collect(Collectors.toList());
		return patientDTO;
	}
	Patient convertPatient(PatientDTO patientDTO) {
		Patient patient = new Patient();
		patient.setName(patientDTO.getName());
		patient.setPhone(patientDTO.getPhone());
		patient.setNrc(patientDTO.getNrc());
		patient.setAge(patientDTO.getAge());
		patient.setAddress(patientDTO.getAddress());
		patient.setBloodType(patientDTO.getBloodType());
		patient.setUser(patientDTO.getUser());
		patient.setBooking(patientDTO.getBooking());
		return patient;
	}
	PatientDTO convertPatientDTO(Patient patientDTO) {
		PatientDTO patient = new PatientDTO();
		patient.setName(patientDTO.getName());
		patient.setPhone(patientDTO.getPhone());
		patient.setNrc(patientDTO.getNrc());
		patient.setAge(patientDTO.getAge());
		patient.setAddress(patientDTO.getAddress());
		patient.setBloodType(patientDTO.getBloodType());
		patient.setUser(patientDTO.getUser());
		patient.setBooking(patientDTO.getBooking());
		return patient;
	}
}
