package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.services.CityInterface;
import com.htet.ucs.HealthCareServices.services.TownshipInterface;

@Controller
public class TownShipController {
	@Autowired
	private CityInterface cityInterface;
	@Autowired
	private TownshipInterface townshipInterface;
	
	/*@PostMapping(path="/addtownship") // Map ONLY POST Requests
	  public @ResponseBody String addNewTownship (@RequestParam String name,@RequestParam City city) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    TownshipDTO t = new TownshipDTO();
	    t.setCity(city);
	    t.setName(name);
	    townshipInterface.saveTownship(t);
	    return "Saved";
	  }
	  */
	@GetMapping("/create_township")
	public String createTownship(Model model) {
		model.addAttribute("cityList", cityInterface.getAllCityList());
		model.addAttribute("township", new TownshipDTO());
		return "township";
	}

	@PostMapping("/create_township")
	public String saveTownship(@ModelAttribute("township") TownshipDTO t, Model model) {
		townshipInterface.saveTownship(t);
		return "redirect:/townshipList";
	}
	@GetMapping("/townshipList")
	public String townshipList(Model model) {
		model.addAttribute("township",	townshipInterface.getAllTownshipList());
		return "township_list";
	}
}
