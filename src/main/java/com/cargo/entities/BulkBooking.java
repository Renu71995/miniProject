package com.cargo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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

	public BulkBooking(Integer bulkId, Integer awbNumber, int pieceNumber, float weight,
			BasicBookingDetails basicBookingDetails) {
		super();
		this.bulkId = bulkId;
		this.awbNumber = awbNumber;
		this.pieceNumber = pieceNumber;
		this.weight = weight;
		this.basicBookingDetails = basicBookingDetails;
	}

	public Integer getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
	}

	public int getPieceNumber() {
		return pieceNumber;
	}

	public void setPieceNumber(int pieceNumber) {
		this.pieceNumber = pieceNumber;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
