package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.RoleDTO;
import com.htet.ucs.HealthCareServices.repository.RoleRepository;
import com.htet.ucs.HealthCareServices.service.mapper.RoleConverter;

@Service
public class RoleService implements RoleInterface{
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void saveRole(RoleDTO role) {
		// TODO Auto-generated method stub
		roleRepository.save(RoleConverter.convertToEntity(role));
	}

	@Override
	public List<RoleDTO> getAllRoll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll().stream().map(RoleConverter::convertToDTO).collect(Collectors.toList());
	}

}
