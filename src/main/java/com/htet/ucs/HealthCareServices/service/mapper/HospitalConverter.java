package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalDTO;
import com.htet.ucs.HealthCareServices.model.Hospital;

public class HospitalConverter {

	public static Hospital convertToEntity(HospitalDTO dto) {
		Hospital h = new Hospital();
		if(dto.getId()!=null) {
			h.setId(dto.getId());
		}
		h.setName(dto.getName());	
		h.getHospitalCategory().setId(dto.getHospitalCategoryId());
		h.getHospitalType().setId(dto.getHospitalTypeId());
		h.getTownShip().setId(dto.getTownShipId());
		
		h.setBooking(dto.getBooking());
		h.setReviews(dto.getReviews());
		h.setHospitalSpeciality(dto.getHospitalSpeciality());
		h.setHospitalDoctor(dto.getHospitalDoctor());
		return h;
	}
	
	public static HospitalDTO convertToDTO(Hospital h) {
		HospitalDTO hdto = new HospitalDTO();
		hdto.setId(h.getId());
		hdto.setName(h.getName());
		
		hdto.setHospitalCategoryName(h.getHospitalCategory().getName());
		hdto.setHospitalTypeName(h.getHospitalType().getName());
		hdto.setTownShipName(h.getTownShip().getName());
		
		hdto.setBooking(h.getBooking());
		hdto.setReviews(h.getReviews());
		hdto.setHospitalSpeciality(h.getHospitalSpeciality());
		hdto.setHospitalDoctor(h.getHospitalDoctor());
		return hdto;
	}
	public static HospitalDTO toSearchHospital(Hospital h) {
		HospitalDTO hd = new HospitalDTO();
		hd.setId(h.getId());
		hd.setName(h.getName());
		hd.setHospitalCategoryName(h.getHospitalCategory().getName());
		hd.setHospitalTypeName(h.getHospitalType().getName());
		hd.setTownShipName(h.getTownShip().getName());
		return hd;
	}

}
