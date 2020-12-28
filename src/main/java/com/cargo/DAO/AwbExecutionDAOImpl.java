package com.cargo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.entities.BookingWrapper;
import com.cargo.repositories.ConsignmentRepository;
import com.cargo.repositories.ShipperRepository;

@Service
public class AwbExecutionDAOImpl implements AwbExecutionDAO {
	@Autowired
	ShipperRepository shipperRepository;
	@Autowired
	ConsignmentRepository consignmentRepository;
	@Autowired
	BookingDetailsDAOImp bookingDetailsDAOImp;

	@Override
	public void saveAwbDetails(BookingWrapper bookingWrapper) {

		String msg = "";

		try {
			bookingDetailsDAOImp.saveBookingDeatils(bookingWrapper);
			shipperRepository.save(bookingWrapper.getShipperDetails());
			consignmentRepository.save(bookingWrapper.getConsignmentDetails());
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Error Caught:" + e.getMessage();
		}
	}

}
