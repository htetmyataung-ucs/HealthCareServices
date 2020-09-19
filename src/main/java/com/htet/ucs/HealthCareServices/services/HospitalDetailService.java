package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.repository.HospitalDetailRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalDetailConverter;

@Service
public class HospitalDetailService implements HospitalDetailInterface{
	@Autowired
	private HospitalDetailRepository hospitalDetailRepository;
	@Override
	public void saveHospitalDetail(HospitalDetailDTO hospitalDetailDTO) {
		// TODO Auto-generated method stub
		hospitalDetailRepository.save(HospitalDetailConverter.convertToEntity(hospitalDetailDTO));
	}

	@Override
	public List<HospitalDetailDTO> getAllHospitalDetailList() {
		// TODO Auto-generated method stub
		return hospitalDetailRepository.findAll().stream().map(HospitalDetailConverter::convertToDTO).collect(Collectors.toList());
	}
}
