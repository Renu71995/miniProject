package com.cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cargo.entities.FlightDetails;

public interface FlightDetailsRepository extends JpaRepository<FlightDetails, Integer> {
	@Query("select u  from FlightDetails u where u.origin=:origin and u.destination=:destination and shipmentDate=:shipmentDate")
	FlightDetails findflight(@Param("origin") String origin, @Param("destination")String destination, @Param("shipmentDate") String shipmentDate);
}
