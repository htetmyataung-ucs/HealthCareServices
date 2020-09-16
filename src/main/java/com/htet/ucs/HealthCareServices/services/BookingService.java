package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.model.Booking;
import com.htet.ucs.HealthCareServices.repository.BookingRepository;

@Service
public class BookingService implements BookingInterface{
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public void saveBooking(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		bookingRepository.save(convertBooking(bookingDTO));
	}

	@Override
	public List<BookingDTO> getAllBookingList() {
		// TODO Auto-generated method stub
		List<Booking> booking = bookingRepository.findAll();
		List<BookingDTO> bookingDTO = booking.stream().map(b->convertBookingDTO(b)).collect(Collectors.toList());
		return bookingDTO;
	}
	Booking convertBooking(BookingDTO bookingDTO) {
		Booking booking = new Booking();
		booking.setDate(bookingDTO.getDate());
		booking.setTime(bookingDTO.getTime());
		booking.setHospital(bookingDTO.getHospital());
		booking.setPatient(bookingDTO.getPatient());
		return booking;
	}
	BookingDTO convertBookingDTO(Booking bookingDTO) {
		BookingDTO booking = new BookingDTO();
		booking.setDate(bookingDTO.getDate());
		booking.setTime(bookingDTO.getTime());
		booking.setHospital(bookingDTO.getHospital());
		booking.setPatient(bookingDTO.getPatient());
		return booking;
	}
}
