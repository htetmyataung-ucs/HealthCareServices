package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.CityDTO;
import com.htet.ucs.HealthCareServices.model.City;

public class CityConverter {

	public static City convertToEntity(CityDTO dto) {
		City c = new City();
		if(dto.getId()!=null) {
			c.setId(dto.getId());
		}
		c.setName(dto.getName());
		c.setTownship(dto.getTownship());
		return c;
	}
	
	public static CityDTO convertToDTO(City dto) {
		CityDTO cdto=new CityDTO();
		cdto.setId(dto.getId());
		cdto.setName(dto.getName());
		cdto.setTownship(dto.getTownship());
		return cdto;
	}
}
