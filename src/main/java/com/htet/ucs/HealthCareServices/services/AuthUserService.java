package com.htet.ucs.HealthCareServices.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htet.ucs.HealthCareServices.model.Role;
import com.htet.ucs.HealthCareServices.model.User;
import com.htet.ucs.HealthCareServices.repository.UserRepository;

@Service
public class AuthUserService implements UserDetailsService{
	@Autowired 
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByEmail(email);
		Role role = user.getRole();
		System.out.print(role.getRole());
		Set<GrantedAuthority> authority = new HashSet<>();
		authority.add(new SimpleGrantedAuthority(role.getRole()));
		
//		UserDetails userDetails = (UserDetails)new User(user.getEmail(),
//				user.getPassword());
//		return userDetails;
		/*
		 * UserDetails userDetail  s = (UserDetails)new User(); return userDetails;
		 */
		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authority);
	}

}
