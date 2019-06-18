package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Type;
import ocpp.essential.Type.ChargingProfilePurpose;

@Entity
@Table(name="ClearChargingProfile")
public class ClearChargingProfile {

	
	@Column(name = "Id")
	private int id;
	
	@Column(name = "ConnectorId")
	private int connectorId;

	@Column(name = "StackLevel")
	private int stackLevel;

	@Column(name = "ChargingProfilePurpose")
    private Type.ChargingProfilePurpose chargingProfilePurpose;

	@Column(name = "Status")
    private Status.ClearChargingProfile status;

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

	@Override
	public String toString() {
		return "ClearChargingProfile [id=" + id + ", connectorId=" + connectorId + ", stackLevel=" + stackLevel
				+ ", chargingProfilePurpose=" + chargingProfilePurpose + ", status=" + status + "]";
	}
	
	public ClearChargingProfile() {}
	public ClearChargingProfile(int id, int connectorId, int stackLevel, ChargingProfilePurpose chargingProfilePurpose,
			ocpp.essential.Status.ClearChargingProfile status) {
		super();
		this.id = id;
		this.connectorId = connectorId;
		this.stackLevel = stackLevel;
		this.chargingProfilePurpose = chargingProfilePurpose;
		this.status = status;
	}
	
}
