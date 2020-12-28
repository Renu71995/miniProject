package com.cargo.DAO;


import com.cargo.entities.BasicBookingDetails;
import com.cargo.entities.BookingWrapper;
import com.cargo.entities.BulkBooking;
import com.cargo.entities.FlightDetails;
import com.cargo.entities.ULDdetails;
import com.cargo.repositories.BookingDetailsRepository;
import com.cargo.repositories.BulBookingRepository;
import com.cargo.repositories.FlightDetailsRepository;
import com.cargo.repositories.ULDdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

    public String saveBookingDeatils(BookingWrapper bookingWrapper) {
         String msg="";

        try {
        	
          BasicBookingDetails basicBookingDetails=bookingWrapper.getBasicBookingDetails();
          basicBookingDetails.setUbrNumber(basicBookingDetails.getOrigin(),basicBookingDetails.getDestination(),ThreadLocalRandom.current().nextInt());
           basicBookingDetails=bookingDetailsRepository.save(bookingWrapper.getBasicBookingDetails());
          
//            bookingWrapper.getUlDdetails().forEach(s->ulDdetailsRepository.save(s));
//            bookingWrapper.getBulkBooking().forEach(s->bulBookingRepository.save(s));
          	ULDdetails ulDdetails=ulDdetailsRepository.setUldValues(basicBookingDetails.getAwbNumber(),bookingWrapper.getUlDdetails());
            ulDdetailsRepository.save(ulDdetails);
            BulkBooking bulkBooking=bulBookingRepository.setAWBValue(basicBookingDetails.getAwbNumber(), bookingWrapper.getBulkBooking());
            bulBookingRepository.save(bulkBooking);
        } catch (Exception e) {
            e.printStackTrace();
            msg="Error Caught:"+e.getMessage();
        }
        return  msg;
    }

    public BookingWrapper getBookingData(int awbNumber) {
        BookingWrapper  bookingWrapper=new BookingWrapper();

        try {
            bookingWrapper=new BookingWrapper();
            bookingWrapper.setBasicBookingDetails(bookingDetailsRepository.findById(awbNumber).get());
            bookingWrapper.setUlDdetails(ulDdetailsRepository.findByAWB(awbNumber));
            bookingWrapper.setBulkBooking(bulBookingRepository.findByAWB(awbNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookingWrapper;
    }

    public List<FlightDetails> getFlightDetails(String origin, String destination, String shipmentDate) {
        return flightDetailsRepository.findflight(origin,destination,shipmentDate);
    }
}
