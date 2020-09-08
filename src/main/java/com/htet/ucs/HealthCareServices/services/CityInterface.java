package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.CityDTO;


public interface CityInterface {
	void saveCity(CityDTO cityDTO);
	List<CityDTO> getAllCityList();
}
