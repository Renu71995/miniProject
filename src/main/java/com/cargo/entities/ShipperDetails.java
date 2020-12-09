package com.cargo.entities;

import javax.persistence.Entity;

@Entity
public class ShipperDetails {

	private Integer shipperCode;
	private String shipperName;
	private String shipperAddress;
	private String shipperCountry;
	private String shipperCity;

	public ShipperDetails(Integer shipperCode, String shipperName, String shipperAddress, String shipperCountry,
			String shipperCity) {
		super();
		this.shipperCode = shipperCode;
		this.shipperName = shipperName;
		this.shipperAddress = shipperAddress;
		this.shipperCountry = shipperCountry;
		this.shipperCity = shipperCity;
	}

	public Integer getShipperCode() {
		return shipperCode;
	}

	public void setShipperCode(Integer shipperCode) {
		this.shipperCode = shipperCode;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getShipperAddress() {
		return shipperAddress;
	}

	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}

	public String getShipperCountry() {
		return shipperCountry;
	}

	public void setShipperCountry(String shipperCountry) {
		this.shipperCountry = shipperCountry;
	}

	public String getShipperCity() {
		return shipperCity;
	}

	public void setShipperCity(String shipperCity) {
		this.shipperCity = shipperCity;
	}

}