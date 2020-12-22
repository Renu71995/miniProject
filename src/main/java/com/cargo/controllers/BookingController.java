package com.cargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cargo.entities.BasicBookingDetails;
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
		model.addAttribute("flightDetails",new FlightDetails());
		System.out.println("djbd");
		return "BookingPage";
	}

	@RequestMapping(value = "/booking", method = { RequestMethod.GET })
	public String getBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {

		int awbnumber = bookingWrapper.getBasicBookingDetails().getAwbNumber();
		 bookingWrapper=bookingService.getBookingData(awbnumber);
		 System.out.println(bookingWrapper.getBasicBookingDetails());
		 System.out.println(bookingWrapper.getBulkBooking());
		 System.out.println(bookingWrapper.getUlDdetails());
		model.addAttribute("bookingWrapper",bookingWrapper);
		return "BookingPage";
	}

	@RequestMapping(value = "/booking", method = { RequestMethod.POST })
	public String saveBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {
		bookingService.saveBookingDeatils(bookingWrapper);
		model.addAttribute("bookingWrapper", bookingWrapper);
		return "BookingPage";
	}

	
	@RequestMapping(value = "/booking/getFlights", method = { RequestMethod.POST })
	public String getFlights(@ModelAttribute FlightDetails flightDetails, Model model) {
		bookingService.getFlightDetails(flightDetails.getOrigin(), flightDetails.getDestination(),
				flightDetails.getShipmentDate());
		model.addAttribute("flightDetails", flightDetails);
		return "BookingPage";

	}
}