package com.cargo.form;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ExportManifestForm implements Serializable {

	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	private String flightnumber;
	private List<Integer> awbNumberList;
	private Map<Integer, List<BasicBookingForm>> udawbMap;
}
