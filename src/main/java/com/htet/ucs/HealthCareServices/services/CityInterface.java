package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.CityDTO;

public interface CityInterface {
	
	//to set
	void saveCity(CityDTO cityDTO);
	
	//to get
	List<CityDTO> getAllCityList();
	
	//to edit
	CityDTO findById(Long id);
	
	//to delete
	void delete(Long id);
}
