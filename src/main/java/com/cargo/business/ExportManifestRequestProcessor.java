package com.cargo.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cargo.entities.BasicBookingDetails;
import com.cargo.entities.FlightDetails;
import com.cargo.form.BasicBookingForm;
import com.cargo.form.ExportManifestForm;

/**
 * Export manifest request processor class
 * 
 * @author Rituraj
 *
 */
@Component
public class ExportManifestRequestProcessor {

	/**
	 * Method to get export manifest form from flight details entity
	 * 
	 * @param flightDetails
	 * @return export manifest form
	 */
	public ExportManifestForm requestProcessor(FlightDetails flightDetails, ExportManifestForm exportManifestForm) {

		exportManifestForm.setFlightnumber(flightDetails.getFlightNumber());
		exportManifestForm.setAwbNumberList(flightDetails.getBasicBookingDetailsList().stream()
				.map(e -> e.getAwbNumber()).collect(Collectors.toList()));
		Map<Integer, List<BasicBookingForm>> uldAwbMap = new HashMap<>();
		for (BasicBookingDetails basicBookingDetails : flightDetails.getBasicBookingDetailsList()) {
			if (!uldAwbMap.containsKey(basicBookingDetails.getUldDetails().getUldNumber())) {
				List<BasicBookingForm> basicBookingFormlist = new ArrayList<>();
				basicBookingFormlist.add(convertToBAsicBookingForm(basicBookingDetails));
				uldAwbMap.put(basicBookingDetails.getUldDetails().getUldNumber(), basicBookingFormlist);
			} else {
				uldAwbMap.get(basicBookingDetails.getUldDetails().getUldNumber())
						.add(convertToBAsicBookingForm(basicBookingDetails));
			}
		}
		return exportManifestForm;
	}

	/**
	 * Method to get Basicbooking form from basic booking details entity
	 * 
	 * @param basicBookingDetails
	 * @return basic booking form
	 */
	private static BasicBookingForm convertToBAsicBookingForm(BasicBookingDetails basicBookingDetails) {
		BasicBookingForm basicBookingForm = new BasicBookingForm(basicBookingDetails.getAwbNumber(),
				basicBookingDetails.getOrigin(), basicBookingDetails.getDestination(),
				basicBookingDetails.getFlightNumber());
		basicBookingForm.setAwbNumber(basicBookingDetails.getAwbNumber());
		basicBookingForm.setDestination(basicBookingDetails.getDestination());
		basicBookingForm.setOrigin(basicBookingDetails.getOrigin());
		return basicBookingForm;
	}
}
