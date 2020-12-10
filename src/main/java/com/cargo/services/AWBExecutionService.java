package com.cargo.services;

import com.cargo.entities.AWBExecutionDetails;

public interface AWBExecutionService {
	 
	
	 AWBExecutionDetails getAWBexecutionDetails(int awbNumber);
	 
	 void executeAWBDetails();
	 
	 void saveAWBDetails();
	 

}
