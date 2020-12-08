package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BasicBookingDetails implements Serializable {

	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	@Id
	private Integer awbNumber;
	private Integer ubrNumber;
	private String awbStatus;
	private String origin;
	private String destination;
	private String flightNumber;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "flightNumber", referencedColumnName = "flightNumber", updatable = false, insertable = false)
	private FlightDetails flightDetails;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "awbNumber", referencedColumnName = "awbNumber", updatable = false, insertable = false)
	private ULDdetails uldDetails;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "awbNumber", referencedColumnName = "awbNumber", updatable = false, insertable = false)
	private BulkBooking bulkbooking;

	public BasicBookingDetails(Integer awbNumber, Integer ubrNumber, String awbStatus, String origin,
			String destination, String flightNumber, FlightDetails flightDetails, ULDdetails uldDetails,
			BulkBooking bulkbooking) {
		super();
		this.awbNumber = awbNumber;
		this.ubrNumber = ubrNumber;
		this.awbStatus = awbStatus;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.flightDetails = flightDetails;
		this.uldDetails = uldDetails;
		this.bulkbooking = bulkbooking;
	}

	public Integer getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
	}

	public Integer getUbrNumber() {
		return ubrNumber;
	}

	public void setUbrNumber(Integer ubrNumber) {
		this.ubrNumber = ubrNumber;
	}

	public String getAwbStatus() {
		return awbStatus;
	}

	public void setAwbStatus(String awbStatus) {
		this.awbStatus = awbStatus;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public FlightDetails getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}

	public ULDdetails getUldDetails() {
		return uldDetails;
	}

	public void setUldDetails(ULDdetails uldDetails) {
		this.uldDetails = uldDetails;
	}

	public BulkBooking getBulkbooking() {
		return bulkbooking;
	}

	public void setBulkbooking(BulkBooking bulkbooking) {
		this.bulkbooking = bulkbooking;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
