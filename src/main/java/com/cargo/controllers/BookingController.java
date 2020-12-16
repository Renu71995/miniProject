package com.cargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cargo.entities.BookingWrapper;
import com.cargo.entities.FlightDetails;
import com.cargo.services.BookingService;

@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewBookingPage(Model model) {
		model.addAttribute("bookingWrapper", new BookingWrapper());
		model.addAttribute("flightDetails",new FlightDetails(null, null, null, null, null, false, null, null, null, null, null));
		System.out.println("djbd");
		return "bookingpage";
	}

	@RequestMapping(value = "/booking", method = { RequestMethod.GET })
	public String getBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {

		int awbnumber = bookingWrapper.getBasicBookingDetails().getAwbNumber();
		//BookingWrapper bookingWrapper=bookingService.getBookingData(bookingdetails.getAwbNumber());
		model.addAttribute("bookingWrapper",bookingWrapper);
		return "bookingpage";
	}

	@RequestMapping(value = "/booking", method = { RequestMethod.POST })
	public String saveBookingDetails(@ModelAttribute final BookingWrapper bookingWrapper, Model model) {
		bookingService.saveBookingDeatils(bookingWrapper);
		model.addAttribute("bookingWrapper", bookingWrapper);
		return "bookingpage";
	}

	
	@RequestMapping(value = "/booking/getFlights", method = { RequestMethod.POST })
	public String getFlights(@ModelAttribute FlightDetails flightDetails, Model model) {
		bookingService.getFlightDetails(flightDetails.getOrigin(), flightDetails.getDestination(),
				flightDetails.getShipmentDate());
		model.addAttribute("flightDetails", flightDetails);
		return "bookingpage";

	}
}