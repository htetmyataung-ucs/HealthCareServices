package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.CityDTO;
import com.htet.ucs.HealthCareServices.services.CityInterface;

@Controller
public class CityController {
	@Autowired
	private CityInterface cityInterface;
	
	/*@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewCity(@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		CityDTO c = new CityDTO();
		c.setName(name);
		cityInterface.saveCity(c);
		return "Saved";
	}*/

	@GetMapping("admin/create_city")
	public String createCity(Model model) {
		model.addAttribute("city", new CityDTO());
		return "adminCity";
	}

	@PostMapping("admin/create_city")
	public String saveCity(@ModelAttribute("city") CityDTO c, Model model) {
		cityInterface.saveCity(c);
		return "redirect:/admin/city_list";
	}

	@GetMapping(value="admin/city_list")
	public String cityList(Model model) {
		model.addAttribute("cityList", cityInterface.getAllCityList());
		return "adminCityList";
	}
	
	//FOR EDIT AND DELETE CITY
	
	@GetMapping("admin/editCity/{id}")
	public String edit(@PathVariable Long id,Model model) {
		if(id==null) {
			
		}
		CityDTO dto=cityInterface.findById(id);
		model.addAttribute("city", dto);
		return "adminCityEdit";
	}
	@PostMapping("admin/editCity")
	public String editCity(@ModelAttribute(value="city") CityDTO citydto,Model model) {
		cityInterface.saveCity(citydto);
		return "redirect:/admin/city_list";
	}
	@GetMapping("admin/deleteCity/{id}")
	public String delete(@PathVariable Long id) {
		cityInterface.delete(id);
		return "redirect:/admin/city_list";
	}
	/*
	 * @GetMapping("/city_list") public @ResponseBody List<City> getCityList(){
	 * return cityRepository.findAll(); }
	 */
}
