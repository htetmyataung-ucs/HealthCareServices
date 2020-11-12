package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalServiceDTO;
import com.htet.ucs.HealthCareServices.dto.ManageHospitalServiceDTO;

public interface HospitalServiceInterface {
	//to set
	void saveHospitalService(ManageHospitalServiceDTO dto);
	//to get
	List<HospitalServiceDTO> getAllHospitalServiceList();
	//to edit
	HospitalServiceDTO findById(Long id);
	//to delete
	void delete(Long id);
	//to find all hospitalservice detail
	List<HospitalServiceDTO> findHospitalServiceByHospitalId(Long id);
}
