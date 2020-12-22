package com.cargo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cargo.entities.ULDdetails;

import java.util.List;

@Repository
public interface ULDdetailsRepository extends JpaRepository<ULDdetails, Integer> {

    @Query("select u  from ULDdetails u where u.awbNumber=:awbNumber")
    ULDdetails findByAWB(@Param("awbNumber") int awbNumber);
    
    public default  ULDdetails setUldValues(Integer awbNumber,ULDdetails ulDdetails){
        ulDdetails.setAwbNumber(awbNumber);
        return ulDdetails;
		
	}

}
