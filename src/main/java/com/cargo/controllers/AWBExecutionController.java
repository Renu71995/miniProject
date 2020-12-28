package com.cargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cargo.entities.AWBExecutionDetails;
import com.cargo.entities.BookingWrapper;
import com.cargo.entities.FlightDetails;
import com.cargo.services.AWBExecutionService;
import com.cargo.services.BookingService;

@Controller
public class AWBExecutionController {
	@Autowired
	private BookingService bookingService;
	@Autowired
	private AWBExecutionService awbExecutionService;
	@RequestMapping(value = "/awb", method = RequestMethod.GET)
	public String viewBookingPage(Model model) {
		model.addAttribute("bookingWrapper", new BookingWrapper());
		System.out.println("djbd");
		return "awbexecution";
	}

	@RequestMapping(value = "/awbexecution", method = { RequestMethod.GET })
	public String getBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {

		int awbnumber = bookingWrapper.getBasicBookingDetails().getAwbNumber();
		 bookingWrapper=bookingService.getBookingData(awbnumber);
		 System.out.println(bookingWrapper.getBasicBookingDetails());
		 System.out.println(bookingWrapper.getBulkBooking());
		 System.out.println(bookingWrapper.getUlDdetails());
		model.addAttribute("bookingWrapper",bookingWrapper);
		return "awbexecution";
	}
	@RequestMapping(value = "/awbexecution/1", method = { RequestMethod.POST })
	public String saveBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {
		System.out.println("in the awb excution controller method");
		bookingService.saveBookingDeatils(bookingWrapper);
		System.out.println(bookingWrapper.getBasicBookingDetails());
		 System.out.println(bookingWrapper.getBulkBooking());
		 System.out.println(bookingWrapper.getUlDdetails());
		 System.out.println(bookingWrapper.getBasicBookingDetails().getFlightNumber());
		 System.out.println(bookingWrapper.getBasicBookingDetails().getShippingDate());
		 awbExecutionService.saveAwb(bookingWrapper);
		model.addAttribute("bookingWrapper", bookingWrapper);
		return "awbexecution";
	}

	
//	@RequestMapping(value = "/awbexecution/", method = { RequestMethod.POST })
//	public String saveShiper(@ModelAttribute("awbExecutionDetails") AWBExecutionDetails awbExecutionDetails, Model model) {
//		awbExecutionService.saveAwb(awbExecutionDetails);
//		model.addAttribute("awbExecutionDetails", awbExecutionDetails);
//		
//		return "awbexecution";
//
//		
//	}

}
