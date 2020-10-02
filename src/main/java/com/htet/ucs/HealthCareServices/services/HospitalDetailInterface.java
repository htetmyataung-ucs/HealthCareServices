package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;

public interface HospitalDetailInterface {
	//to set
	void saveHospitalDetail(HospitalDetailDTO hospitalDetailDTO);
	//to get
	List<HospitalDetailDTO> getAllHospitalDetailList();
	//to edit
	HospitalDetailDTO findById(Long id);
	//to delete
	void delete(Long id);
}
