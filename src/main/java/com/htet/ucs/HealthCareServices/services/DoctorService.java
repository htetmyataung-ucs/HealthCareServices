package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.DoctorDTO;
import com.htet.ucs.HealthCareServices.repository.DoctorRepository;
import com.htet.ucs.HealthCareServices.service.mapper.DoctorConverter;

@Service
public class DoctorService implements DoctorInterface{
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public void saveDoctor(DoctorDTO doctorDTO) {
		doctorRepository.save(DoctorConverter.convertToEntity(doctorDTO));
	}

	@Override
	public List<DoctorDTO> getAllDoctorList() {
		return doctorRepository.findAll().stream().map(DoctorConverter::convertToDTO).collect(Collectors.toList());
	}
	
}
