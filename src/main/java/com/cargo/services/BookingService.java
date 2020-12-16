package com.cargo.services;

import com.cargo.entities.BookingWrapper;
import com.cargo.entities.FlightDetails;

import java.util.Date;
import java.util.List;


public interface BookingService {
	
	public String saveBookingDeatils(BookingWrapper bookingWrapper);

	public BookingWrapper getBookingData(int awbNumber);

	public List<FlightDetails> getFlightDetails(String origin, String destination, Date shipmentDate);
	
}
