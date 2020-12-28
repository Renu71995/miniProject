package com.cargo.services;

import org.springframework.stereotype.Service;

import com.cargo.entities.BookingWrapper;

@Service
public interface AWBExecutionService {

	public void saveAwb(BookingWrapper bookingWrapper);

}
