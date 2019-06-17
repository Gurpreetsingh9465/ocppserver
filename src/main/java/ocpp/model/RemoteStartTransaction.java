package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Status.ChargingProfile;
import ocpp.essential.Status.RemoteStartStop;

@Entity
@Table(name="RemoteStartTransaction")
public class RemoteStartTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ConnectorId")
	private int connectorId;
	@Column(name="IdTag")
	private String idTag; //string of length 20...
	@Column(name="ChargingProfile")
	private Status.ChargingProfile chargingProfile;
	@Column(name="AuthorizationRemoteTxRequest") 
	private boolean authorizationRemoteTxRequest;
	@Column(name="Status") 
	private	Status.RemoteStartStop status;

	public RemoteStartTransaction(int connectorId, String idTag, ChargingProfile chargingProfile,
			boolean authorizationRemoteTxRequest, RemoteStartStop status) {
		super();
		this.connectorId = connectorId;
		this.idTag = idTag;
		this.chargingProfile = chargingProfile;
		this.authorizationRemoteTxRequest = authorizationRemoteTxRequest;
		this.status = status;
	}
	
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
		return authorizationRemoteTxRequest;
	}

	public void setAuthorizationRemoteTxRequest(boolean authorizationRemoteTxRequest) {
		this.authorizationRemoteTxRequest = authorizationRemoteTxRequest;
	}

	public Status.RemoteStartStop getStatus() {
		return status;
	}

	public void setStatus(Status.RemoteStartStop status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RemoteStartTransaction [connectorId=" + connectorId + ", idTag=" + idTag + ", chargingProfile="
				+ chargingProfile + ", authorizationRemoteTxRequest=" + authorizationRemoteTxRequest + ", status="
				+ status + "]";
	}

}