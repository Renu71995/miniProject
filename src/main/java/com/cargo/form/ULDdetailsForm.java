package com.cargo.form;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ULDdetailsForm implements Serializable {

	/** Default Serial version uid **/
	private static final long serialVersionUID = 1L;
	private Integer uldNumber;
	private List<BasicBookingForm> basicBookingFormList;
}
