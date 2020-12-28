package com.cargo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.DAO.AwbExecutionDAO;
import com.cargo.entities.BookingWrapper;

@Service
public class AWBExecutionServiceImpl implements AWBExecutionService {

	@Autowired
	private AwbExecutionDAO awbExecutionDao;

	@Override
	public void saveAwb(BookingWrapper bookingWrapper) {
		// TODO Auto-generated method stub
		awbExecutionDao.saveAwbDetails(bookingWrapper);
	}

}
