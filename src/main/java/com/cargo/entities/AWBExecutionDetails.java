package com.cargo.entities;

import javax.persistence.Entity;

@Entity
public class AWBExecutionDetails {

	private Integer ubrNumber;
	private Integer awbNumber;
	private ShipperDetails shipperDetails;
	private ConsignmentDetails consignmentDetails;
	private BasicBookingDetails basicBookingDetails;
	 

	public AWBExecutionDetails(Integer ubrNumber, Integer awbNumber, ShipperDetails shipperDetails,
			ConsignmentDetails consignmentDetails, BasicBookingDetails basicBookingDetails) {
		super();
		this.ubrNumber = ubrNumber;
		this.awbNumber = awbNumber;
		this.shipperDetails = shipperDetails;
		this.consignmentDetails = consignmentDetails;
		this.basicBookingDetails = basicBookingDetails;
	}

	public Integer getUbrNumber() {
		return ubrNumber;
	}

	public void setUbrNumber(Integer ubrNumber) {
		this.ubrNumber = ubrNumber;
	}

	public Integer getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
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

	public BasicBookingDetails getBasicBookingDetails() {
		return basicBookingDetails;
	}

	public void setBasicBookingDetails(BasicBookingDetails basicBookingDetails) {
		this.basicBookingDetails = basicBookingDetails;
	}

}