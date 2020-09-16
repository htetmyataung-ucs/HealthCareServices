package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.DoctorDTO;

public interface DoctorInterface {
	void saveDoctor(DoctorDTO doctorDTO);
	List<DoctorDTO> getAllDoctorList();
}
