package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.RoleDTO;

public interface RoleInterface {
	void saveRole(RoleDTO role);
	List<RoleDTO> getAllRoll();
}
