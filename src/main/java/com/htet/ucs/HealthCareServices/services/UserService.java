package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.model.User;
import com.htet.ucs.HealthCareServices.repository.UserRepository;

@Service
public class UserService implements UserInterface{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		userRepository.save(convertUser(userDTO));
	}

	@Override
	public List<UserDTO> getAllUserList() {
		// TODO Auto-generated method stub
		List<User> user = userRepository.findAll();
		List<UserDTO> userDTO = user.stream().map(u->convertUserDTO(u)).collect(Collectors.toList());
		return userDTO;
	}
	
	User convertUser(UserDTO userDTO) {
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
	UserDTO convertUserDTO(User userDTO) {
		UserDTO user= new UserDTO();
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
