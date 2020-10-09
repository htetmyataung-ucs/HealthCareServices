package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.model.User;
import com.htet.ucs.HealthCareServices.repository.UserRepository;

@Service
public class UserService implements UserInterface{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptEncoder;
	
	@Override
	public void saveUser(UserDTO user) {
		// TODO Auto-generated method stub
		User u = new User();
		u.setId(user.getId());
		u.setName(user.getName());
		u.setPhone(user.getPhone());
		u.setEmail(user.getEmail());
		u.setNrc(user.getNrc());
		u.setAge(user.getAge());
		u.setAddress(user.getAddress());
		u.setBloodType(user.getBloodType());
		u.setPassword(bCryptEncoder.encode(user.getPassword()));
		u.getRole().setId(user.getRoleId());
		userRepository.save(u);
	}
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}


//	@Override
//	public void saveUser(UserDTO userDTO) {
//		// TODO Auto-generated method stub
//		userRepository.save(UserConverter.convertToEntity(userDTO));
//	}
//
//	@Override
//	public List<UserDTO> getAllUserList() {
//		// TODO Auto-generated method stub
//		return userRepository.findAll().stream().map(UserConverter::convertToDTO).collect(Collectors.toList());
//	}

}
