package com.cargo.form;

import java.io.Serializable;

import lombok.Data;
@Data
public class BasicBookingForm implements Serializable{

	/**	Default Serial version uid **/
	private static final long serialVersionUID = 1L;
	private Integer awbNumber;
	private String origin;
	private String destination;
	private String flightNumber;
}
