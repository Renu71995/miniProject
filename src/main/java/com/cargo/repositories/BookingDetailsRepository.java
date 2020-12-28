package com.cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cargo.entities.BasicBookingDetails;

public interface BookingDetailsRepository extends JpaRepository<BasicBookingDetails, Integer> {
//    @Query("select u  from BasicBookingDetails u where u.awbNumber=:awbNumber")
//    BasicBookingDetails findByAWB(@Param("awbNumber") int awbNumber);
}
