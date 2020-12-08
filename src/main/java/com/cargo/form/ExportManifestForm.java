package com.cargo.form;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ExportManifestForm implements Serializable {

	/** Default Serializable uid **/
	private static final long serialVersionUID = 1L;
	private String flightnumber;
	private List<Integer> awbNumberList;
	private Map<Integer, List<BasicBookingForm>> udawbMap;

	public ExportManifestForm(String flightnumber, List<Integer> awbNumberList,
			Map<Integer, List<BasicBookingForm>> udawbMap) {
		super();
		this.flightnumber = flightnumber;
		this.awbNumberList = awbNumberList;
		this.udawbMap = udawbMap;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public List<Integer> getAwbNumberList() {
		return awbNumberList;
	}

	public void setAwbNumberList(List<Integer> awbNumberList) {
		this.awbNumberList = awbNumberList;
	}

	public Map<Integer, List<BasicBookingForm>> getUdawbMap() {
		return udawbMap;
	}

	public void setUdawbMap(Map<Integer, List<BasicBookingForm>> udawbMap) {
		this.udawbMap = udawbMap;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
