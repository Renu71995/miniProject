package com.cargo.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cargo.entities.AWBExecutionDetails;
import com.cargo.entities.BasicBookingDetails;
import com.cargo.entities.ConsignmentDetails;
import com.cargo.entities.FlightDetails;
import com.cargo.form.AWBExecutionForm;
import com.cargo.form.BasicBookingForm;

@Component
public class AWBExecutionRequestProcessor {
	public AWBExecutionForm requestProcessorAWBexecution(AWBExecutionDetails awbexecutionDetails,
			AWBExecutionForm awbexecutionform) {
		
		List<AWBExecutionForm> awbexecutionList=new ArrayList<>();
		
		Map<Integer, List<AWBExecutionForm>> awbExecMap = new HashMap<>();
		awbexecutionform.setAwbNumber(awbexecutionDetails.getAwbNumber());
		awbexecutionform.setUbrNumber(awbexecutionDetails.getUbrNumber());
		awbexecutionform.setConsignmentdetails(awbexecutionDetails.getConsignmentDetails());
		awbexecutionform.setShipperdetails(awbexecutionDetails.getShipperDetails());
		awbexecutionform.setBasicBookingFormList(awbexecutionDetails.getBasicBookingDetails());
		awbexecutionList.add(awbexecutionform);
		awbExecMap.put(awbexecutionDetails.getAwbNumber(), awbexecutionList);
		
		return awbexecutionform;
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
				basicBookingDetails.getFlightNumber(), null, null, null);
		basicBookingForm.setAwbNumber(basicBookingDetails.getAwbNumber());
		basicBookingForm.setDestination(basicBookingDetails.getDestination());
		basicBookingForm.setOrigin(basicBookingDetails.getOrigin());
		return basicBookingForm;
	}

	private static AWBExecutionForm getAwbExecutionDetailsForm(AWBExecutionDetails awbexecutiondetails) {

		AWBExecutionForm awbexecutionform = new AWBExecutionForm(awbexecutiondetails.getAwbNumber(),
				awbexecutiondetails.getUbrNumber(), awbexecutiondetails.getConsignmentDetails(),
				awbexecutiondetails.getShipperDetails(), awbexecutiondetails.getBasicBookingDetails());
		awbexecutionform.setAwbNumber(awbexecutiondetails.getAwbNumber());
		awbexecutionform.setUbrNumber(awbexecutiondetails.getUbrNumber());
		awbexecutionform.setConsignmentdetails(awbexecutiondetails.getConsignmentDetails());
		awbexecutionform.setShipperdetails(awbexecutiondetails.getShipperDetails());

		return awbexecutionform;
	}

	
}
