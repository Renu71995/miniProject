/*
 * package com.cargo.controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * import com.cargo.business.ExportManifestRequestProcessor; import
 * com.cargo.form.ExportManifestForm; import
 * com.cargo.services.ExportManifestService;
 * 
 *//**
	 * Export manifest controller
	 * 
	 * @author Rituraj
	 *
	 */
/*
 * @Controller public class ExportManifestController {
 * 
 *//** Bean Injection for export manifest service **/
/*
 * @Autowired private ExportManifestService exportManifestService;
 *//** Bean Injection for export manifest request processor **/
/*
 * @Autowired private ExportManifestRequestProcessor
 * exportManifestRequestProcessor;
 * 
 *//**
	 * Method to get all the booking details associated to a flight schedule
	 * 
	 * @param flightNumber
	 * @return export manifest form page
	 *//*
		 * @RequestMapping(value = "/exportmanifest/listshipments", method = {
		 * RequestMethod.GET, RequestMethod.POST }) public String
		 * listFlightDetails(@ModelAttribute final ExportManifestForm
		 * exportManifestForm, Model model) {
		 * 
		 * if (exportManifestForm.getFlightnumber() != null &&
		 * exportManifestService.existsByFlightNumber(exportManifestForm.getFlightnumber
		 * ())) { exportManifestRequestProcessor.requestProcessor(
		 * exportManifestService.getFlightByFlightNumber(exportManifestForm.
		 * getFlightnumber()), exportManifestForm); }
		 * model.addAttribute("exportmanifestform", exportManifestForm); return
		 * "exportmanifestscreen"; }
		 * 
		 * }
		 */