package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Type;

public class ChangeAvailability {
	//variables of req function...
	private static final Logger LOGGER = Logger.getLogger(ChangeAvailability.class.getName());
	Type.Availability type;   //can have the values available(when its charging) or unavilale(when its not charging)...and is requested by the central system...
	int connectorId;

	//variables of conf function....
	Status.Availability status; //can have values.... scheduled(when its unable to process the request because presently a charge transfer is taking place)
	             //accepted(when the current status is same as requested by the central system...)
	             //else it have to tell the central systen that changes have been implemented...with the present status of the charge point..

	int req(){
		//central system send the request to change the status to available or unavailable...value is in type variable..
		//along with the connector id...
	    conf();
	    return 0;
	}
	int conf(){
		try {
			/*if(compare the value of type with the current status){
				status = AvailabilityStatus.Accepted;
				return 0;
			}
			else if(currently charging any device){
				status = AvailabilityStatus.Scheduled;
				return 0;
			}
			else{
				status = type;
				return 0;  //if the transition is completred...
			}*/
			return 0;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error ",e);
			return 1;
		}
	}
	public Type.Availability getType() {
		return type;
	}
	public void setType(Type.Availability type) {
		this.type = type;
	}
	public int getConnectorId() {
		return connectorId;
	}
	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}
	public Status.Availability getStatus() {
		return status;
	}
	public void setStatus(Status.Availability status) {
		this.status = status;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
}