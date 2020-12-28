package com.cargo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.DAO.BookingDetailsDAO;
import com.cargo.entities.BookingWrapper;
import com.cargo.entities.FlightDetails;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDetailsDAO bookingDetailsDAO;

	@Override
	public String saveBookingDeatils(BookingWrapper bookingWrapper) {
		return bookingDetailsDAO.saveBookingDeatils(bookingWrapper);
	}

	@Override
	public BookingWrapper getBookingData(int awbNumber) {
		return bookingDetailsDAO.getBookingData(awbNumber);
	}

	@Override
	public List<FlightDetails> getFlightDetails(String origin, String destination, String shipmentDate) {
		return bookingDetailsDAO.getFlightDetails(origin, destination, shipmentDate);

	}
}
