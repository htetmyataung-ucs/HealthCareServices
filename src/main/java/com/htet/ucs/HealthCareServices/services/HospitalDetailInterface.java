package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;

public interface HospitalDetailInterface {
	void saveHospitalDetail(HospitalDetailDTO hospitalDetailDTO);
	List<HospitalDetailDTO> getAllHospitalDetailList();
}
