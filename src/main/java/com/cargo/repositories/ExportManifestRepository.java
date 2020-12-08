package com.cargo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cargo.entities.FlightDetails;

@Repository
public interface ExportManifestRepository extends CrudRepository<FlightDetails, Integer> {
	Optional<FlightDetails> findByFlightNumber(String flightNumber);

	boolean existsByFlightNumber(String flightNumber);
}
