package ocpp.baseclasses;


import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Status.ChargingProfile;
import ocpp.essential.Status.RemoteStartStop;

public class RemoteStartTransaction {
	private static final Logger LOGGER = Logger.getLogger(RemoteStartTransaction.class.getName());
	

	public RemoteStartTransaction(int connectorId, String idTag, ChargingProfile chargingProfile,
			boolean authorizationRemoteTxRequest, RemoteStartStop status) {
		super();
		this.connectorId = connectorId;
		this.idTag = idTag;
		this.chargingProfile = chargingProfile;
		AuthorizationRemoteTxRequest = authorizationRemoteTxRequest;
		this.status = status;
	}
	int req() {
		//central system requests the charge point to start a transaction by giving an idTag...
		conf();
		return 0;
	}

	int conf(){
		try {
			/*if(AuthorizationRemoteTxRequest){
				//charging point will start an authorization using local cache and local authorization list..
				//once authorization is complete it starts the charging process..
			}
			else{
				Immediately try to start a transaction for the id tag...
				then it will send a start transition request to the central system...
				central system will check the authorization status of the id tag
				when processing the start transition request
			}
			*/
			return 0;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error ",e);
			return 1;
		}
	}

	int connectorId;
	String idTag; //string of length 20...
	Status.ChargingProfile chargingProfile;
	boolean AuthorizationRemoteTxRequest;

	//variables of conf function...
	Status.RemoteStartStop status;

	public int getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public Status.ChargingProfile getChargingProfile() {
		return chargingProfile;
	}

	public void setChargingProfile(Status.ChargingProfile chargingProfile) {
		this.chargingProfile = chargingProfile;
	}

	public boolean isAuthorizationRemoteTxRequest() {
		return AuthorizationRemoteTxRequest;
	}

	public void setAuthorizationRemoteTxRequest(boolean authorizationRemoteTxRequest) {
		AuthorizationRemoteTxRequest = authorizationRemoteTxRequest;
	}

	public Status.RemoteStartStop getStatus() {
		return status;
	}

	public void setStatus(Status.RemoteStartStop status) {
		this.status = status;
	}

}