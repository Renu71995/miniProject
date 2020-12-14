package com.cargo.services;

import com.cargo.entities.AWBExecutionDetails;

public interface AWBExecutionService {
	 
	
	 AWBExecutionDetails getAWBexecutionDetails(long awbNumber);
	 
	 void executeAWBDetails();
	 
	 void saveAWBDetails();
	 

}
