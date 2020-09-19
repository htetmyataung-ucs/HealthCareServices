package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;
import com.htet.ucs.HealthCareServices.repository.HospitalTypeRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalTypeConverter;
@Service
public class HospitalTypeService implements HospitalTypeInterface{

	@Autowired
	private HospitalTypeRepository hospitaltypeRepository;
	@Override
	public void saveHospitalType(HospitalTypeDTO hostypeDTO) {
		// TODO Auto-generated method stub
		hospitaltypeRepository.save(HospitalTypeConverter.convertToEntity(hostypeDTO));
	}

	@Override
	public List<HospitalTypeDTO> getAllHospitalTypeList() {
		// TODO Auto-generated method stub
		return hospitaltypeRepository.findAll().stream().map(HospitalTypeConverter::convertToDTO).collect(Collectors.toList());
	}
	
}
