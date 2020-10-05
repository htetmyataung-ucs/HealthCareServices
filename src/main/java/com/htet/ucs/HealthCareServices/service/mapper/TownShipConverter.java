package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.model.TownShip;

public class TownShipConverter {
	public static TownShip convertToEntity(TownshipDTO townshipDTO) {
		TownShip township = new TownShip();
		if(townshipDTO.getId()!=null) {
			township.setId(townshipDTO.getId());
		}
		township.setName(townshipDTO.getName());
		township.getCity().setId(townshipDTO.getCityId());
		return township; 
	}
	public static TownshipDTO convertToDTO(TownShip township) {
		TownshipDTO townshipDTO = new TownshipDTO();
		townshipDTO.setId(township.getId());
		townshipDTO.setName(township.getName());
		townshipDTO.setCityId(township.getCity().getId());
		townshipDTO.setCityName(township.getCity().getName());
		return townshipDTO;
	}
	public static TownshipDTO findByTownShipName(TownShip township) {
		TownshipDTO tDTO = new TownshipDTO();
		tDTO.setId(township.getId());
		tDTO.setName(township.getName());
		tDTO.setCityName(township.getCity().getName());
		tDTO.setCityId(township.getCity().getId());
		return tDTO;
	}
}
