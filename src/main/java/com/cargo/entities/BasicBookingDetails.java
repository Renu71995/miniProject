package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
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
}
