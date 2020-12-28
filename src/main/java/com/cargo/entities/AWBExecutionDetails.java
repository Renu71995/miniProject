package com.cargo.entities;

import org.springframework.stereotype.Component;

@Component
public class AWBExecutionDetails {

	private ShipperDetails shipperDetails;
	private ConsignmentDetails consignmentDetails;
	private BasicBookingDetails basicBookingDetails;
	private BulkBooking bulkBooking;
	private ULDdetails uldDetails;
	private BookingWrapper boookingWrapper;

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

	public BasicBookingDetails getBasicBookingDetails() {
		return basicBookingDetails;
	}

	public void setBasicBookingDetails(BasicBookingDetails basicBookingDetails) {
		this.basicBookingDetails = basicBookingDetails;
	}

	public BulkBooking getBulkBooking() {
		return bulkBooking;
	}

	public void setBulkBooking(BulkBooking bulkBooking) {
		this.bulkBooking = bulkBooking;
	}

	public ULDdetails getUldDetails() {
		return uldDetails;
	}

	public void setUldDetails(ULDdetails uldDetails) {
		this.uldDetails = uldDetails;
	}

	public BookingWrapper getBoookingWrapper() {
		return boookingWrapper;
	}

	public void setBoookingWrapper(BookingWrapper boookingWrapper) {
		this.boookingWrapper = boookingWrapper;
	}

}