package com.cargo.repositories;

import com.cargo.entities.BasicBookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailsRepository extends JpaRepository<BasicBookingDetails, Integer>
{

}
