package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Type;
import ocpp.essential.Type.ChargingProfilePurpose;

public class ClearChargingProfile {
	private static final Logger LOGGER = Logger.getLogger(ClearChargingProfile.class.getName());
	//variables for the req function...
	int id;
	int connectorId;
	int stackLevel;

	Type.ChargingProfilePurpose chargingProfilePurpose;

	//variables for the conf function...
	Status.ClearChargingProfile status;

	/*default constructor*/
	public ClearChargingProfile() {
		super();
	}
	/*parameterized constructor*/
	public ClearChargingProfile(int id, int connectorId, int stackLevel, ChargingProfilePurpose chargingProfilePurpose,
								ocpp.essential.Status.ClearChargingProfile status) {
		this.id = id;
		this.connectorId = connectorId;
		this.stackLevel = stackLevel;
		this.chargingProfilePurpose = chargingProfilePurpose;
		this.status = status;
	}

	int req(){
		//central server sends the request to clear some or all of the charging profiles...
		conf();
		return 0;
	}

	int conf(){
		try {
			//if(/*request was processed*/)
			status = Status.ClearChargingProfile.Accepted;
			//else Rejected
			return 0;
		}
		catch (Exception e) {
			LOGGER.log(Level.SEVERE,"Error",e);
			return 1;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}

	public int getStackLevel() {
		return stackLevel;
	}

	public void setStackLevel(int stackLevel) {
		this.stackLevel = stackLevel;
	}

	public Type.ChargingProfilePurpose getChargingProfilePurpose() {
		return chargingProfilePurpose;
	}

	public void setChargingProfilePurpose(Type.ChargingProfilePurpose chargingProfilePurpose) {
		this.chargingProfilePurpose = chargingProfilePurpose;
	}

	public Status.ClearChargingProfile getStatus() {
		return status;
	}

	public void setStatus(Status.ClearChargingProfile status) {
		this.status = status;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
