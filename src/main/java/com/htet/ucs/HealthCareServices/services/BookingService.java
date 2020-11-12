package com.htet.ucs.HealthCareServices.services;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;
import com.htet.ucs.HealthCareServices.model.Booking;
import com.htet.ucs.HealthCareServices.repository.BookingRepository;
import com.htet.ucs.HealthCareServices.service.mapper.BookingConverter;

@Service
public class BookingService implements BookingInterface{
	@Autowired
	private CurrentUserInterface currentUserInterface;
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

	@Override
	public void saveBook(BookingDTO dto) throws Exception {
		// TODO Auto-generated method stub
		Booking book = new Booking();
		
		book.getUser().setId(currentUserInterface.getCurrentUser().getId());
		
		
		book.setName(dto.getName());
		book.setPhone(dto.getPhone());
		book.setNrc(dto.getNrc());
		book.setAge(dto.getAge());
		SimpleDateFormat print = new SimpleDateFormat("MMM d, yyyy HH:mm:ss");
		SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy a",Locale.ENGLISH);
		book.setDate(print.parse(dto.getDate()));
		SimpleDateFormat format1 = new SimpleDateFormat("hh:mm:ss a",Locale.ENGLISH);
		book.setTime(print.parse(dto.getTime()));
		book.setAddress(dto.getAddress());
		bookingRepository.save(book);
		
	}

}
