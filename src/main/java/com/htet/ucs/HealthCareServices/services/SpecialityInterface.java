package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;

public interface SpecialityInterface{

	void saveSpeciality(SpecialityDTO sdto);
	List<SpecialityDTO> getAllSpecialityList();
}
