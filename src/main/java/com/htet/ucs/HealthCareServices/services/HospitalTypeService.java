package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;
import com.htet.ucs.HealthCareServices.model.HospitalType;
import com.htet.ucs.HealthCareServices.repository.HospitalTypeRepository;
@Service
public class HospitalTypeService implements HospitalTypeInterface{

	@Autowired
	private HospitalTypeRepository hospitaltypeRepository;
	@Override
	public void saveHospitalType(HospitalTypeDTO hostypeDTO) {
		// TODO Auto-generated method stub
		hospitaltypeRepository.save(convertHospitalType(hostypeDTO));
	}

	@Override
	public List<HospitalTypeDTO> getAllHospitalTypeList() {
		// TODO Auto-generated method stub
		List<HospitalType> htList = hospitaltypeRepository.findAll();
		List<HospitalTypeDTO> dtoList=htList.stream().map(ht->convertHospitalTypeDTO(ht)).collect(Collectors.toList());		
		return dtoList;
	}
	
	HospitalType convertHospitalType(HospitalTypeDTO dto) {
		HospitalType ht = new HospitalType();
		ht.setName(dto.getName());
		ht.setHospital(dto.getHospital());
		return ht;
	}
	
	HospitalTypeDTO convertHospitalTypeDTO(HospitalType dto) {
		HospitalTypeDTO ht = new HospitalTypeDTO();
		ht.setName(dto.getName());
		ht.setHospital(dto.getHospital());
		return ht;
	}

}
