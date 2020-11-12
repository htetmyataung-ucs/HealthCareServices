package com.htet.ucs.HealthCareServices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.model.User;
import com.htet.ucs.HealthCareServices.repository.UserRepository;
@Service
public class CurrentUserService implements CurrentUserInterface{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getCurrentUser(){
		// TODO Auto-generated method stub
		Object principle = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if(principle instanceof UserDetails) {
			String email = ((UserDetails) principle).getUsername();
			User user = userRepository.findByEmail(email);
			return user;
		}
		return null;
	}

}
