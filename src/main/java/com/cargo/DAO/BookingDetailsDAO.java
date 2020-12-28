package com.cargo.DAO;

import java.util.List;

import com.cargo.entities.BookingWrapper;
import com.cargo.entities.FlightDetails;

public interface BookingDetailsDAO {

	public String saveBookingDeatils(BookingWrapper bookingWrapper);

	public BookingWrapper getBookingData(int awbNumber);

	public List<FlightDetails> getFlightDetails(String origin, String destination, String shipmentDate);
}
