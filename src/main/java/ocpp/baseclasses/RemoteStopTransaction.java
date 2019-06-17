package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;

public class RemoteStopTransaction {
	private static final Logger LOGGER = Logger.getLogger(RemoteStopTransaction.class.getName());
	//variables for conf function...
	Status.RemoteStartStop status;
	//variable for req function...
	int transactionId;

	int req() {
		//it will send the transaction id to the central system...
		boolean stopped = conf();
		if(stopped)
			return 0;
		else
			return 1;
	}

	boolean conf() {
		try {
			/*
			if(the request is accepted){
				status = RemoteStartStopStatus.Accepted;
				return 0;
			}
			else{
				status = RemoteStartStopStatus.Rejected;
				return 0;
			}
			*/
			return true;
		}
		catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error", e);
			return false;
		}
	}
}