package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.SpecialityDTO;
import com.htet.ucs.HealthCareServices.model.Speciality;

public class SpecialityConverter {
	
	public static Speciality convertToEntity(SpecialityDTO dto) {
		Speciality s = new Speciality();
		s.setName(dto.getName());
		s.setHospitalSpecial(dto.getHospitalSpecial());
		s.setDoctor(dto.getDoctor());
		return s;
	}
	
	public static SpecialityDTO convertToDTO(Speciality s) {
		SpecialityDTO sdto = new SpecialityDTO();
		sdto.setId(s.getId());
		sdto.setName(s.getName());
		sdto.setHospitalSpecial(s.getHospitalSpecial());
		sdto.setDoctor(s.getDoctor());
		return sdto;
	}
}
