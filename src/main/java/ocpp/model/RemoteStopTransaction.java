package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Status.RemoteStartStop;

@Entity
@Table(name="RemoteStopTransaction")
public class RemoteStopTransaction {
	

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Status")
	private Status.RemoteStartStop status;
	@Column(name="TransactionId")
	private int transactionId;
	
	public RemoteStopTransaction(RemoteStartStop status, int transactionId) {
		super();
		this.status = status;
		this.transactionId = transactionId;
	}

	public Status.RemoteStartStop getStatus() {
		return status;
	}

	public void setStatus(Status.RemoteStartStop status) {
		this.status = status;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	@Override
	public String toString() {
		return "StopTransaction [status=" + status + ", transactionId=" + transactionId + "]";
	}

}