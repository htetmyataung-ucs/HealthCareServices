package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDTO;
import com.htet.ucs.HealthCareServices.model.Hospital;
import com.htet.ucs.HealthCareServices.repository.HospitalRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalConverter;
@Service
public class HospitalService implements HospitalInterface{

	@Autowired
	private HospitalRepository hospitalRepository;
	@Override
	public void saveHospital(HospitalDTO dto) {
		// TODO Auto-generated method stub
		hospitalRepository.save(HospitalConverter.convertToEntity(dto));
	}

	@Override
	public List<HospitalDTO> getAllHospitalList() {
		// TODO Auto-generated method stub
		return hospitalRepository.findAll().stream().map(HospitalConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public HospitalDTO findById(Long id) {
		// TODO Auto-generated method stub
		HospitalDTO dto = HospitalConverter.convertToDTO(hospitalRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		hospitalRepository.deleteById(id);
	}

	@Override
	public List<HospitalDTO> getHospitalByAllCat(Long townshipId, Long hospitalCategoryId, Long hospitalTypeId) {
		// TODO Auto-generated method stub	
		List<Hospital> hospitals=hospitalRepository.findHospitalByAllCat(townshipId, hospitalCategoryId, hospitalTypeId);
		return hospitals.stream().map(HospitalConverter::toSearchHospital).collect(Collectors.toList());
	}
	
}
