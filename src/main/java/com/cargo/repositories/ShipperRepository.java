package com.cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cargo.entities.ShipperDetails;

public interface ShipperRepository extends JpaRepository<ShipperDetails, Integer> {

}
