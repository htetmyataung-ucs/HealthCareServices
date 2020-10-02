package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;

public interface HospitalCategoryInterface {
	//to set
	void saveHospitalCategory(HospitalCategoryDTO dto);
	//to get
	List<HospitalCategoryDTO> getAllHospitalCategoryList();
	//to edit
	HospitalCategoryDTO findById(Long id);
	//to delete
	void delete(Long id);

}
