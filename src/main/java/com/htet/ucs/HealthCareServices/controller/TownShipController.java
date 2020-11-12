package com.htet.ucs.HealthCareServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.repository.TownshipRepository;
import com.htet.ucs.HealthCareServices.service.mapper.TownShipConverter;
import com.htet.ucs.HealthCareServices.services.CityInterface;
import com.htet.ucs.HealthCareServices.services.TownshipInterface;

@Controller
public class TownShipController {
	@Autowired
	private CityInterface cityInterface;
	@Autowired
	private TownshipInterface townshipInterface;
	@Autowired 
	private TownshipRepository townshipRepository;
	
	@GetMapping("admin/create_township")
	public String createTownship(Model model) {
		model.addAttribute("cityList", cityInterface.getAllCityList());
		model.addAttribute("township", new TownshipDTO());
		return "adminTownship";
	}

	@PostMapping("admin/create_township")
	public String saveTownship(@ModelAttribute("township") TownshipDTO t, Model model) {
		townshipInterface.saveTownship(t);
		return "redirect:/admin/townshipList";
	}
	@GetMapping("admin/townshipList")
	public String townshipList(Model model) {
		model.addAttribute("townshipList",	townshipInterface.getAllTownshipList());
		return "adminTownshipList"; 
	}
	
	//Testing
	
	@GetMapping("/byTownshipId/{name}")
	public @ResponseBody TownshipDTO findByTownshipName(@PathVariable String name) {
		return TownShipConverter.findByTownShipName(townshipRepository.findByTownShipName(name));
	}
		
	//to search shop
	@GetMapping("/findTownshipByRegion/{cityId}")
	public @ResponseBody List<TownshipDTO> findByTownshipRegion(@PathVariable Long cityId) {
		return townshipInterface.getTownshipListByCity(cityId);
	}
	
	
	//TO EDIT AND DELETE
	@GetMapping("admin/editTownship/{id}")
	public String edit(@PathVariable Long id,Model model) {
		if(id==null) {
			
		}
		TownshipDTO dto=townshipInterface.findById(id);
		model.addAttribute("township", dto);
		model.addAttribute("cityList", cityInterface.getAllCityList());
		return "adminTownshipEdit";
	}
	@PostMapping("admin/editTownship")
	public String editTownship(@ModelAttribute(value="township") TownshipDTO dto,Model model) {
		townshipInterface.saveTownship(dto);
		return "redirect:/admin/townshipList";
	}
	@GetMapping("admin/deleteTownship/{id}")
	public String delete(@PathVariable Long id) {
		townshipInterface.delete(id);
		return "redirect:/admin/townshipList";
	}
}
