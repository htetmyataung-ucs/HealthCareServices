package com.htet.ucs.HealthCareServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htet.ucs.HealthCareServices.dto.HospitalDTO;
import com.htet.ucs.HealthCareServices.services.CityInterface;
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
	@Autowired
	private CityInterface cityInterface;
	
	
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
	@GetMapping("admin/create_hospital")
	public String createHospital(Model model) {
		model.addAttribute("hospital", new HospitalDTO());
		model.addAttribute("hospitalCategoryList", hospitalCategoryInterface.getAllHospitalCategoryList());
		model.addAttribute("hospitalTypeList", hospitalTypeInterface.getAllHospitalTypeList());
		model.addAttribute("townShipList", townShipInterface.getAllTownshipList());
		return "adminHospital";
	}
	@PostMapping("admin/create_hospital")
	public String saveHospital(@ModelAttribute("hospital") HospitalDTO hospital, Model model) {
		hospitalInterface.saveHospital(hospital);
		return "redirect:/admin/hospital_list";
	}
	@GetMapping(value="admin/hospital_list")
	public String hospitalList(Model model) {
		model.addAttribute("hospitalList",	hospitalInterface.getAllHospitalList());
		return "adminHospitalList";
	}
	
	
	//FOR EDIT AND DELETE CITY
	
			@GetMapping("admin/edit_hospital/{id}")
			public String edit(@PathVariable Long id,Model model) {
				if(id==null) {
					
				}
				HospitalDTO dto=hospitalInterface.findById(id);
				model.addAttribute("hospital", dto);
				model.addAttribute("hospitalCategoryList", hospitalCategoryInterface.getAllHospitalCategoryList());
				model.addAttribute("hospitalTypeList", hospitalTypeInterface.getAllHospitalTypeList());
				model.addAttribute("townShipList", townShipInterface.getAllTownshipList());
				return "adminHospitalEdit";
			}
			@PostMapping("admin/edit_hospital")
			public String editHospital(@ModelAttribute(value="hospital") HospitalDTO dto,Model model) {
				hospitalInterface.saveHospital(dto);
				return "redirect:/admin/hospital_list";
			}
			@GetMapping("admin/delete_hospital/{id}")
			public String delete(@PathVariable Long id) {
				hospitalInterface.delete(id);
				return "redirect:/admin/hospital_list";
			}
			
			//TO SEARCH HOSPITAL IN USER VIEW
			@GetMapping("searchHospital")
			public String searchHospital(@RequestParam(value = "townShipId",required = false)Long townShipId, @RequestParam(value="hospitalCategoryId", required = false)Long hospitalCategoryId, @RequestParam(value="hospitalTypeId",required = false)Long hospitalTypeId,Model model) {
				model.addAttribute("hospitalTypeList", hospitalTypeInterface.getAllHospitalTypeList());
				model.addAttribute("cityList", cityInterface.getAllCityList());
				model.addAttribute("hospitalCategoryList",hospitalCategoryInterface.getAllHospitalCategoryList());
				if(townShipId!=null && hospitalTypeId!=null && hospitalCategoryId!=null) {
					
				}
				return "searchHospital";				
			}
			@GetMapping("findHospitalByAllCat/{townshipId}/{hospitalCategoryId}/{hospitalTypeId}")
			public @ResponseBody List<HospitalDTO> findHospitalByAllCat(@PathVariable Long townshipId,@PathVariable Long hospitalCategoryId, @PathVariable Long hospitalTypeId) {
				return hospitalInterface.getHospitalByAllCat(townshipId, hospitalCategoryId, hospitalTypeId);
			}
			
			
} 


