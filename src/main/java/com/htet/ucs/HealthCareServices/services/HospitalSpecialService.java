package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;
import com.htet.ucs.HealthCareServices.model.HospitalSpecial;
import com.htet.ucs.HealthCareServices.repository.HospitalSpecialRepository;
@Service
public class HospitalSpecialService implements HospitalSpecialInterface{

	@Autowired
	private HospitalSpecialRepository hospitalspecialRepository;
	@Override
	public void saveHospitalSpecial(HospitalSpecialDTO dto) {
		// TODO Auto-generated method stub
		hospitalspecialRepository.save(convertHospitalSpecial(dto));
	}

	@Override
	public List<HospitalSpecialDTO> getAllHospitalSpecialList() {
		// TODO Auto-generated method stub
		List<HospitalSpecial> hsList=hospitalspecialRepository.findAll();
		List<HospitalSpecialDTO> dtoList=hsList.stream().map(hs->convertHospitalSpecialDTO(hs)).collect(Collectors.toList());
		return dtoList;
	}
	
	HospitalSpecial convertHospitalSpecial(HospitalSpecialDTO dto) {
		HospitalSpecial hs=new HospitalSpecial();
		hs.setHospital(dto.getHospital());
		hs.setSpeciality(dto.getSpeciality());
		hs.setStatus(dto.isStatus());
		return hs;
	}
	
	HospitalSpecialDTO convertHospitalSpecialDTO(HospitalSpecial hs) {
		HospitalSpecialDTO hsdto=new HospitalSpecialDTO();
		hsdto.setHospital(hs.getHospital());
		hsdto.setSpeciality(hs.getSpeciality());
		hsdto.setStatus(hs.isStatus());
		return hsdto;
	}

}
