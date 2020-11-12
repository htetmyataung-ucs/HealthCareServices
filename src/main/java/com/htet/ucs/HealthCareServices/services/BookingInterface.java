package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.BookingDTO;

public interface BookingInterface {
	void saveBooking(BookingDTO bookingDTO);
	List<BookingDTO> getAllBookingList();
	void saveBook(BookingDTO dto) throws Exception;
}
