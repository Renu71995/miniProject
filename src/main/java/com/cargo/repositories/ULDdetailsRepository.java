package com.cargo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cargo.entities.ULDdetails;
@Repository
public interface ULDdetailsRepository extends CrudRepository<ULDdetails, Integer>{
	
}
