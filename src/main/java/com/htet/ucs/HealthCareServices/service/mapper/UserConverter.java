package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.model.User;

public class UserConverter {

	public static User convertToEntity(UserDTO userDTO) {
		User user= new User();
		user.setName(userDTO.getName());
		user.setPhone(userDTO.getPhone());
		user.setNrc(userDTO.getNrc());
		user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setBloodType(userDTO.getBloodType());
		user.setPassword(userDTO.getPassword());
		user.setPatient(userDTO.getPatient());
		return user;
	}
	public static UserDTO convertToDTO(User userDTO) {
		UserDTO user= new UserDTO();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setPhone(userDTO.getPhone());
		user.setNrc(userDTO.getNrc());
		user.setAge(userDTO.getAge());
		user.setAddress(userDTO.getAddress());
		user.setBloodType(userDTO.getBloodType());
		user.setPassword(userDTO.getPassword());
		user.setPatient(userDTO.getPatient());
		return user;
	}
	
}
