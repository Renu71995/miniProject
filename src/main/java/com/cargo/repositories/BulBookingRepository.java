package com.cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cargo.entities.BulkBooking;

public interface BulBookingRepository extends JpaRepository<BulkBooking, Integer> {

	@Query("select u  from BulkBooking u where u.awbNumber=:awbNumber")
	BulkBooking findByAWB(@Param("awbNumber") int awbNumber);

	public default BulkBooking setAWBValue(Integer awbNumber, BulkBooking bulkBooking) {
		bulkBooking.setAwbNumber(awbNumber);
		return bulkBooking;

	}

}
