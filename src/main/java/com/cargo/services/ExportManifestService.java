package com.cargo.services;

import com.cargo.entities.FlightDetails;

/**
 * Export manifest service
 * 
 * @author Rituraj
 *
 */
public interface ExportManifestService {

	/**
	 * Method to get Flight details by Flight number
	 * 
	 * @param flightNumber
	 * @return
	 */
	FlightDetails getFlightByFlightNumber(String flightNumber);

	/**
	 * Method to check whether a flight number exists or not
	 * 
	 * @param flightNumber
	 * @return boolean
	 */
	boolean existsByFlightNumber(String flightNumber);
}
