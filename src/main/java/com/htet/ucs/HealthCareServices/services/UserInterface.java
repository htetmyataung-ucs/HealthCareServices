package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.model.User;

public interface UserInterface {
	void saveUser(UserDTO user);
	List<User> findAllUser();
}
