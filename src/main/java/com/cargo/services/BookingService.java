package com.cargo.services;

 

import com.cargo.entities.BookingWrapper;

 

public interface BookingService {

 

    public String saveBookingDeatils(BookingWrapper bookingWrapper);

 

    public BookingWrapper getBookingData(int awbNumber) throws Exception;
    
    public BookingWrapper getFlightDetails(BookingWrapper bookingWrapper) throws Exception;

 

}