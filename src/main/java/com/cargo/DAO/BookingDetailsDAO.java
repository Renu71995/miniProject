package com.cargo.DAO;

 

import com.cargo.entities.BookingWrapper;

 

public interface BookingDetailsDAO {

 

    public String saveBookingDeatils(BookingWrapper bookingWrapper);

 

    public BookingWrapper getBookingData(int awbNumber) throws Exception;

 

    public BookingWrapper getFlightDetails(BookingWrapper bookingWrapper) throws Exception;
}
 