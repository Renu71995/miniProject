package com.cargo.entities;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BasicBookingDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="awb_number")
//	@GenericGenerator(name="awb_number",strategy="com.cargo.entities.IdGenerator")
	private int awbNumber;
	@Column(nullable = false)
	private String ubrNumber;
	private String awbStatus;
	@Column(nullable = false)
	private String origin;
	@Column(nullable = false)
	private String destination;
	@Column(nullable = false)
	private String flightNumber;
	@Column(nullable = false)
	private String agentCode;
	@Column(nullable = false)
	private String agentName;
	@Column(nullable = false)
	private String customerCode;
	@Column(nullable = false)
	private String customerName;
	@Column(nullable = false)
	private String shippingDate;
	@Column(nullable = false)
	private String scc;
	@Column(nullable = false)
	private String serviceClass;
	@Column(nullable = false)
	private String flightDetailsOrigin;
	@Column(nullable = false)
	private String flightDetailsDestination;
	@Column(nullable = false)
	private String flightDate;

	public String getFlightDetailsOrigin() {
		return flightDetailsOrigin;
	}
	public void setFlightDetailsOrigin(String flightDetailsOrigin) {
		this.flightDetailsOrigin = flightDetailsOrigin;
	}
	public String getFlightDetailsDestination() {
		return flightDetailsDestination;
	}
	public void setFlightDetailsDestination(String flightDetailsDestination) {
		this.flightDetailsDestination = flightDetailsDestination;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public BasicBookingDetails() {
	// TODO Auto-generated constructor stub
  	}
	public BasicBookingDetails(int awbNumber, String ubrNumber, String awbStatus, String origin, String destination,
			String flightNumber, String agentCode, String agentName, String customerCode, String customerName,
			String shippingDate, String scc, String serviceClass

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

	}


	public int getAwbNumber() {
		return awbNumber;
	}


	public void setAwbNumber(int awbNumber) {
		this.awbNumber = awbNumber;
	}
	
	public void setAwbNumber(){
		 Random r = new Random( System.currentTimeMillis());
		 this.awbNumber=75700000 + r.nextInt(20000);
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
