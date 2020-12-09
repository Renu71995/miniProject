package com.cargo.entities;

import javax.persistence.Entity;

@Entity
public class ConsignmentDetails {

	private Integer consignmentCode;
	private String consignmentName;
	private String consignmentAddress;
	private String consignmentCountry;
	private String consignmentCity;

	public ConsignmentDetails(Integer consignmentCode, String consignmentName, String consignmentAddress,
			String consignmentCountry, String consignmentCity) {
		super();
		this.consignmentCode = consignmentCode;
		this.consignmentName = consignmentName;
		this.consignmentAddress = consignmentAddress;
		this.consignmentCountry = consignmentCountry;
		this.consignmentCity = consignmentCity;
	}

	public Integer getConsignmentCode() {
		return consignmentCode;
	}

	public void setConsignmentCode(Integer consignmentCode) {
		this.consignmentCode = consignmentCode;
	}

	public String getConsignmentName() {
		return consignmentName;
	}

	public void setConsignmentName(String consignmentName) {
		this.consignmentName = consignmentName;
	}

	public String getConsignmentAddress() {
		return consignmentAddress;
	}

	public void setConsignmentAddress(String consignmentAddress) {
		this.consignmentAddress = consignmentAddress;
	}

	public String getConsignmentCountry() {
		return consignmentCountry;
	}

	public void setConsignmentCountry(String consignmentCountry) {
		this.consignmentCountry = consignmentCountry;
	}

	public String getConsignmentCity() {
		return consignmentCity;
	}

	public void setConsignmentCity(String consignmentCity) {
		this.consignmentCity = consignmentCity;
	}

}