package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;

public interface HospitalSpecialInterface {
	
	void saveHospitalSpecial(HospitalSpecialDTO dto);
	List<HospitalSpecialDTO> getAllHospitalSpecialList();

}
