package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class BulkBooking implements Serializable {

	/** Default serial version uid **/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bulkId;
	private Integer awbNumber;
	private int pieceNumber;
	private float weight;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "awbNumber", referencedColumnName = "awbNumber", insertable = false, updatable = false)
	private BasicBookingDetails basicBookingDetails;
}
