package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.ServiceDTO;
import com.htet.ucs.HealthCareServices.services.ServiceInterface;

@Controller
public class ServiceController {

	@Autowired
	private ServiceInterface serviceInterface;
	
	@GetMapping("admin/createService")
	public String createService(Model model) {
		model.addAttribute("service", new ServiceDTO());
		return "adminService";
	}

	@PostMapping("admin/createService")
	public String saveCity(@ModelAttribute("service") ServiceDTO dto, Model model) {
		serviceInterface.saveService(dto);
		return "redirect:/admin/serviceList";
	}

	@GetMapping(value="admin/serviceList")
	public String cityList(Model model) {
		model.addAttribute("serviceList", serviceInterface.getAllServiceList());
		return "adminServiceList";
	}
	//FOR EDIT AND DELETE Service
	
		@GetMapping("admin/editService/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			ServiceDTO dto=serviceInterface.findById(id);
			model.addAttribute("service", dto);
			return "adminServiceEdit";
		}
		@PostMapping("admin/editService")
		public String editService(@ModelAttribute(value="service") ServiceDTO dto,Model model) {
			serviceInterface.saveService(dto);
			return "redirect:/admin/serviceList";
		}
		@GetMapping("admin/deleteService/{id}")
		public String delete(@PathVariable Long id) {
			serviceInterface.delete(id);
			return "redirect:/admin/serviceList";
		}
}
