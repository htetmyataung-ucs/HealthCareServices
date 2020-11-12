package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalServiceDTO;
import com.htet.ucs.HealthCareServices.model.HospitalService;

public class HospitalServiceConverter {

	public static HospitalServiceDTO convertToDTO(HospitalService hs) {
		HospitalServiceDTO dto = new HospitalServiceDTO();
		dto.setId(hs.getId());
		dto.setHospitalId(hs.getHospital().getId());
		dto.setHospitalName(hs.getHospital().getName());
		dto.setServiceId(hs.getService().getId());
		dto.setServiceName(hs.getService().getName());
		return dto;
	}
	public static HospitalServiceDTO toSearchHospitalService(HospitalService hs) {
		HospitalServiceDTO dto = new HospitalServiceDTO();
		dto.setId(hs.getId());
		dto.setHospitalId(hs.getHospital().getId());
		dto.setServiceId(hs.getService().getId());
		dto.setServiceName(hs.getService().getName());
		dto.setServiceDescription(hs.getService().getDescription());
		dto.setServicePhoto(hs.getService().getPhoto());
		return dto;
	}
}
