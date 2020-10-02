package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;
import com.htet.ucs.HealthCareServices.model.HospitalType;

public class HospitalTypeConverter {
	public static HospitalType convertToEntity(HospitalTypeDTO dto) {
		HospitalType ht = new HospitalType();
		if(dto.getId()!=null) {
			ht.setId(dto.getId());
		}
		ht.setName(dto.getName());
		return ht;
	}
	
	public static HospitalTypeDTO convertToDTO(HospitalType dto) {
		HospitalTypeDTO ht = new HospitalTypeDTO();
		ht.setId(dto.getId());
		ht.setName(dto.getName());
		ht.setHospital(dto.getHospital());
		return ht;
	}
}
