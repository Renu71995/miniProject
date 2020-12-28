package com.cargo.DAO;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.entities.BasicBookingDetails;
import com.cargo.entities.BookingWrapper;
import com.cargo.entities.BulkBooking;
import com.cargo.entities.FlightDetails;
import com.cargo.entities.ULDdetails;
import com.cargo.repositories.BookingDetailsRepository;
import com.cargo.repositories.BulBookingRepository;
import com.cargo.repositories.FlightDetailsRepository;
import com.cargo.repositories.ULDdetailsRepository;

@Service
public class BookingDetailsDAOImp implements BookingDetailsDAO {

	@Autowired
	BookingDetailsRepository bookingDetailsRepository;
	@Autowired
	ULDdetailsRepository ulDdetailsRepository;
	@Autowired
	BulBookingRepository bulBookingRepository;

	@Autowired
	FlightDetailsRepository flightDetailsRepository;

	@Override
	public String saveBookingDeatils(BookingWrapper bookingWrapper) {
		String msg = "";

		try {

			BasicBookingDetails basicBookingDetails = bookingWrapper.getBasicBookingDetails();
			basicBookingDetails.setAwbNumber();
			basicBookingDetails.setUbrNumber(basicBookingDetails.getOrigin(), basicBookingDetails.getDestination(),
					ThreadLocalRandom.current().nextInt());
			basicBookingDetails = bookingDetailsRepository.save(bookingWrapper.getBasicBookingDetails());
			ULDdetails ulDdetails = ulDdetailsRepository.setUldValues(basicBookingDetails.getAwbNumber(),
					bookingWrapper.getUlDdetails());
			ulDdetailsRepository.save(ulDdetails);
			BulkBooking bulkBooking = bulBookingRepository.setAWBValue(basicBookingDetails.getAwbNumber(),
					bookingWrapper.getBulkBooking());
			bulBookingRepository.save(bulkBooking);
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Error Caught:" + e.getMessage();
		}
		return msg;
	}

	@Override
	public BookingWrapper getBookingData(int awbNumber) {
		BookingWrapper bookingWrapper = new BookingWrapper();

		try {
			bookingWrapper = new BookingWrapper();
			bookingWrapper.setBasicBookingDetails(bookingDetailsRepository.findById(awbNumber).get());
			bookingWrapper.setUlDdetails(ulDdetailsRepository.findByAWB(awbNumber));
			bookingWrapper.setBulkBooking(bulBookingRepository.findByAWB(awbNumber));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookingWrapper;
	}

	@Override
	public BookingWrapper getFlightDetails(BookingWrapper bookingWrapper) {
	BasicBookingDetails basicBookingDetails = new BasicBookingDetails();
	FlightDetails flightdetails= flightDetailsRepository.findflight(bookingWrapper.getFlightDetails().getOrigin(),
	bookingWrapper.getFlightDetails().getDestination(),bookingWrapper.getFlightDetails().getShipmentDate());
	basicBookingDetails.setFlightDetailsOrigin(flightdetails.getOrigin());
	basicBookingDetails.setFlightDetailsDestination(flightdetails.getDestination());
	basicBookingDetails.setFlightDate(flightdetails.getShipmentDate());
	basicBookingDetails.setFlightNumber(flightdetails.getFlightNumber());
	bookingWrapper.setBasicBookingDetails(basicBookingDetails);
	return bookingWrapper;
	}
}
	
	

