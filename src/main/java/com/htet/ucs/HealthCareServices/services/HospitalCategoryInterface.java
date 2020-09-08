package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;

public interface HospitalCategoryInterface {
	
	void saveHospitalCategory(HospitalCategoryDTO dto);
	List<HospitalCategoryDTO> getAllHospitalCategoryList();

}
