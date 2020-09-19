package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.model.Booking;

public class BookingConverter {
	public static Booking convertToEntity(BookingDTO bookingDTO) {
		Booking booking = new Booking();
		booking.setDate(bookingDTO.getDate());
		booking.setTime(bookingDTO.getTime());
		booking.getHospital().setId(bookingDTO.getHospitalId());
		booking.getPatient().setId(bookingDTO.getPatientId());
		return booking;
	}
	public static BookingDTO convertToDTO(Booking bookingDTO) {
		BookingDTO booking = new BookingDTO();
		booking.setId(bookingDTO.getId());
		booking.setDate(bookingDTO.getDate());
		booking.setTime(bookingDTO.getTime());
		booking.setHospitalName(bookingDTO.getHospital().getName());
		booking.setPatientName(bookingDTO.getPatient().getName());
		return booking;
	}
}
