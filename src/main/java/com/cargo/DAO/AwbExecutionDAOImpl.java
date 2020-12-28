//package com.cargo.DAO;
//
//import java.util.concurrent.ThreadLocalRandom;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cargo.entities.AWBExecutionDetails;
//import com.cargo.entities.BasicBookingDetails;
//import com.cargo.entities.BulkBooking;
//import com.cargo.entities.ConsignmentDetails;
//import com.cargo.entities.ShipperDetails;
//import com.cargo.entities.ULDdetails;
//import com.cargo.repositories.ConsignmentRepository;
//import com.cargo.repositories.ShipperRepository;
//
//@Service
//public class AwbExecutionDAOImpl implements AwbExecutionDAO{
//	
//	//@Autowired
//	//AWBExecutionRepository awbExecutionRepository;
//	@Autowired
//	ShipperRepository shipperRepository;
//	@Autowired
//	ConsignmentRepository consignmentRepository;
////	@Autowired
////	BasicBookingRepository basicBookingRepository;
//	
//	public void saveAwbDetails (AWBExecutionDetails awbExecutionDetails) {
//		
//		String msg ="";
//		
//		 try {
//	          shipperRepository.save(awbExecutionDetails.getShipperDetails());
//	          consignmentRepository.save(awbExecutionDetails.getConsignmentDetails());
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            msg="Error Caught:"+e.getMessage();
//	        }
//		
//	}
//
//}


package com.cargo.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.entities.AWBExecutionDetails;
import com.cargo.entities.BookingWrapper;
import com.cargo.repositories.ConsignmentRepository;
import com.cargo.repositories.ShipperRepository;

@Service
public class AwbExecutionDAOImpl implements AwbExecutionDAO{
	
	//@Autowired
	//AWBExecutionRepository awbExecutionRepository;
	@Autowired
	ShipperRepository shipperRepository;
	@Autowired
	ConsignmentRepository consignmentRepository;
	@Autowired
	BookingDetailsDAOImp bookingDetailsDAOImp;
	@Override
	public void saveAwbDetails(BookingWrapper bookingWrapper) {
		// TODO Auto-generated method stub
		String msg ="";
	
		 try {
			 bookingDetailsDAOImp.saveBookingDeatils(bookingWrapper);
			// bookingDetailsDAOImp.saveBookingDeatils(BookingWrapper.getBasicBookingDetails());
	          shipperRepository.save(bookingWrapper.getShipperDetails());
	          consignmentRepository.save(bookingWrapper.getConsignmentDetails());
	        } catch (Exception e) {
	            e.printStackTrace();
	            msg="Error Caught:"+e.getMessage();
	        }
	}
	
//	@Override
//	public void saveAwbDetails (AWBExecutionDetails awbExecutionDetails) {
//		
//		String msg ="";
//		
//		 try {
//			 bookingDetailsDAOImp.saveBookingDeatils(awbExecutionDetails.getBoookingWrapper());
//			// bookingDetailsDAOImp.saveBookingDeatils(BookingWrapper.getBasicBookingDetails());
//	          shipperRepository.save(awbExecutionDetails.getShipperDetails());
//	          consignmentRepository.save(awbExecutionDetails.getConsignmentDetails());
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            msg="Error Caught:"+e.getMessage();
//	        }
//		
//	}

}
