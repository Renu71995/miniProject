package com.cargo.services;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cargo.DAO.BookingDetailsDAO;
import com.cargo.entities.BookingWrapper;

 

@Service
public class BookingServiceImpl implements BookingService {

 

    @Autowired
    BookingDetailsDAO bookingDetailsDAO;

 

    @Override
    public String saveBookingDeatils(BookingWrapper bookingWrapper) {
        return bookingDetailsDAO.saveBookingDeatils(bookingWrapper);
    }

 

    @Override
    public BookingWrapper getBookingData(int awbNumber) throws Exception {
        return bookingDetailsDAO.getBookingData(awbNumber);
    }

 

    @Override
    public BookingWrapper getFlightDetails(BookingWrapper bookingWrapper) throws Exception {
    return bookingDetailsDAO.getFlightDetails(bookingWrapper);

 

     }
}