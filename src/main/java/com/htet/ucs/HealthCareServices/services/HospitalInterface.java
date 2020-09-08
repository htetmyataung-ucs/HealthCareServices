package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalDTO;

public interface HospitalInterface {

	void saveHospital(HospitalDTO dto);
	List<HospitalDTO> getAllHospitalList();
}
