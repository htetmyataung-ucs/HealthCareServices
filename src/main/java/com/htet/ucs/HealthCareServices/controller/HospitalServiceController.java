package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.ManageHospitalServiceDTO;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.HospitalServiceInterface;
import com.htet.ucs.HealthCareServices.services.ServiceInterface;

@Controller
public class HospitalServiceController {
	@Autowired
	private HospitalServiceInterface hospitalServiceInterface;
	@Autowired
	private HospitalInterface hospitalInterface;
	@Autowired
	private ServiceInterface serviceInterface;
	
	@GetMapping("/admin/manageHospitalService")
	 public String manageHosptialService(Model model) {
		 model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
		 model.addAttribute("serviceList", serviceInterface.getAllServiceList());
		 model.addAttribute("dto", new ManageHospitalServiceDTO());
		 return "adminHospitalService";
	 }
	 @PostMapping("/admin/manageHospitalService")
	 public String saveHospitalService(@ModelAttribute(value="dto") ManageHospitalServiceDTO dto ,Model model) {
		 hospitalServiceInterface.saveHospitalService(dto);
//		 model.addAttribute("privilegeList", privilegeRepository.findAll());
//		 model.addAttribute("userList", userService.findAllUser());
//		 model.addAttribute("dto", new ManagePrivilegeDTO());
		 return "redirect:/admin/hospitalServiceList";
	 }
	 @GetMapping("/admin/hospitalServiceList")
	 public String hospitalServiceList(Model model) {
		 model.addAttribute("hospitalServiceList", hospitalServiceInterface.getAllHospitalServiceList());
		 return "adminHospitalServiceList";
	 }
	//FOR EDIT AND DELETE Service
		
//			@GetMapping("admin/editHospitalService/{id}")
//			public String edit(@PathVariable Long id,Model model) {
//				if(id==null) {
//					
//				}
//				HospitalServiceDTO dto=hospitalServiceInterface.findById(id);
//				model.addAttribute("hospitalService", dto);
//				return "adminServiceEdit";
//			}
//			@PostMapping("admin/editHospitalService")
//			public String editHospitalService(@ModelAttribute(value="hospitalService") HospitalServiceDTO dto,Model model) {
//				hospitalServiceInterface.saveHospitalService(dto);
//				return "redirect:/admin/hospitalServiceList";
//			}
			@GetMapping("admin/deleteHospitalService/{id}")
			public String delete(@PathVariable Long id) {
				hospitalServiceInterface.delete(id);
				return "redirect:/admin/hospitalServiceList";
			}
}
