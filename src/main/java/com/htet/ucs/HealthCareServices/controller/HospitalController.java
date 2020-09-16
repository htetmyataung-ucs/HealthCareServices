package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalSpecialDTO;
import com.htet.ucs.HealthCareServices.dto.HospitalTypeDTO;
import com.htet.ucs.HealthCareServices.dto.ReviewDTO;
import com.htet.ucs.HealthCareServices.services.HospitalCategoryInterface;
import com.htet.ucs.HealthCareServices.services.HospitalDetailInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.HospitalSpecialInterface;
import com.htet.ucs.HealthCareServices.services.HospitalTypeInterface;
import com.htet.ucs.HealthCareServices.services.ReviewInterface;
import com.htet.ucs.HealthCareServices.services.SpecialityInterface;
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
	private SpecialityInterface specialityInterface;
	@Autowired
	private HospitalSpecialInterface hospitalSpecialInterface;
	@Autowired
	private ReviewInterface reviewInterface;
	@Autowired
	private HospitalDetailInterface hospitalDetailInterface;
	//****************HOSPITAL TYPE*****************
	
	/*@PostMapping(path="/addhospitaltype") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalType (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    HospitalTypeDTO ht = new HospitalTypeDTO();
	   
	    ht.setName(name);
	    hospitalTypeInterface.saveHospitalType(ht);
	    return "Saved";
	  }*/
	
	@GetMapping("/create_hospitaltype")
	public String createHospitalType(Model model) {
		model.addAttribute("hospitaltype", new HospitalTypeDTO());
		return "hospitaltype";
	}

	@PostMapping("/create_hospitaltype")
	public String saveHospitaltype(@ModelAttribute("hospitaltype") HospitalTypeDTO ht, Model model) {
		hospitalTypeInterface.saveHospitalType(ht);
		return "redirect:/hospitalTypeList";
	}
	
	@GetMapping("/hospitalTypeList")
	public String hospitaltypeList(Model model) {
		model.addAttribute("hospitaltype",	hospitalTypeInterface.getAllHospitalTypeList());
		return "hospitaltype_list";
	}
	
	
	//**************HOSPITAL CATEGORY*****************
	
	/*@PostMapping(path="/addhospitalcategory") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalCategory (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    HospitalCategory hc = new HospitalCategory();
	   
	    hc.setName(name);
	    hospitalcategoryRepository.save(hc);
	    return "Saved";
	  }*/

	@GetMapping("/create_hospitalcategory")
	public String createHospitalCategory(Model model) {
		model.addAttribute("hospitalcategory", new HospitalCategoryDTO());
		return "hospitalcategory";
	}
	@PostMapping("/create_hospitalcategory")
	public String saveHospitalCategory(@ModelAttribute("hospitalcategory") HospitalCategoryDTO hc, Model model) {
		hospitalCategoryInterface.saveHospitalCategory(hc);
		return "redirect:/hospitalcategory_list";
	}	
	@GetMapping(value="/hospitalcategory_list")
	public String hospitalcategoryList(Model model) {
		model.addAttribute("hospitalcategory",	hospitalCategoryInterface.getAllHospitalCategoryList());
		return "hospitalcategory_list";
	}
	
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
	
	//************HOSPITAL SPECIALITY************
	
	/*@PostMapping(path="/addhospitalspecial") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalSpecial (@RequestParam Boolean status,@RequestParam Speciality speciality,@RequestParam Hospital hospital) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
	    HospitalSpecial hs = new HospitalSpecial();	   
	    hs.setStatus(status);
	    hospitalspecialRepository.save(hs);
	    return "Saved";
	  }*/
	
	@GetMapping("/create_hospitalspecial")
	public String createHospitalSpecial(Model model) {
		model.addAttribute("hospitalspecial", new HospitalSpecialDTO());
		model.addAttribute("speciality", specialityInterface.getAllSpecialityList());
		model.addAttribute("hospital", hospitalInterface.getAllHospitalList());
		return "hospitalspecial";
	}
	@PostMapping("/create_hospitalspecial")
	public String saveHospitalSpecial(@ModelAttribute("hospitalspecial") HospitalSpecialDTO hospitalSpecial, Model model) {
		hospitalSpecialInterface.saveHospitalSpecial(hospitalSpecial);
		return "redirect:/hospitalspecial_list";
	}
	@GetMapping(value="/hospitalspecial_list")
	public String hospitalspecialList(Model model) {
		model.addAttribute("hospitalspecial", hospitalSpecialInterface.getAllHospitalSpecialList());
		return "hospitalspecial_list";
	}
	
	//**********REVIEW**********
	
	@GetMapping("/create_review")
	public String createReview(Model model) {
		model.addAttribute("review", new ReviewDTO());
		return "review";
	}
	@PostMapping("/create_review")
	public String saveReview(@ModelAttribute("review") ReviewDTO review, Model model) {
		reviewInterface.saveReview(review);
		return "redirect:/review_list";
	}
	@GetMapping(value="/review_list")
	public String reviewList(Model model) {
		model.addAttribute("reviewList", reviewInterface.getAllReviewList());
		return "review_list";
	}
	
	
	//*************HOSPITAL DETAIL***************
	
	@GetMapping("/create_hospitalDetail")
	public String createHospitalDetail(Model model) {
		model.addAttribute("hospitalDetail", new HospitalDetailDTO());
		return "review";
	}
	@PostMapping("/create_hospitalDetail")
	public String saveHospitalDetail(@ModelAttribute("hospitalDetail") HospitalDetailDTO hdDTO, Model model) {
		hospitalDetailInterface.saveHospitalDetail(hdDTO);
		return "redirect:/hospitalDetailList";
	}
	@GetMapping(value="/hospitalDetailList")
	public String HospitalDetailList(Model model) {
		model.addAttribute("hospitalDetailList", hospitalDetailInterface.getAllHospitalDetailList());
		return "hospitaldetail_list";
	}
		
} 


