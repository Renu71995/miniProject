package com.cargo.DAO;


import com.cargo.entities.BookingWrapper;
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
         String msg="";

        try {
            bookingDetailsRepository.save(bookingWrapper.getBasicBookingDetails());
            bookingWrapper.getUlDdetails().forEach(s->ulDdetailsRepository.save(s));
            bookingWrapper.getBulkBooking().forEach(s->bulBookingRepository.save(s));
            msg="Booking Details Saved Successfully";
        } catch (Exception e) {
            e.printStackTrace();
            msg="Error Caught:"+e.getMessage();
        }
        return  msg;
    }

    @Override
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

    @Override
    public List<FlightDetails> getFlightDetails(String origin, String destination, Date shipmentDate) {
        return flightDetailsRepository.findflight(origin,destination,shipmentDate);
    }
}
