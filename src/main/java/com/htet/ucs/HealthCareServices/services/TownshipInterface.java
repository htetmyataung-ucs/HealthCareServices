package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.TownshipDTO;

public interface TownshipInterface {
	
	//to get
	void saveTownship(TownshipDTO townshipDTO);
	
	//to set
	List<TownshipDTO> getAllTownshipList();
	
	List<TownshipDTO> getTownshipListByCity(Long id);
	
	//to edit
	TownshipDTO findById(Long id);
	
	//to delete
	void delete(Long id);
	
	//to search shop
	List<TownshipDTO> getTownshipById(Long id);
	
}
