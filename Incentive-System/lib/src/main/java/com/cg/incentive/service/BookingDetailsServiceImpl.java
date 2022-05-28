package com.cg.incentive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.incentive.entities.BookingDetails;
import com.cg.incentive.exceptions.BookingIdNotFoundException;
import com.cg.incentive.exceptions.ChassisNumberAlreadyBookedException;
import com.cg.incentive.repository.BookingDetailsRepository;

@Service
public class BookingDetailsServiceImpl implements BookingDetailsService {
	@Autowired
	BookingDetailsRepository bkdetrepo;
	@Override
	public void addBookingDetails(BookingDetails bkndet) {
		Optional<BookingDetails> bkdet = bkdetrepo.findById(bkndet.getCardet().getCarChassisNumber());
		if(!bkdet.isEmpty())
			throw new ChassisNumberAlreadyBookedException();
		bkdetrepo.save(bkndet);
	}

	@Override
	public List<BookingDetails> viewAllBookingDetails() {
		return bkdetrepo.findAll();
	}

	@Override
	public Optional<BookingDetails> viewBookingDeatilsById(int bookingId) {
		Optional<BookingDetails> details = bkdetrepo.findById(bookingId);
		if(details.isEmpty())
			throw new BookingIdNotFoundException();
		return details;
	}

	@Override
	public void updatedBookingDetails(BookingDetails bookingdet) {
		bkdetrepo.save(bookingdet);
		
	}

	@Override
	public void deleteBookingDetailsById(int bookingId) {
		Optional<BookingDetails> details = bkdetrepo.findById(bookingId);
		if(details.isEmpty())
			throw new BookingIdNotFoundException();
		bkdetrepo.deleteById(bookingId);
		
	}
	
}
