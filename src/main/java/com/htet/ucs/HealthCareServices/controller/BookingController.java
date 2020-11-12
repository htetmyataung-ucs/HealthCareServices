package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.services.BookingInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
@Controller
public class BookingController {
	@Autowired 
	private BookingInterface bookingInterface;
	@Autowired
	private HospitalInterface hospitalInterface;
	
	//BOOKING
	
		@GetMapping("/create_booking")
		public String createBooking(Model model) {
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());

			model.addAttribute("booking", new BookingDTO());
			return "booking";
		}

		@PostMapping("/create_booking")
		public String saveBooking(@ModelAttribute("booking") BookingDTO booking, Model model) {
			bookingInterface.saveBooking(booking);
			return "redirect:/bookingList";
		}

		@GetMapping(value="/bookingList")
		public String bookingList(Model model) {
			model.addAttribute("bookingList", bookingInterface.getAllBookingList());
			return "booking_list";
		}
		
//		@PostMapping("/bookingSave")
//		public String bookingSave(@RequestBody BookingDTO booking) throws Exception {
//			bookingInterface.saveBook(booking);
//			return "redirect:/hospitalProfile";
//
//		}
		@PostMapping("/bookingSave")
		public String bookingSave(Model model,@Param(value = "name") String name,@Param(value = "phone") String phone,@Param(value = "nrc") String nrc,@Param(value = "age") Integer age,@Param(value = "address") String address,@Param(value = "date") String date,@Param(value = "time") String time) throws Exception {
			BookingDTO dto = new BookingDTO();
			dto.setName(name);
			dto.setPhone(phone);
			dto.setNrc(nrc);
			dto.setAge(age);
			dto.setAddress(address);
			dto.setDate(date.toString());
			dto.setTime(time.toString());
			bookingInterface.saveBook(dto);
			System.out.println(name);
			System.out.println(phone);
			System.out.println(nrc);
			
			return "redirect:/bookingSave";
		}
}
