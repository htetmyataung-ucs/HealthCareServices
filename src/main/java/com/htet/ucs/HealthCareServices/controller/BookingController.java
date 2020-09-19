package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.services.BookingInterface;
import com.htet.ucs.HealthCareServices.services.HospitalInterface;
import com.htet.ucs.HealthCareServices.services.PatientInterface;
@Controller
public class BookingController {
	@Autowired
	private PatientInterface patientInterface;
	@Autowired 
	private BookingInterface bookingInterface;
	@Autowired
	private HospitalInterface hospitalInterface;
	
	//BOOKING
	
		@GetMapping("/create_booking")
		public String createBooking(Model model) {
			model.addAttribute("hospitalList", hospitalInterface.getAllHospitalList());
			model.addAttribute("patientList", patientInterface.getAllPatientList());
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
}
