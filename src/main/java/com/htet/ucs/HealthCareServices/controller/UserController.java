package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.UserDTO;
import com.htet.ucs.HealthCareServices.services.RoleInterface;
import com.htet.ucs.HealthCareServices.services.UserInterface;

@Controller
public class UserController {
	@Autowired
	private UserInterface userInterface;
	@Autowired
	private RoleInterface roleInterface;
	//**********USER*************
	
	@GetMapping("/register")
	public String createUser(Model model) {
		model.addAttribute("user", new UserDTO());
		model.addAttribute("roleList", roleInterface.getAllRoll());
		return "register";
	}

	@PostMapping("/register")
	public String saveUser(@ModelAttribute("user") UserDTO user, Model model) {
		userInterface.saveUser(user);
		return "redirect:/login";
	}

//	@GetMapping("/userlist")
//	public String userList(Model model) {
//		model.addAttribute("userList", userInterface.getAllUserList());
//		return "user_list";
//	}	
	
}
