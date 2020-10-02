package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;

public interface SpecialityInterface{
	//to set
	void saveSpeciality(SpecialityDTO sdto);
	//to get
	List<SpecialityDTO> getAllSpecialityList();
	//to edit
	SpecialityDTO findById(Long id);
	//to delete
	void delete(Long id);
}
