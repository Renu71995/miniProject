package com.cargo.repositories;

import com.cargo.entities.BasicBookingDetails;
import com.cargo.entities.ULDdetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingDetailsRepository extends JpaRepository<BasicBookingDetails, Integer>
{
//    @Query("select u  from BasicBookingDetails u where u.awbNumber=:awbNumber")
//    BasicBookingDetails findByAWB(@Param("awbNumber") int awbNumber);
}
