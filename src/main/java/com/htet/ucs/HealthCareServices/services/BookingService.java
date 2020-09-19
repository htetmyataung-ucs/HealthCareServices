package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.repository.BookingRepository;
import com.htet.ucs.HealthCareServices.service.mapper.BookingConverter;

@Service
public class BookingService implements BookingInterface{
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public void saveBooking(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		bookingRepository.save(BookingConverter.convertToEntity(bookingDTO));
	}

	@Override
	public List<BookingDTO> getAllBookingList() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll().stream().map(BookingConverter::convertToDTO).collect(Collectors.toList());
	}

}
