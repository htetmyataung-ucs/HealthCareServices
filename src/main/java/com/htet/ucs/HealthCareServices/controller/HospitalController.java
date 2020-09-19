package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.HospitalDTO;
import com.htet.ucs.HealthCareServices.services.HospitalCategoryInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.HospitalTypeInterface;
import com.htet.ucs.HealthCareServices.services.TownshipInterface;

@Controller
public class HospitalController {
	
	@Autowired
	private TownshipInterface townShipInterface;
	@Autowired
	private HospitalTypeInterface hospitalTypeInterface;
	@Autowired
	private HospitalCategoryInterface hospitalCategoryInterface;
	@Autowired
	private HospitalInterface hospitalInterface;
	
	//*************HOSPITAL*************
	
	/*@PostMapping(path="/addhospital") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospital (@RequestParam String name,@RequestParam HospitalCategory hospitalCategory,
			  @RequestParam HospitalType hospitalType,@RequestParam TownShip townShip) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Hospital hp = new Hospital();
	    hp.setName(name);
	    hp.setHospitalCategory(hospitalCategory);
	    hp.setHospitalType(hospitalType);
	    hp.setTownShip(townShip);
	    hospitalRepository.save(hp);
	    return "Saved";
	  }	*/
	@GetMapping("/create_hospital")
	public String createHospital(Model model) {
		model.addAttribute("hospital", new HospitalDTO());
		model.addAttribute("hospitalCategory", hospitalCategoryInterface.getAllHospitalCategoryList());
		model.addAttribute("hospitalType", hospitalTypeInterface.getAllHospitalTypeList());
		model.addAttribute("townShip", townShipInterface.getAllTownshipList());
		return "hospital";
	}
	@PostMapping("/create_hospital")
	public String saveHospital(@ModelAttribute("hospital") HospitalDTO hospital, Model model) {
		hospitalInterface.saveHospital(hospital);
		return "redirect:/hospital_list";
	}
	@GetMapping(value="/hospital_list")
	public String hospitalList(Model model) {
		model.addAttribute("hospital",	hospitalInterface.getAllHospitalList());
		return "hospital_list";
	}
	

} 


