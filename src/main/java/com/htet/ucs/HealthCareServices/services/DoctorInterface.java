package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.DoctorDTO;

public interface DoctorInterface {
	//to set
	void saveDoctor(DoctorDTO doctorDTO);
	//to get
	List<DoctorDTO> getAllDoctorList();
	//to edit
	DoctorDTO findById(Long id);
	//to delete
	void delete(Long id);
}
