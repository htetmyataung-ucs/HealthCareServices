package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalDTO;

public interface HospitalInterface {
	//to set
	void saveHospital(HospitalDTO dto);
	//to get
	List<HospitalDTO> getAllHospitalList();
	//to edit
	HospitalDTO findById(Long id);
	//to delete
	void delete(Long id);
	//to search hospital
	List<HospitalDTO> getHospitalByAllCat(Long townshipId, Long hospitalCategoryId, Long hospitalTypeId);
}
