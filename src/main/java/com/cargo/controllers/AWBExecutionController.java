package com.cargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cargo.business.AWBExecutionRequestProcessor;
import com.cargo.form.AWBExecutionForm;
import com.cargo.form.ExportManifestForm;
import com.cargo.services.AWBExecutionService;

@Controller
public class AWBExecutionController {

	/** Bean Injection for awb execution service **/
	@Autowired
	private AWBExecutionService awbexecutionService;

	@Autowired
	private AWBExecutionRequestProcessor awbexecutionprocessor;

	/**
	 * Method to get all the booking details associated to a flight schedule
	 * 
	 * @param flightNumber
	 * @return awb execution form page
	 */
	@RequestMapping(value = "/awbexecution/listawbdata", method = { RequestMethod.GET, RequestMethod.POST })
	public String showAWBookingDetails(@ModelAttribute final AWBExecutionForm awbExecutionForm, Model model) {

		if (awbExecutionForm.getFlightnumber() != null) {
			/*
			 * awbexecutionprocessor.requestProcessor(
			 * awbexecutionService.getAWBexecutionDetails(awbExecutionForm.
			 * getAwbNumber()), awbExecutionForm);
			 */
		}
		model.addAttribute("awbexecutionscreen", awbExecutionForm);
		return "awbexecutionscreen";
	}

	@RequestMapping(value = "/awbexecution/listawbdata", method = { RequestMethod.GET, RequestMethod.POST })
	public String executeAWBBooking(@ModelAttribute final AWBExecutionForm awbExecutionForm, Model model) {

		if (awbExecutionForm.getFlightnumber() != null) {
			/*
			 * awbexecutionprocessor.requestProcessor(
			 * awbexecutionService.getAWBexecutionDetails(awbExecutionForm.
			 * getAwbNumber()), awbExecutionForm);
			 */
		}
		model.addAttribute("awbexecutionbooking", awbExecutionForm);
		return "awbexecutionbooking";
	}
	
	@RequestMapping(value = "/awbexecution/listawbdata", method = { RequestMethod.GET, RequestMethod.POST })
	public String saveAWBDetails(@ModelAttribute final AWBExecutionForm awbExecutionForm, Model model) {

		if (awbExecutionForm.getFlightnumber() != null) {
			/*
			 * awbexecutionprocessor.requestProcessor(
			 * awbexecutionService.getAWBexecutionDetails(awbExecutionForm.
			 * getAwbNumber()), awbExecutionForm);
			 */
		}
		model.addAttribute("saveawbexecutionscreen", awbExecutionForm);
		return "saveawbexecutionscreen";
	}
}
