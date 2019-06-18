package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Status.Configuration;

@Entity
@Table(name="ChangeConfig")
public class ChangeConfig {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Key")
	private String key;
	
	@Column(name = "Value")
	private String value;

	@Column(name = "Status")
	private Status.Configuration status;

	public ChangeConfig() {}
	@Override
	public String toString() {
		return "ChangeConfig [key=" + key + ", value=" + value + ", status=" + status + "]";
	}
	public ChangeConfig(String key, String value, Configuration status) {
		super();
		this.key = key;
		this.value = value;
		this.status = status;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Status.Configuration getStatus() {
		return status;
	}

	public void setStatus(Status.Configuration status) {
		this.status = status;
	}
}
