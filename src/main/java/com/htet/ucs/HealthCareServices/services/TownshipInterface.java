package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.TownshipDTO;

public interface TownshipInterface {

	void saveTownship(TownshipDTO townshipDTO);
	List<TownshipDTO> getAllTownshipList();
}
