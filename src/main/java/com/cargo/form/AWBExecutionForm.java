package com.cargo.form;

import java.io.Serializable;

public class AWBExecutionForm implements Serializable {
	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	private String flightnumber;
	private int awbNumber;
	
	public AWBExecutionForm(String flightnumber, int awbNumber) {
		super();
		this.flightnumber = flightnumber;
		this.awbNumber = awbNumber;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public int getAwbNumber() {
		return awbNumber;
	}
	public void setAwbNumber(int awbNumber) {
		this.awbNumber = awbNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
