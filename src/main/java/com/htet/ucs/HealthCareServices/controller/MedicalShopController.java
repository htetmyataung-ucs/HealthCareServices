 package com.htet.ucs.HealthCareServices.controller;

import java.util.ArrayList;
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

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.services.CityInterface;
import com.htet.ucs.HealthCareServices.services.MedicalShopInterface;
import com.htet.ucs.HealthCareServices.services.TownshipInterface;

@Controller
public class MedicalShopController {
	
	@Autowired
	private MedicalShopInterface medicalShopInterface;
	@Autowired
	private TownshipInterface townshipInterface;
	@Autowired
	private CityInterface cityInterface;
	
	@GetMapping("admin/medicalshop")
	public String createMedicalShop(Model model) {
		model.addAttribute("medicalShop", new MedicalShopDTO());
		model.addAttribute("townshipList", townshipInterface.getAllTownshipList());
		return "adminShop";
	}
	@PostMapping("admin/medicalshop")
	public String saveMedicalShop(@ModelAttribute("medicalShop")MedicalShopDTO medicalShop, Model model) {
		medicalShopInterface.saveMedicalShop(medicalShop);
		return "redirect:/admin/medicalshop_list";
	}
	@GetMapping("admin/medicalshop_list")
	public String shopList(Model model) {
		model.addAttribute("medicalShopList", medicalShopInterface.getMedicalShopList());
		return "adminShopList";  
	}
	
	
	//FOR EDIT AND DELETE CITY
	
		@GetMapping("admin/editShop/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			MedicalShopDTO dto=medicalShopInterface.findById(id);
			model.addAttribute("medicalshop", dto);
			model.addAttribute("townshipList", townshipInterface.getAllTownshipList());
			return "adminShopEdit";
		}
		@PostMapping("admin/editShop")
		public String editShop(@ModelAttribute(value="medicalshop") MedicalShopDTO dto,Model model) {
			medicalShopInterface.saveMedicalShop(dto);
			return "redirect:/admin/medicalshop_list";
		}
		@GetMapping("admin/deleteShop/{id}")
		public String delete(@PathVariable Long id) {
			medicalShopInterface.delete(id);
			return "redirect:/admin/medicalshop_list";
		}
		
		//when city change, show township list
		
		@GetMapping("/searchShop")
		public String searchShop(Model model,@RequestParam(value = "townshipId",required = false) Long townshipId) {
			model.addAttribute("cityList", cityInterface.getAllCityList());
			
			List<MedicalShopDTO> shopList= new ArrayList<MedicalShopDTO>();
			List<TownshipDTO> townshipList= new ArrayList<TownshipDTO>();
			TownshipDTO dto = new TownshipDTO();
			if(townshipId!=null) {
				shopList=medicalShopInterface.getShopListByTownship(townshipId);
				townshipList = townshipInterface.getTownshipById(townshipId);
				dto = townshipInterface.findById(townshipId);
			}
			model.addAttribute("cityId", dto.getCityId());
			model.addAttribute("townshipList", townshipList);
			model.addAttribute("townid",townshipId);
			model.addAttribute("shopSearchList",shopList);
			return "searchShop";
		}
		@GetMapping("/shopSearch/{townshipId}")
		public @ResponseBody List<MedicalShopDTO> shopSearch(@PathVariable Long townshipId){
			return medicalShopInterface.getShopListByTownship(townshipId);
		}

	
//	@GetMapping("/findShopByTownshipId/{townshipId}")
//	public @ResponseBody List<MedicalShopDTO> findShopByTownshipId(@PathVariable Long townshipId) {
//		return medicalShopInterface.getShopListByTownship(townshipId);
//	}
		
		//FOR SHOP DETAIL IN USER VIEW
		@GetMapping("/shopDetail/{id}")
		public String shopDetaial(@PathVariable Long id,Model model) {	
			model.addAttribute("shopDetail", medicalShopInterface.findById(id));
			return "shopDetail";
		}
		//Test for shop Details (upper code)
//		@GetMapping("/findById/{id}")
//		public @ResponseBody MedicalShopDTO findById(@PathVariable Long id) {
//			return medicalShopInterface.findById(id);
//		}

}
