package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.CityDTO;
import com.htet.ucs.HealthCareServices.model.City;
import com.htet.ucs.HealthCareServices.repository.CityRepository;
@Service
public class CityService implements CityInterface{
	@Autowired
	private CityRepository cityRepository;

	@Override
	public void saveCity(CityDTO cityDTO) {
		// TODO Auto-generated method stub
		cityRepository.save(converCity(cityDTO));
	}

	@Override
	public List<CityDTO> getAllCityList() {
		// TODO Auto-generated method stub
		List<City> city = cityRepository.findAll();
		List<CityDTO> dtoList=city.stream().map(c->convertCityDTO(c)).collect(Collectors.toList());		
		return dtoList;
	}
	
	City converCity(CityDTO dto) {
		City c = new City();
		c.setName(dto.getName());
		c.setTownship(dto.getTownship());
		return c;
	}
	
	CityDTO convertCityDTO(City dto) {
		CityDTO cdto=new CityDTO();
		cdto.setName(dto.getName());
		cdto.setTownship(dto.getTownship());
		return cdto;
	}

}
