package com.cargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cargo.entities.BookingWrapper;
import com.cargo.services.BookingService;

@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewBookingPage(Model model) {
		model.addAttribute("bookingWrapper", new BookingWrapper());
		//model.addAttribute("flightDetails",new FlightDetails());
		return "BookingPage";
	}

    @RequestMapping(value = "/booking", method = { RequestMethod.GET })
    public String getBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {

 

        Integer awbnumber = bookingWrapper.getBasicBookingDetails().getAwbNumber();
        if(bookingWrapper.getBasicBookingDetails() != null && awbnumber!= null && awbnumber != 0) {
            try {
         bookingWrapper=bookingService.getBookingData(bookingWrapper.getBasicBookingDetails().getAwbNumber());
        model.addAttribute("bookingWrapper",bookingWrapper);
            return "BookingPage";
         } catch(Exception e)  {
             model.addAttribute("errorMessage1", " Requested AWB number not available");
                return "BookingPage";
         }
        }
        else {
            model.addAttribute("errorMessage1", " Awb should not be zero or an empty value");
            return "BookingPage";
        }
    }

	@RequestMapping(value = "/booking", method = { RequestMethod.POST })
	public String saveBookingDetails(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {
		
		if((bookingWrapper.getBasicBookingDetails().getOrigin().equals(bookingWrapper.getBasicBookingDetails().getFlightDetailsOrigin()))
				&& (bookingWrapper.getBasicBookingDetails().getDestination().equals(bookingWrapper.getBasicBookingDetails().getFlightDetailsDestination()))
				&& (bookingWrapper.getBasicBookingDetails().getShippingDate().equals(bookingWrapper.getBasicBookingDetails().getFlightDate()))) {
		bookingService.saveBookingDeatils(bookingWrapper);
		System.out.println(bookingWrapper.getBasicBookingDetails());
		 System.out.println(bookingWrapper.getBulkBooking());
		 System.out.println(bookingWrapper.getUlDdetails());
		 System.out.println("flightdate" +bookingWrapper.getBasicBookingDetails().getFlightDate());
		 System.out.println("shipment date" +bookingWrapper.getBasicBookingDetails().getShippingDate());
		 
		model.addAttribute("bookingWrapper", bookingWrapper);
		return "BookingPage";
		}
		else {
			model.addAttribute("errorMessage", "Origin,Destination and Flight date should be same as Shipment details");
			return "BookingPage";
		}
	}
	
    @RequestMapping(value = "/booking/getFlights", method = { RequestMethod.GET })
    public String getFlights(@ModelAttribute("bookingWrapper") BookingWrapper bookingWrapper,Model model) {
        System.out.println(bookingWrapper.getFlightDetails().getShipmentDate());
        try {
        bookingWrapper = bookingService.getFlightDetails( bookingWrapper);
        model.addAttribute("flightnumber", bookingWrapper);
        return "BookingPage";
        } catch(Exception e) {
            model.addAttribute("errorMessage3", "No flights available");
            return "BookingPage";
        }

    }
}