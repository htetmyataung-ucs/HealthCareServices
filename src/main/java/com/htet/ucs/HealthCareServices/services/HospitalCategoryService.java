package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;
import com.htet.ucs.HealthCareServices.repository.HospitalCategoryRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalCategoryConverter;
@Service
public class HospitalCategoryService implements HospitalCategoryInterface{

	@Autowired
	private HospitalCategoryRepository hospitalcategoryRepository;
	@Override
	public void saveHospitalCategory(HospitalCategoryDTO dto) {
		// TODO Auto-generated method stub
		hospitalcategoryRepository.save(HospitalCategoryConverter.convertToEntity(dto));
	}

	@Override
	public List<HospitalCategoryDTO> getAllHospitalCategoryList() {
		// TODO Auto-generated method stub
		return hospitalcategoryRepository.findAll().stream().map(HospitalCategoryConverter::convertToDTO).collect(Collectors.toList());
	}
}
