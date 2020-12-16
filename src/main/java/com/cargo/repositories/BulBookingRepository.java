package com.cargo.repositories;

import com.cargo.entities.BulkBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BulBookingRepository extends JpaRepository<BulkBooking,Integer> {

    @Query("select u  from BulkBooking u where u.awbNumber=:awbNumber")
    List<BulkBooking> findByAWB(@Param("awbNumber")int awbNumber);
}
