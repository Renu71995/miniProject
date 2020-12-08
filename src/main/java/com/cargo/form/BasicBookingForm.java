package com.cargo.form;

import java.io.Serializable;

public class BasicBookingForm implements Serializable {

	/** Default Serial version uid **/
	private static final long serialVersionUID = 1L;
	private Integer awbNumber;
	private String origin;
	private String destination;

	public BasicBookingForm(Integer awbNumber, String origin, String destination, String flightNumber) {
		super();
		this.awbNumber = awbNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
	}

	public Integer getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String flightNumber;
}
