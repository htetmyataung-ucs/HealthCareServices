package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.model.TownShip;

public class TownShipConverter {
	public static TownShip convertToEntity(TownshipDTO townshipDTO) {
		TownShip township = new TownShip();
		township.setName(townshipDTO.getName());
		township.getCity().setId(townshipDTO.getCity_id());
		return township; 
	}
	public static TownshipDTO convertToDTO(TownShip township) {
		TownshipDTO townshipDTO = new TownshipDTO();
		townshipDTO.setId(township.getId());
		townshipDTO.setName(township.getName());
		townshipDTO.setCityName(township.getCity().getName());
		return townshipDTO;
	}
}
