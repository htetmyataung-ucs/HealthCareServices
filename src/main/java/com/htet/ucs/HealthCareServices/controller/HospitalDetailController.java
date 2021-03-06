package com.htet.ucs.HealthCareServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalServiceDTO;
import com.htet.ucs.HealthCareServices.services.HospitalDetailInterface;
import com.htet.ucs.HealthCareServices.services.HospitalDoctorInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.HospitalServiceInterface;

@Controller
public class HospitalDetailController {
	@Autowired
	private HospitalInterface hospitalInterface;
	@Autowired 
	private HospitalDetailInterface hospitalDetailInterface;
	@Autowired
	private HospitalDoctorInterface hospitalDoctorInterface;
	@Autowired
	private HospitalServiceInterface hospitalServiceInterface;
	
	//*************HOSPITAL DETAIL***************
	
	@GetMapping("admin/hospitalDetail")
	public String createHospitalDetail(Model model) {
		model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
		model.addAttribute("hospitaldetail", new HospitalDetailDTO());
		return "adminHospitalDetail";
	}
	@PostMapping("admin/hospitalDetail")
	public String saveHospitalDetail(@ModelAttribute("hospitaldetail") HospitalDetailDTO hdDTO, Model model) {
		hospitalDetailInterface.saveHospitalDetail(hdDTO);
		return "redirect:/admin/hospitaldetail_list";
	}
	@GetMapping(value="admin/hospitaldetail_list")
	public String HospitalDetailList(Model model) {
		model.addAttribute("hospitalDetailList", hospitalDetailInterface.getAllHospitalDetailList());
		return "adminHospitalDetailList";
	}
	
	
	//FOR EDIT AND DELETE CITY
	
	@GetMapping("admin/edit_hospitalDetail/{id}")
	public String edit(@PathVariable Long id,Model model) {
		if(id==null) {
			
		}
		HospitalDetailDTO dto=hospitalDetailInterface.findById(id);
		model.addAttribute("hospitalDetail", dto);
		model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
		return "adminHospitalDetailEdit";
	}
	@PostMapping("admin/edit_hospitalDetail")
	public String editHospitalDetail(@ModelAttribute(value="hospitalDetail") HospitalDetailDTO dto,Model model) {
		hospitalDetailInterface.saveHospitalDetail(dto);
		return "redirect:/admin/hospitaldetail_list";
	}
	@GetMapping("admin/delete_hospitalDetail/{id}")
	public String delete(@PathVariable Long id) {
		hospitalDetailInterface.delete(id);
		return "redirect:/admin/hospitaldetail_list";
	}
	
	//TO SHOW HOSPITAL DETAIAL INFO
	@GetMapping("/hospitalDetailInfo/{id}")
	public String hospitalDetailInfo(Model model,@PathVariable Long id) {
		if(id!=null) {
		List<HospitalServiceDTO> hs = hospitalServiceInterface.findHospitalServiceByHospitalId(id);
		List<HospitalDoctorDTO> dto = hospitalDoctorInterface.getAllDetailByHospitalId(id);
		model.addAttribute("hospitalDoctorList", dto);
		model.addAttribute("hospitalServiceList", hs);
		model.addAttribute("hospitalDetailList", hospitalDetailInterface.findByHospitalId(id));
		return "hospitalDetailInfo";
		}else {
			return "redirect:/searchHospital";
		}
	}
	@GetMapping("/hospitalProfile")
	public String hospitalProfile() {
		return "hospitalProfileTest";
	}
		
}
