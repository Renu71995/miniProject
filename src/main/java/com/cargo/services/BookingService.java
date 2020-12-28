package com.cargo.services;

import com.cargo.entities.BookingWrapper;

public interface BookingService {

	public String saveBookingDeatils(BookingWrapper bookingWrapper);

	public BookingWrapper getBookingData(int awbNumber);
	
	public BookingWrapper getFlightDetails(BookingWrapper bookingWrapper);

}
