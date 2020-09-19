package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;
import com.htet.ucs.HealthCareServices.model.HospitalCategory;

public class HospitalCategoryConverter {
	public static HospitalCategory convertToEntity(HospitalCategoryDTO dto) {
		HospitalCategory hc = new HospitalCategory();
		hc.setName(dto.getName());
		hc.setHospital(dto.getHospital());
		return hc;
	}
	
	public static HospitalCategoryDTO convertToDTO(HospitalCategory hc) {
		HospitalCategoryDTO hcdto = new HospitalCategoryDTO();
		hcdto.setId(hc.getId());
		hcdto.setName(hc.getName());
		hcdto.setHospital(hc.getHospital());
		return hcdto;
	}
}
