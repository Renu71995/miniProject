package com.cargo.entities;

import org.springframework.stereotype.Component;

@Component
public class BookingWrapper {

	private BasicBookingDetails basicBookingDetails;

	private ULDdetails ulDdetails;
	private BulkBooking bulkBooking;
	private ShipperDetails shipperDetails;
	private ConsignmentDetails consignmentDetails;

	public BookingWrapper() {
		// TODO Auto-generated constructor stub

	}

	public BasicBookingDetails getBasicBookingDetails() {
		return basicBookingDetails;
	}

	public void setBasicBookingDetails(BasicBookingDetails basicBookingDetails) {
		this.basicBookingDetails = basicBookingDetails;
	}

	public ULDdetails getUlDdetails() {
		return ulDdetails;
	}

	public void setUlDdetails(ULDdetails ulDdetails) {
		this.ulDdetails = ulDdetails;
	}

	public BulkBooking getBulkBooking() {
		return bulkBooking;
	}

	public void setBulkBooking(BulkBooking bulkBooking) {
		this.bulkBooking = bulkBooking;
	}

	public ShipperDetails getShipperDetails() {
		return shipperDetails;
	}

	public void setShipperDetails(ShipperDetails shipperDetails) {
		this.shipperDetails = shipperDetails;
	}

	public ConsignmentDetails getConsignmentDetails() {
		return consignmentDetails;
	}

	public void setConsignmentDetails(ConsignmentDetails consignmentDetails) {
		this.consignmentDetails = consignmentDetails;
	}

}
