package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;

public interface HospitalDoctorInterface {
	void saveHospitalDoctor(HospitalDoctorDTO hospitalDoctorDTO);
	List<HospitalDoctorDTO> getAllHospitalDoctorList();
}
