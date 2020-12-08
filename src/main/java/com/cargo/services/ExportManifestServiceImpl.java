package com.cargo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cargo.entities.FlightDetails;
import com.cargo.repositories.ExportManifestRepository;

/**
 * Export manifest service implementation class
 * 
 * @author Rituraj
 *
 */
@Service
@Transactional
public class ExportManifestServiceImpl implements ExportManifestService {

	/** Bean injection for ExportManifest Repository **/
	@Autowired
	private ExportManifestRepository exportManifestRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cargo.services.ExportManifestService#getFlightByFlightNumber(java.lang.
	 * String)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true, rollbackFor = Exception.class)
	public FlightDetails getFlightByFlightNumber(String flightNumber) {
		Optional<FlightDetails> flightDetail = exportManifestRepository.findByFlightNumber(flightNumber);
		if (flightDetail.isPresent()) {
			return flightDetail.get();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cargo.services.ExportManifestService#existsByFlightNumber(java.lang.
	 * String)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true, rollbackFor = Exception.class)
	public boolean existsByFlightNumber(String flightNumber) {
		return exportManifestRepository.existsByFlightNumber(flightNumber);
	}

}
