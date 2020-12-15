package com.cargo.form;

import java.io.Serializable;
import java.util.List;

import com.cargo.entities.BasicBookingDetails;
import com.cargo.entities.ConsignmentDetails;
import com.cargo.entities.ShipperDetails;

public class AWBExecutionForm implements Serializable {
	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	// private String flightnumber;
	private long awbNumber;
	private long ubrNumber;

	private ConsignmentDetails consignmentdetails;
	private ShipperDetails shipperdetails;
	private List<BasicBookingDetails> basicBookingFormList;



	public AWBExecutionForm(long awbNumber, long ubrNumber, ConsignmentDetails consignmentdetails,
			ShipperDetails shipperdetails, List<BasicBookingDetails> basicBookingFormList) {
		super();
		this.awbNumber = awbNumber;
		this.ubrNumber = ubrNumber;
		this.consignmentdetails = consignmentdetails;
		this.shipperdetails = shipperdetails;
		this.basicBookingFormList = basicBookingFormList;
	}

	public long getUbrNumber() {
		return ubrNumber;
	}

	public void setUbrNumber(long ubrNumber) {
		this.ubrNumber = ubrNumber;
	}

	public long getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(long awbNumber) {
		this.awbNumber = awbNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<BasicBookingDetails> getBasicBookingFormList() {
		return basicBookingFormList;
	}

	public void setBasicBookingFormList(List<BasicBookingDetails> basicBookingFormList) {
		this.basicBookingFormList = basicBookingFormList;
	}

	public ConsignmentDetails getConsignmentdetails() {
		return consignmentdetails;
	}

	public void setConsignmentdetails(ConsignmentDetails consignmentdetails) {
		this.consignmentdetails = consignmentdetails;
	}

	public ShipperDetails getShipperdetails() {
		return shipperdetails;
	}

	public void setShipperdetails(ShipperDetails shipperdetails) {
		this.shipperdetails = shipperdetails;
	}
	

}
