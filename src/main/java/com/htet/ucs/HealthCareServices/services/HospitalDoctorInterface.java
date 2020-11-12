package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;

public interface HospitalDoctorInterface {
	//to set
	void saveHospitalDoctor(HospitalDoctorDTO hospitalDoctorDTO);
	//to get
	List<HospitalDoctorDTO> getAllHospitalDoctorList();
	//to edit
	HospitalDoctorDTO findById(Long id);
	//to delete
	void delete(Long id);
	//to find ALL Detail by Hospital Id
	List<HospitalDoctorDTO> getAllDetailByHospitalId(Long id);
}
