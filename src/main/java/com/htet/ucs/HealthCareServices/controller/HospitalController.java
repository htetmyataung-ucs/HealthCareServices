package com.htet.ucs.HealthCareServices.controller;

import java.sql.Date;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.htet.ucs.HealthCareServices.model.City;
import com.htet.ucs.HealthCareServices.model.Doctor;
import com.htet.ucs.HealthCareServices.model.Hospital;
import com.htet.ucs.HealthCareServices.model.HospitalCategory;
import com.htet.ucs.HealthCareServices.model.HospitalDoctor;
import com.htet.ucs.HealthCareServices.model.HospitalSpecial;
import com.htet.ucs.HealthCareServices.model.HospitalType;
import com.htet.ucs.HealthCareServices.model.Speciality;
import com.htet.ucs.HealthCareServices.model.TownShip;
import com.htet.ucs.HealthCareServices.model.User;
import com.htet.ucs.HealthCareServices.repository.CityRepository;
import com.htet.ucs.HealthCareServices.repository.DoctorRepository;
import com.htet.ucs.HealthCareServices.repository.HospitalCategoryRepository;
import com.htet.ucs.HealthCareServices.repository.HospitalDoctorReposity;
import com.htet.ucs.HealthCareServices.repository.HospitalRepository;
import com.htet.ucs.HealthCareServices.repository.HospitalSpecialRepository;
import com.htet.ucs.HealthCareServices.repository.HospitalTypeRepository;
import com.htet.ucs.HealthCareServices.repository.SpecialityRepository;
import com.htet.ucs.HealthCareServices.repository.TownshipRepository;
import com.htet.ucs.HealthCareServices.repository.UserRepository;

@Controller
public class HospitalController {
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private TownshipRepository townshipRepository;
	@Autowired
	private HospitalTypeRepository hospitaltypeRepository;
	@Autowired
	private HospitalCategoryRepository hospitalcategoryRepository;
	@Autowired
	private HospitalRepository hospitalRepository;
	
