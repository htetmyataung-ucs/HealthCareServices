package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.model.Booking;

public class BookingConverter {
	public static Booking convertToEntity(BookingDTO bookingDTO) {
		Booking booking = new Booking();
		booking.setName(bookingDTO.getName());
		booking.setPhone(bookingDTO.getPhone());
		booking.setNrc(bookingDTO.getNrc());
		booking.setAge(bookingDTO.getAge());
		booking.setAddress(bookingDTO.getAddress());
		//booking.setDate(bookingDTO.getDate());
		//booking.setTime(bookingDTO.getTime());
		booking.getHospital().setId(bookingDTO.getHospitalId());
		return booking;
	}
	public static BookingDTO convertToDTO(Booking bookingDTO) {
		BookingDTO booking = new BookingDTO();
		booking.setId(bookingDTO.getId());
		booking.setName(bookingDTO.getName());
		booking.setPhone(bookingDTO.getPhone());
		booking.setNrc(bookingDTO.getNrc());
		booking.setAge(bookingDTO.getAge());
		booking.setAddress(bookingDTO.getAddress());
		booking.setDate(bookingDTO.getDate().toString());
		booking.setTime(bookingDTO.getTime().toString());
		booking.setHospitalName(bookingDTO.getHospital().getName());
		booking.setUserName(bookingDTO.getUser().getName());
		return booking;
	}
}
