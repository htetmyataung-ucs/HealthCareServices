package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;

public interface HospitalTypeInterface {
	//to set
	 void saveHospitalType(HospitalTypeDTO hostypeDTO);
	 //to get
	 List<HospitalTypeDTO> getAllHospitalTypeList();
	 //to edit
	 HospitalTypeDTO findById(Long id);
	 //to delete
	 void delete(Long id);
}
