package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;
import com.htet.ucs.HealthCareServices.repository.SpecialityRepository;
import com.htet.ucs.HealthCareServices.service.mapper.SpecialityConverter;
@Service
public class SpecialityService implements SpecialityInterface{

	@Autowired
	private SpecialityRepository specialitRepository;
	@Override
	public void saveSpeciality(SpecialityDTO sdto) {
		// TODO Auto-generated method stub
		specialitRepository.save(SpecialityConverter.convertToEntity(sdto));
	}

	@Override
	public List<SpecialityDTO> getAllSpecialityList() {
		return specialitRepository.findAll().stream().map(SpecialityConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public SpecialityDTO findById(Long id) {
		// TODO Auto-generated method stub
		SpecialityDTO dto = SpecialityConverter.convertToDTO(specialitRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		specialitRepository.deleteById(id);
	}
	
}
