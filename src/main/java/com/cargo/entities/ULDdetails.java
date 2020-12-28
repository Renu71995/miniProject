package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ULDdetails implements Serializable {

	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uldId;
	private Integer awbNumber;
	private String uldType;
	private Integer noOfUlds;
	private Float uldWeight;
	private String commodityCode;

//	@ManyToOne
//	@JoinColumn(name="basic_uldBooking")
//	private BasicBookingDetails basic_uldBooking;

	public ULDdetails(Integer uldId, Integer awbNumber, String uldType, Integer noOfUlds, Float uldWeight,
			String commodityCode
	// , BasicBookingDetails basicBookingDetails
	) {
		super();
		this.uldId = uldId;
		this.awbNumber = awbNumber;
		this.uldType = uldType;
		noOfUlds = noOfUlds;
		this.uldWeight = uldWeight;
		this.commodityCode = commodityCode;
		// this.basic_uldBooking = basicBookingDetails;
	}

	public ULDdetails() {
		// TODO Auto-generated constructor stub
	}

	public ULDdetails setUldValues(Integer awbNumber, ULDdetails ulDdetails) {
		ulDdetails.awbNumber = awbNumber;
		return ulDdetails;

	}

	public Integer getUldId() {
		return uldId;
	}

	public void setUldId(Integer uldId) {
		this.uldId = uldId;
	}

	public Integer getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
	}

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public Integer getNoOfUlds() {
		return noOfUlds;
	}

	public void setNoOfUlds(Integer noOfUlds) {
		this.noOfUlds = noOfUlds;
	}

	public Float getUldWeight() {
		return uldWeight;
	}

	public void setUldWeight(Float uldWeight) {
		this.uldWeight = uldWeight;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

//	public BasicBookingDetails getBasicBookingDetails() {
//		return basic_uldBooking;
//	}
//
//	public void setBasicBookingDetails(BasicBookingDetails basicBookingDetails) {
//		this.basic_uldBooking = basicBookingDetails;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ULDdetails [uldId=" + uldId + ", awbNumber=" + awbNumber + ", uldType=" + uldType + ", NoOfUlds="
				+ noOfUlds + ", uldWeight=" + uldWeight + ", commodityCode=" + commodityCode + ", basicBookingDetails="
				// + basic_uldBooking
				+ "]";
	}

}
