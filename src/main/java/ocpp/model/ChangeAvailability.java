package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Type;
import ocpp.essential.Type.Availability;

@Entity
@Table(name="ChangeAvailability")
public class ChangeAvailability {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Type")
	private Type.Availability type;

	@Override
	public String toString() {
		return "ChangeAvailability [type=" + type + ", connectorId=" + connectorId + ", status=" + status + "]";
	}


	public ChangeAvailability(Availability type, int connectorId, ocpp.essential.Status.Availability status) {
		super();
		this.type = type;
		this.connectorId = connectorId;
		this.status = status;
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

	@Column(name = "ConnectorId")
	private int connectorId;
	
	@Column(name = "Status")
	private Status.Availability status;
	

}
