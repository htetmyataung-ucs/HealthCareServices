package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;
import com.htet.ucs.HealthCareServices.repository.HospitalSpecialRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalSpecialityConverter;
@Service
public class HospitalSpecialService implements HospitalSpecialInterface{

	@Autowired
	private HospitalSpecialRepository hospitalspecialRepository;
	@Override
	public void saveHospitalSpecial(HospitalSpecialDTO dto) {
		// TODO Auto-generated method stub
		hospitalspecialRepository.save(HospitalSpecialityConverter.convertToEntity(dto));
	}

	@Override
	public List<HospitalSpecialDTO> getAllHospitalSpecialList() {
		// TODO Auto-generated method stub
		return hospitalspecialRepository.findAll().stream().map(HospitalSpecialityConverter::convertToDTO).collect(Collectors.toList());
	}
	
	//to edit
	@Override
	public HospitalSpecialDTO findById(Long id) {
		// TODO Auto-generated method stub
		HospitalSpecialDTO dto = HospitalSpecialityConverter.convertToDTO(hospitalspecialRepository.findById(id).get());
		return dto;
	}
	
	//to delete
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		hospitalspecialRepository.deleteById(id);
	}
}
