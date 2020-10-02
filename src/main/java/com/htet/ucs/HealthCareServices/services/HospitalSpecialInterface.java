package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;

public interface HospitalSpecialInterface {
	//to set
	void saveHospitalSpecial(HospitalSpecialDTO dto);
	//to get
	List<HospitalSpecialDTO> getAllHospitalSpecialList();
	//to edit
	HospitalSpecialDTO findById(Long id);
	//to delete
	void delete(Long id);

}
