package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import com.cg.incentive.entities.BookingDetails;
import com.cg.incentive.exceptions.BookingIdNotFoundException;
import com.cg.incentive.exceptions.ChassisNumberAlreadyBookedException;

public interface BookingDetailsService {
	void addBookingDetails(BookingDetails bkngdet) throws ChassisNumberAlreadyBookedException;
	List<BookingDetails> viewAllBookingDetails();
	Optional<BookingDetails> viewBookingDeatilsById(int bookingId) throws BookingIdNotFoundException;
	void updatedBookingDetails(BookingDetails bookingdet);
	void deleteBookingDetailsById(int bookingId)throws ChassisNumberAlreadyBookedException;
}
