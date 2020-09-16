package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.UserDTO;

public interface UserInterface {
	void saveUser(UserDTO userDTO);
	List<UserDTO> getAllUserList();
}
