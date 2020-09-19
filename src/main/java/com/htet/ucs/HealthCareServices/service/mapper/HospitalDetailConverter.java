package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.model.HospitalDetail;

public class HospitalDetailConverter {
	public static HospitalDetail convertToEntity(HospitalDetailDTO hdDTO) {
		HospitalDetail hd = new HospitalDetail();
		hd.setPhone(hdDTO.getPhone());
		hd.setAddress(hdDTO.getAddress());
		hd.setDate(hdDTO.getDate());
		hd.setTime(hdDTO.getTime());
		hd.getHospital().setId(hdDTO.getHospitalId());
		return hd;
	}
	
	public static HospitalDetailDTO convertToDTO(HospitalDetail hdDTO) {
		HospitalDetailDTO hd = new HospitalDetailDTO();
		hd.setId(hdDTO.getId());
		hd.setPhone(hdDTO.getPhone());
		hd.setAddress(hdDTO.getAddress());
		hd.setDate(hdDTO.getDate());
		hd.setTime(hdDTO.getTime());
		hd.setHospitalName(hdDTO.getHospital().getName());
		return hd;
	}
}
