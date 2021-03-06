package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;
import com.htet.ucs.HealthCareServices.repository.HospitalDoctorReposity;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalDoctorConverter;

@Service
public class HospitalDoctorService implements HospitalDoctorInterface{
	@Autowired
	private HospitalDoctorReposity hospitalDoctorRepository;
	@Override
	public void saveHospitalDoctor(HospitalDoctorDTO hospitalDoctorDTO) {
		// TODO Auto-generated method stub
		hospitalDoctorRepository.save(HospitalDoctorConverter.convertToEntity(hospitalDoctorDTO));
	}

	@Override
	public List<HospitalDoctorDTO> getAllHospitalDoctorList() {
		// TODO Auto-generated method stub
		return hospitalDoctorRepository.findAll().stream().map(HospitalDoctorConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public HospitalDoctorDTO findById(Long id) {
		// TODO Auto-generated method stub
		HospitalDoctorDTO dto = HospitalDoctorConverter.convertToDTO(hospitalDoctorRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		hospitalDoctorRepository.deleteById(id);
	}

	@Override
	public List<HospitalDoctorDTO> getAllDetailByHospitalId(Long id) {
		// TODO Auto-generated method stub
		return hospitalDoctorRepository.findDoctorByHospitalId(id).stream().map(HospitalDoctorConverter::toSearchDoctorInfo).collect(Collectors.toList());
	}
	
}
