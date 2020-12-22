package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BulkBooking implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bulkId;
	private Integer awbNumber;
	private Integer pieceNumber;
	private Float weight;
	private Integer volume;
	private String commodityCode;
	
	public BulkBooking(Integer bulkId, Integer awbNumber, Integer pieceNumber, Float weight, Integer volume,
			String commodityCode
		//	, BasicBookingDetails basicBookingDetails
			) {
		super();
		this.bulkId = bulkId;
		this.awbNumber = awbNumber;
		this.pieceNumber = pieceNumber;
		this.weight = weight;
		this.volume = volume;
		this.commodityCode = commodityCode;
	//	this.basic_bulkBooking = basicBookingDetails;
	}
 
	public BulkBooking() {
	// TODO Auto-generated constructor stub
	}
 

	public Integer getBulkId() {
		return bulkId;
	}


	public void setBulkId(Integer bulkId) {
		this.bulkId = bulkId;
	}


	public Integer getAwbNumber() {
		return awbNumber;
	}


	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
	}


	public Integer getPieceNumber() {
		return pieceNumber;
	}


	public void setPieceNumber(Integer pieceNumber) {
		this.pieceNumber = pieceNumber;
	}


	public Float getWeight() {
		return weight;
	}


	public void setWeight(Float weight) {
		this.weight = weight;
	}


	public Integer getVolume() {
		return volume;
	}


	public void setVolume(Integer volume) {
		this.volume = volume;
	}


	public String getCommodityCode() {
		return commodityCode;
	}


	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}


//	public BasicBookingDetails getBasicBookingDetails() {
//		return basic_bulkBooking;
//	}
//
//
//	public void setBasicBookingDetails(BasicBookingDetails basicBookingDetails) {
//		this.basic_bulkBooking = basicBookingDetails;
//	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	/** Default serial version uid **/

//	
//	@ManyToOne
//	@JoinColumn(name="booking_awbNumber")
//	private BasicBookingDetails basic_bulkBooking;

	@Override
	public String toString() {
		return "BulkBooking [bulkId=" + bulkId + ", awbNumber=" + awbNumber + ", pieceNumber=" + pieceNumber
				+ ", weight=" + weight + ", volume=" + volume + ", commodityCode=" + commodityCode
				+ ", basicBookingDetails=" 
				//+ basic_bulkBooking 
				+ "]";
	}




}
