package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.RoleDTO;
import com.htet.ucs.HealthCareServices.model.Role;

public class RoleConverter {
	public static Role convertToEntity(RoleDTO role) {
		Role r = new Role();
		if(role.getId()!=null) {
		r.setId(role.getId());
		}
		r.setRole(role.getRole());
		return r;
	}
	public static RoleDTO convertToDTO(Role role) {
		RoleDTO r = new RoleDTO();
		r.setId(role.getId());
		r.setRole(role.getRole());
		return r;
	}
}
