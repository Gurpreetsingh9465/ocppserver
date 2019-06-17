package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Status.Configuration;

public class CancelReservation {
	private static final Logger LOGGER = Logger.getLogger(CancelReservation.class.getName());
	//variables of cancelRequest function...
	int reservationId;
	
	//variables of cancelConfirm function...
	Status.Configuration status;     //status can have values accepted and rejectd...
	
	/*default constructor*/
	public CancelReservation(){
		super();
	}
	/*parameterized constructor*/
	public CancelReservation(int reservationId, Configuration status) {
		this.reservationId = reservationId;
		this.status = status;
	}
	
	int req(){
		//central system send the cancel resevation request to the charging point...
		// along with the reservationId...of the request to be cancelled...
		conf();
		return 0;
	}
	int conf() {
		try {
			/*if(requested reservationId matched a particular reservation at the charging point){
				status = ConfigurationStatus.Accepted;
				return 0;
			}
			else{
				status = ConfigurationStatus.Rejected;
				return 0;
			}
			*/
			return 0;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error",e);
			return 1;
		}
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Status.Configuration getStatus() {
		return status;
	}
	public void setStatus(Status.Configuration status) {
		this.status = status;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
}
