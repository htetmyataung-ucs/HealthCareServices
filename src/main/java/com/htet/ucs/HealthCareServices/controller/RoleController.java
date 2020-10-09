package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.RoleDTO;
import com.htet.ucs.HealthCareServices.services.RoleInterface;

@Controller
public class RoleController {
	@Autowired
	private RoleInterface roleInterface;
	
	@GetMapping("/role")
	public String createRole(Model model) {
		model.addAttribute("role", new RoleDTO());
		return "role";
	}
	@PostMapping("/role")
	public String saveRole(@ModelAttribute("role") RoleDTO role, Model model) {
		roleInterface.saveRole(role);
		return "redirect:/role_List";
	}
	@GetMapping("/role_List")
	public String roleList(Model model) {
		model.addAttribute("roleList", roleInterface.getAllRoll());
		return "roleList";
	}
}
