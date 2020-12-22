package com.cargo.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FlightDetails implements Serializable {

	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;
	private String flightNumber;
	private String origin;
	private String destination;
	private String shipmentDate;
	private boolean isManifested;
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date std;
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date sta;
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date atd;
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date ata;
//	@OneToMany(mappedBy = "flightDetails")
//	List<BasicBookingDetails> basicBookingDetailsList;

	public FlightDetails(Integer flightId, String flightNumber, String origin, String destination, String shipmentDate,
			boolean isManifested, Timestamp std, Timestamp sta, Timestamp atd, Timestamp ata
			//,List<BasicBookingDetails> basicBookingDetailsList
			) {
		super();
		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.shipmentDate = shipmentDate;
		this.isManifested = isManifested;
		this.std = std;
		this.sta = sta;
		this.atd = atd;
		this.ata = ata;
		//this.basicBookingDetailsList = basicBookingDetailsList;
	}
	public FlightDetails(){
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public boolean isManifested() {
		return isManifested;
	}

	public void setManifested(boolean isManifested) {
		this.isManifested = isManifested;
	}

	public Date getStd() {
		return std;
	}

	public void setStd(Date std) {
		this.std = std;
	}

	public Date getSta() {
		return sta;
	}

	public void setSta(Date sta) {
		this.sta = sta;
	}

	public Date getAtd() {
		return atd;
	}

	public void setAtd(Date atd) {
		this.atd = atd;
	}

	public Date getAta() {
		return ata;
	}

	public void setAta(Date ata) {
		this.ata = ata;
	}

//	public List<BasicBookingDetails> getBasicBookingDetailsList() {
//		return basicBookingDetailsList;
//	}
//
//	public void setBasicBookingDetailsList(List<BasicBookingDetails> basicBookingDetailsList) {
//		this.basicBookingDetailsList = basicBookingDetailsList;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
