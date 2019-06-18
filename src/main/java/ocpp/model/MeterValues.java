package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ocpp.essential.MeterValue;

@Entity
@Table(name="MeterValues")
public class MeterValues{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ConnectorId")
	private int connectorId;
	@Column(name="TransactionId")
	private int transactionId;
	@ManyToMany
	@JoinColumn(name="Timestamp")
	private MeterValue timestamp;

	public MeterValues(int connectorId, int transactionId, MeterValue timestamp) {
		super();
		this.connectorId = connectorId;
		this.transactionId = transactionId;
		this.timestamp = timestamp;
	}
	
	public int getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public MeterValue getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(MeterValue timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "MeterValues [connectorId=" + connectorId + ", transactionId=" + transactionId + ", timestamp="
				+ timestamp + "]";
	}
}