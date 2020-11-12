package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ServiceDTO;

public interface ServiceInterface {
	//to save
	void saveService(ServiceDTO dto);
	//to get
	List<ServiceDTO> getAllServiceList();
	//to edit
	ServiceDTO findById(Long id);
	//to delete
	void delete(Long id);
}
