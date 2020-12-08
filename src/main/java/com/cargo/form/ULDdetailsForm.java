package com.cargo.form;

import java.io.Serializable;
import java.util.List;

public class ULDdetailsForm implements Serializable {

	/** Default Serial version uid **/
	private static final long serialVersionUID = 1L;
	private Integer uldNumber;
	private List<BasicBookingForm> basicBookingFormList;

	public ULDdetailsForm(Integer uldNumber, List<BasicBookingForm> basicBookingFormList) {
		super();
		this.uldNumber = uldNumber;
		this.basicBookingFormList = basicBookingFormList;
	}

	public Integer getUldNumber() {
		return uldNumber;
	}

	public void setUldNumber(Integer uldNumber) {
		this.uldNumber = uldNumber;
	}

	public List<BasicBookingForm> getBasicBookingFormList() {
		return basicBookingFormList;
	}

	public void setBasicBookingFormList(List<BasicBookingForm> basicBookingFormList) {
		this.basicBookingFormList = basicBookingFormList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
