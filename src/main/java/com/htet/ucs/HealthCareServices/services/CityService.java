package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.CityDTO;
import com.htet.ucs.HealthCareServices.repository.CityRepository;
import com.htet.ucs.HealthCareServices.service.mapper.CityConverter;
@Service
public class CityService implements CityInterface{
	@Autowired
	private CityRepository cityRepository;

	@Override
	public void saveCity(CityDTO cityDTO) {
		// TODO Auto-generated method stub
		cityRepository.save(CityConverter.convertToEntity(cityDTO));
	}

	@Override
	public List<CityDTO> getAllCityList() {
		// TODO Auto-generated method stub
		return cityRepository.findAll().stream().map(CityConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public CityDTO findById(Long id) {
		// TODO Auto-generated method stub
		CityDTO dto = CityConverter.convertToDTO(cityRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cityRepository.deleteById(id);
	}

}
