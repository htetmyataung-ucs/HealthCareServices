package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.PatientDTO;

public interface PatientInterface {
	void savePatient(PatientDTO patientDTO);
	List<PatientDTO> getAllPatientList();
}
