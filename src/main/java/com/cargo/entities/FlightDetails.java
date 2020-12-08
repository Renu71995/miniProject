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

import lombok.Data;

@Data
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
	private Date shipmentDate;
	private boolean isManifested;
	private Timestamp std;
	private Timestamp sta;
	private Timestamp atd;
	private Timestamp ata;
	@OneToMany(mappedBy = "flightDetails")
	List<BasicBookingDetails> basicBookingDetailsList;
}
