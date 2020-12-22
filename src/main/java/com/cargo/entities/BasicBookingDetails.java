package com.cargo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class BasicBookingDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="awb_number")
//	@GenericGenerator(name="awb_number",strategy="com.cargo.entities.IdGenerator")
	private int awbNumber;
	private String ubrNumber;
	private String awbStatus;
	private String origin;
	private String destination;
	private String flightNumber;
	private String agentCode;
	private String agentName;
	private String customerCode;
	private String customerName;
	private String shippingDate;
	private String scc;
	private String serviceClass;
	
//	@OneToMany(mappedBy="basic_bulkBooking",cascade=CascadeType.ALL)
//	private Set<BulkBooking> bulkBooking;
//	
//	@OneToMany(mappedBy="basic_uldBooking",cascade=CascadeType.ALL)
//	private Set<ULDdetails> uldDetails;

	public BasicBookingDetails() {
	// TODO Auto-generated constructor stub
  	}
	public BasicBookingDetails(int awbNumber, String ubrNumber, String awbStatus, String origin, String destination,
			String flightNumber, String agentCode, String agentName, String customerCode, String customerName,
			String shippingDate, String scc, String serviceClass
//			, Set<BulkBooking> bulkBooking,
//			Set<ULDdetails> uldDetails
			) {
		super();
		this.awbNumber = awbNumber;
		this.ubrNumber = ubrNumber;
		this.awbStatus = awbStatus;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.agentCode = agentCode;
		this.agentName = agentName;
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.shippingDate = shippingDate;
		this.scc = scc;
		this.serviceClass = serviceClass;
//		this.bulkBooking = bulkBooking;
//		this.uldDetails = uldDetails;
	}


	public int getAwbNumber() {
		return awbNumber;
	}


	public void setAwbNumber(int awbNumber) {
		this.awbNumber = awbNumber;
	}


	public String getUbrNumber() {
		 
		
		return ubrNumber;
	}


	public void setUbrNumber(String ubrNumber) {
		this.ubrNumber=ubrNumber;
	}
	
	public void setUbrNumber(String origin,String destination,int randomnumber) {
		this.ubrNumber=origin+destination+randomnumber;
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


	public String getAgentCode() {
		return agentCode;
	}


	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}


	public String getAgentName() {
		return agentName;
	}


	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


	public String getCustomerCode() {
		return customerCode;
	}


	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getShippingDate() {
		return shippingDate;
	}


	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}


	public String getScc() {
		return scc;
	}


	public void setScc(String scc) {
		this.scc = scc;
	}


	public String getServiceClass() {
		return serviceClass;
	}


	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}


//	public Set<BulkBooking> getBulkBooking() {
//		return bulkBooking;
//	}
//
//
//	public void setBulkBooking(Set<BulkBooking> bulkBooking) {
//		this.bulkBooking = bulkBooking;
//	}
//
//
//	public Set<ULDdetails> getUldDetails() {
//		return uldDetails;
//	}
//
//
//	public void setUldDetails(Set<ULDdetails> uldDetails) {
//		this.uldDetails = uldDetails;
//	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BasicBookingDetails [awbNumber=" + awbNumber + ", ubrNumber=" + ubrNumber + ", awbStatus=" + awbStatus
				+ ", origin=" + origin + ", destination=" + destination + ", flightNumber=" + flightNumber
				+ ", agentCode=" + agentCode + ", agentName=" + agentName + ", customerCode=" + customerCode
				+ ", customerName=" + customerName + ", shippingDate=" + shippingDate + ", scc=" + scc
				+ ", serviceClass=" + serviceClass + ", bulkBooking="
//				+ bulkBooking + ", uldDetails=" + uldDetails
				+ "]";
	}
	
	
	


	
}
