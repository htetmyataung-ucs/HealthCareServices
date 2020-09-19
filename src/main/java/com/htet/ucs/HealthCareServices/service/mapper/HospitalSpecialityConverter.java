package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;
import com.htet.ucs.HealthCareServices.model.HospitalSpecial;

public class HospitalSpecialityConverter {
	
	public static HospitalSpecial convertToEntity(HospitalSpecialDTO dto) {
		HospitalSpecial hs=new HospitalSpecial();
		hs.getHospital().setId(dto.getHospitalId());
		hs.getSpeciality().setId(dto.getSpecialityId());
		hs.setStatus(dto.isStatus());
		return hs;
	}
	
	public static HospitalSpecialDTO convertToDTO(HospitalSpecial hs) {
		HospitalSpecialDTO hsdto=new HospitalSpecialDTO();
		hsdto.setId(hs.getId());
		hsdto.setHospitalName(hs.getHospital().getName());
		hsdto.setSpecialityName(hs.getSpeciality().getName());
		hsdto.setStatus(hs.isStatus());
		return hsdto;
	}

}
