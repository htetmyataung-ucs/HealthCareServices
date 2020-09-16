package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;
import com.htet.ucs.HealthCareServices.model.Speciality;
import com.htet.ucs.HealthCareServices.repository.SpecialityRepository;
@Service
public class SpecialityService implements SpecialityInterface{

	@Autowired
	private SpecialityRepository specialitRepository;
	@Override
	public void saveSpeciality(SpecialityDTO sdto) {
		// TODO Auto-generated method stub
		specialitRepository.save(convertSpeciality(sdto));
	}

	@Override
	public List<SpecialityDTO> getAllSpecialityList() {
		// TODO Auto-generated method stub
		List<Speciality> sList = specialitRepository.findAll();
		List<SpecialityDTO> dtoList = sList.stream().map(s->convertSpecialityDTO(s)).collect(Collectors.toList());
		return dtoList;
	}
	
	Speciality convertSpeciality(SpecialityDTO dto) {
		Speciality s = new Speciality();
		s.setName(dto.getName());
		s.setHospitalSpecial(dto.getHospitalSpecial());
		s.setDoctor(dto.getDoctor());
		return s;
	}
	
	SpecialityDTO convertSpecialityDTO(Speciality s) {
		SpecialityDTO sdto = new SpecialityDTO();
		sdto.setName(s.getName());
		sdto.setHospitalSpecial(s.getHospitalSpecial());
		sdto.setDoctor(s.getDoctor());
		return sdto;
	}

}
