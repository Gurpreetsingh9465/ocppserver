package ocpp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ocpp.essential.Status;


@Entity
@Table(name="ClearCache")
public class ClearCache {
	
	@Override
	public String toString() {
		return "ClearCache [status=" + status + "]";
	}
	public ClearCache() {}

	public ClearCache(ocpp.essential.Status.ClearCache status) {
		super();
		this.status = status;
	}

	public Status.ClearCache getStatus() {
		return status;
	}

	public void setStatus(Status.ClearCache status) {
		this.status = status;
	}

	@Column(name = "Status")
	private Status.ClearCache status;
}
