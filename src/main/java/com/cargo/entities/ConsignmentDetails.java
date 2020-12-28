package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConsignmentDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public ConsignmentDetails() {
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "ConsignmentDetails [consignmentCode=" + consignmentCode + ", consignmentName=" + consignmentName
				+ ", consignmentAddress=" + consignmentAddress + ", consignmentCountry=" + consignmentCountry
				+ ", consignmentCity=" + consignmentCity + "]";
	}

	
}