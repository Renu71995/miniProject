package com.cargo.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingWrapper {

	
    private BasicBookingDetails basicBookingDetails;
	
    private List<ULDdetails> ulDdetails;

    private List<BulkBooking> bulkBooking;


    public BasicBookingDetails getBasicBookingDetails() {
        return basicBookingDetails;
    }

    public void setBasicBookingDetails(BasicBookingDetails basicBookingDetails) {
        this.basicBookingDetails = basicBookingDetails;
    }

    public List<ULDdetails> getUlDdetails() {
        return ulDdetails;
    }

    public void setUlDdetails(List<ULDdetails> ulDdetails) {
        this.ulDdetails = ulDdetails;
    }

    public List<BulkBooking> getBulkBooking() {
        return bulkBooking;
    }

    public void setBulkBooking(List<BulkBooking> bulkBooking) {
        this.bulkBooking = bulkBooking;
    }
}
