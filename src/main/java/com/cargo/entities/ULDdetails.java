package com.cargo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ULDdetails implements Serializable {

	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uldId;

	private Integer uldNumber;
	private Integer awbNumber;
	@OneToMany(mappedBy = "uldDetails")
	private List<BasicBookingDetails> basicBookingDetails;

	public ULDdetails(Integer uldId, Integer uldNumber, Integer awbNumber,
			List<BasicBookingDetails> basicBookingDetails) {
		super();
		this.uldId = uldId;
		this.uldNumber = uldNumber;
		this.awbNumber = awbNumber;
		this.basicBookingDetails = basicBookingDetails;
	}

	public Integer getUldId() {
		return uldId;
	}

	public void setUldId(Integer uldId) {
		this.uldId = uldId;
	}

	public Integer getUldNumber() {
		return uldNumber;
	}

	public void setUldNumber(Integer uldNumber) {
		this.uldNumber = uldNumber;
	}

	public Integer getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(Integer awbNumber) {
		this.awbNumber = awbNumber;
	}

	public List<BasicBookingDetails> getBasicBookingDetails() {
		return basicBookingDetails;
	}

	public void setBasicBookingDetails(List<BasicBookingDetails> basicBookingDetails) {
		this.basicBookingDetails = basicBookingDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
