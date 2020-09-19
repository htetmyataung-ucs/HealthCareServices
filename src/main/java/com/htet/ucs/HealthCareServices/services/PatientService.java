package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.PatientDTO;
import com.htet.ucs.HealthCareServices.repository.PatientRepository;
import com.htet.ucs.HealthCareServices.service.mapper.PatientConverter;

@Service
public class PatientService implements PatientInterface{
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void savePatient(PatientDTO patientDTO) {
		// TODO Auto-generated method stub
		patientRepository.save(PatientConverter.convertToEntity(patientDTO));
	}

	@Override
	public List<PatientDTO> getAllPatientList() {
		// TODO Auto-generated method stub
		return patientRepository.findAll().stream().map(PatientConverter::convertToDTO).collect(Collectors.toList());
	}
	
}
