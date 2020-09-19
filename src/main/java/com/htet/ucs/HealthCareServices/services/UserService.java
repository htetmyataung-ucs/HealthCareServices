package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.repository.UserRepository;
import com.htet.ucs.HealthCareServices.service.mapper.UserConverter;

@Service
public class UserService implements UserInterface{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		userRepository.save(UserConverter.convertToEntity(userDTO));
	}

	@Override
	public List<UserDTO> getAllUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll().stream().map(UserConverter::convertToDTO).collect(Collectors.toList());
	}

}
