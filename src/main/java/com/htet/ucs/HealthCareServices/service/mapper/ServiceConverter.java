package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.ServiceDTO;
import com.htet.ucs.HealthCareServices.model.Service;

public class ServiceConverter {
	
	public static ServiceDTO convertToDTO(Service s) {
		ServiceDTO dto = new ServiceDTO();
		dto.setId(s.getId());
		dto.setName(s.getName());
		dto.setDescription(s.getDescription());
		dto.setPhoto(s.getPhoto());
		return dto;
	}
}