	@Autowired
	private SpecialityRepository specialityRepository;
	@Autowired
	private HospitalSpecialRepository hospitalspecialRepository;
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private HospitalDoctorReposity hospitaldoctorRepository;
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewCity (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    City c = new City();
	    c.setName(name);
	    cityRepository.save(c);
	    return "Saved";
	  }
	@GetMapping("/createcity")
	public String createCity(Model model) {
		model.addAttribute("city", new City());
		return "city";
	}
	@PostMapping("/save_city")
	public String saveCity(@ModelAttribute("city")City c,Model model) {
		
		cityRepository.save(c);
		
		model.addAttribute("city", cityRepository.findAll());
		return "city_list";
	}
	@GetMapping("/citylist")
	public @ResponseBody List<City> getCityList(){
		return cityRepository.findAll();
	}
	@PostMapping(path="/addtownship") // Map ONLY POST Requests
	  public @ResponseBody String addNewTownship (@RequestParam String name,@RequestParam City city) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    TownShip t = new TownShip();
	    t.setCity(city);
	    t.setName(name);
	    townshipRepository.save(t);
	    return "Saved";
	  }
	@GetMapping("/createtownship")
	public String createTownship(Model model) {
		model.addAttribute("city", cityRepository.findAll());
		model.addAttribute("township", new TownShip());
		return "township";
	}
	@PostMapping("/save_township")
	public String saveTownship(@ModelAttribute("township")TownShip t,Model model) {
		
		townshipRepository.save(t);
		model.addAttribute("township",	townshipRepository.findAll());
		return "township_list";
	}
	@GetMapping("/townshiplist")
	public @ResponseBody List<TownShip> getTownshipList(){
		return townshipRepository.findAll();
	}
	
	
	@PostMapping(path="/addhospitaltype") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalType (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    HospitalType ht = new HospitalType();
	   
	    ht.setName(name);
	    hospitaltypeRepository.save(ht);
	    return "Saved";
	  }
	@GetMapping("/createhospitaltype")
	public String createHospitalType(Model model) {
		
		model.addAttribute("hospitaltype", new HospitalType());
		return "hospitaltype";
	}
	@PostMapping("/save_hospitaltype")
	public String saveHospitaltype(@ModelAttribute("hospitaltype")HospitalType ht,Model model) {
		
		hospitaltypeRepository.save(ht);
		model.addAttribute("hospitaltype",	hospitaltypeRepository.findAll());
		return "hospitaltype_list";
	}
	@GetMapping("/hospitaltypelist")
	public @ResponseBody List<HospitalType> getHospitalTypeList(){
		return hospitaltypeRepository.findAll();
	}
	
	
	
	@PostMapping(path="/addhospitalcategory") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalCategory (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    HospitalCategory hc = new HospitalCategory();
	   
	    hc.setName(name);
	    hospitalcategoryRepository.save(hc);
	    return "Saved";
	  }
	@GetMapping("/createhospitalcategory")
	public String createHospitalCategory(Model model) {
		
		model.addAttribute("hospitalcategory", new HospitalCategory());
		return "hospitalcategory";
	}
	@PostMapping("/save_hospitalcategory")
	public String saveHospitalCategory(@ModelAttribute("hospitalcategory")HospitalCategory hc,Model model) {
		
		hospitalcategoryRepository.save(hc);
		model.addAttribute("hospitalcategory",	hospitalcategoryRepository.findAll());
		return "hospitalcategory_list";
	}
	@GetMapping("/hospitalcategorylist")
	public @ResponseBody List<HospitalCategory> getHospitalCategoryList(){
		return hospitalcategoryRepository.findAll();
	}
	
	
	
	@PostMapping(path="/addhospital") // Map ONLY POST Requests
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
	  }
	@GetMapping("/createhospital")
	public String createHospital(Model model) {
		
		model.addAttribute("hospital", new Hospital());
		model.addAttribute("hospitalCategory", hospitalcategoryRepository.findAll());
		model.addAttribute("hospitalType", hospitaltypeRepository.findAll());
		model.addAttribute("townShip", townshipRepository.findAll());
		return "hospital";
	}
	@PostMapping("/save_hospital")
	public String saveHospital(@ModelAttribute("hospital")Hospital hp,Model model) {
		
		hospitalRepository.save(hp);
		model.addAttribute("hospital",	hospitalRepository.findAll());
		return "hospital_list";
	}
	@GetMapping("/hospitallist")
	public @ResponseBody List<Hospital> getHospitalList(){
		return hospitalRepository.findAll();
	}
	
	
	
	@PostMapping(path="/addspeciality") // Map ONLY POST Requests
	  public @ResponseBody String addNewSpeciality (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Speciality s = new Speciality();
	   
	    s.setName(name);
	    specialityRepository.save(s);
	    return "Saved";
	  }
	@GetMapping("/createspeciality")
	public String createSpeciality(Model model) {
		
		model.addAttribute("speciality", new Speciality());
		
		return "speciality";
	}
	@PostMapping("/save_speciality")
	public String saveSpeciality(@ModelAttribute("speciality")Speciality s,Model model) {
		
		specialityRepository.save(s);
		model.addAttribute("speciality", specialityRepository.findAll());
		return "speciality_list";
	}
	@GetMapping("/specialitylist")
	public @ResponseBody List<Speciality> getSpecialityList(){
		return specialityRepository.findAll();
	}
	
	
	//HospitalSpecial
	@PostMapping(path="/addhospitalspecial") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalSpecial (@RequestParam Boolean status,@RequestParam Speciality speciality,@RequestParam Hospital hospital) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    HospitalSpecial hs = new HospitalSpecial();
	   
	    hs.setStatus(status);
	    hospitalspecialRepository.save(hs);
	    return "Saved";
	  }
	@GetMapping("/"
			+ "")
	public String createHospitalSpecial(Model model) {
	
		model.addAttribute("hospitalspecial", new HospitalSpecial());
		model.addAttribute("speciality", specialityRepository.findAll());
		model.addAttribute("hospital", hospitalRepository.findAll());
		return "hospital_special";
	}
	@PostMapping("/save_hospitalspecial")
	public String saveHospitalSpecial(@ModelAttribute("hospitalspecial")HospitalSpecial hs,Model model) {
		
		hospitalspecialRepository.save(hs);
		model.addAttribute("hospitalspecial", hospitalspecialRepository.findAll());
		return "hospitalspecial_list";
	}
	@GetMapping("/hospitalspecial_list")
	public @ResponseBody List<HospitalSpecial> getHospitalSpecialList(){
		return hospitalspecialRepository.findAll();
	}
	
	
	
	//Doctor
	@PostMapping(path="/adddoctor") // Map ONLY POST Requests
	  public @ResponseBody String addNewDoctor (@RequestParam String name,@RequestParam String sama_no,@RequestParam Speciality speciality) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Doctor d= new Doctor();
	   d.setName(name);
	   d.setSama_no(sama_no);
	   d.setSpeciality(speciality);
	   
	    doctorRepository.save(d);
	    return "Saved";
	  }
	@GetMapping("/createdoctor")
	public String createDoctor(Model model) {
		
		model.addAttribute("doctor", new Doctor());
		model.addAttribute("speciality", specialityRepository.findAll());
		return "doctor";
	}
	@PostMapping("/save_doctor")
	public String saveDoctor(@ModelAttribute("doctor")Doctor d,Model model) {
		
		doctorRepository.save(d);
		model.addAttribute("doctor",doctorRepository.findAll());
		return "doctor_list";
	}
	@GetMapping("/doctorlist")
	public @ResponseBody List<Doctor> getDoctorList(){
		return doctorRepository.findAll();
	}
	
	
	//HospitalDoctor
	@PostMapping(path="/addhospitaldoctor") // Map ONLY POST Requests
	  public @ResponseBody String addNewHospitalDoctor (@RequestParam Date doctorDate,@RequestParam Boolean status,@RequestParam Doctor doctor) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    HospitalDoctor hd= new HospitalDoctor();
	  hd.setDoctorDate(doctorDate);
	  //hd.setDoctorTime(doctorTime);
	  hd.setStatus(status);
	  hd.setDoctor(doctor);
	   
	    hospitaldoctorRepository.save(hd);
	    return "Saved";
	  }
	@GetMapping("/createhospitaldoctor")
	public String createHospitalDoctor(Model model) {
		
		model.addAttribute("hospitaldoctor", new HospitalDoctor());
		model.addAttribute("doctor", doctorRepository.findAll());
		return "hospitaldoctor";
	}
	@PostMapping("/save_hospitaldoctor")
	public String saveHospitalDoctor(@ModelAttribute("hospitaldoctor")HospitalDoctor hd,Model model) {
		
		hospitaldoctorRepository.save(hd);
		model.addAttribute("hospitaldoctor",hospitaldoctorRepository.findAll());
		return "hospitaldoctor_list";
	}
	@GetMapping("/hospitaldoctorlist")
	public @ResponseBody List<HospitalDoctor> getHospitalDoctorList(){
		return hospitaldoctorRepository.findAll();
	}
	
	
	
	//User
	@PostMapping(path="/adduser") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String name,@RequestParam String phone,@RequestParam String nrc,@RequestParam Integer age,
			  @RequestParam String address,@RequestParam String bloodType,@RequestParam String password) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    User user= new User();
	  user.setName(name);
	  user.setPhone(phone);
	  user.setNrc(nrc);
	  user.setAge(age);
	  user.setAddress(address);
	  user.setBloodType(bloodType);
	  user.setPassword(password);
	   
	    userRepository.save(user);
	    return "Saved";
	  }
	@GetMapping("/createuser")
	public String createUser(Model model) {
		
		model.addAttribute("user", new User());
		
		return "user";
	}
	@PostMapping("/save_user")
	public String saveUser(@ModelAttribute("user")User user,Model model) {
		
		userRepository.save(user);
		model.addAttribute("user",userRepository.findAll());
		return "user_list";
	}
	@GetMapping("/userlist")
	public @ResponseBody List<User> getUserList(){
		return userRepository.findAll();
	}
}
