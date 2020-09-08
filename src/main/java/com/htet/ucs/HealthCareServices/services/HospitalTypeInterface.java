package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;

public interface HospitalTypeInterface {

	 void saveHospitalType(HospitalTypeDTO hostypeDTO);
	 List<HospitalTypeDTO> getAllHospitalTypeList();
}
