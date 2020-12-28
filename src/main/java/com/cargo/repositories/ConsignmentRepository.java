package com.cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cargo.entities.ConsignmentDetails;

public interface ConsignmentRepository extends JpaRepository<ConsignmentDetails, Integer> {

}