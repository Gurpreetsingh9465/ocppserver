package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="connector_meter_value")
public class ConnectorMeterValue {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		
	@Column(name="parent_id_tag")
	private int parent_id_tag;
	
	@Column(name="value_timestamp")
	private int value_timestamp; 
	
	@Column(name="value")
	private String value; 
	
	@Column(name="reading_context")
	private String reading_context; 
	
	@Column(name="format")
	private String format; 
	
	@Column(name="measurand")
	private String measurand; 
	
	@Column(name="location")
	private String location;
	
	@Column(name="unit")
	private String unit;

	@Column(name="phase")
	private String phase;
	
	@ManyToMany
	@JoinColumn(name="connector_pk")
	private Connector connector_pk;
	
	@ManyToMany
	@JoinColumn(name="transaction_pk")
	private Transaction_start transaction_pk;

	public int getParent_id_tag() {
		return parent_id_tag;
	}

	public void setParent_id_tag(int parent_id_tag) {
		this.parent_id_tag = parent_id_tag;
	}

	public int getValue_timestamp() {
		return value_timestamp;
	}

	public void setValue_timestamp(int value_timestamp) {
		this.value_timestamp = value_timestamp;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getReading_context() {
		return reading_context;
	}

	public void setReading_context(String reading_context) {
		this.reading_context = reading_context;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getMeasurand() {
		return measurand;
	}

	public void setMeasurand(String measurand) {
		this.measurand = measurand;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Connector getConnector_pk() {
		return connector_pk;
	}

	public void setConnector_pk(Connector connector_pk) {
		this.connector_pk = connector_pk;
	}

	public Transaction_start getTransaction_pk() {
		return transaction_pk;
	}

	public void setTransaction_pk(Transaction_start transaction_pk) {
		this.transaction_pk = transaction_pk;
	}

	@Override
	public String toString() {
		return "ConnectorMeterValue [parent_id_tag=" + parent_id_tag + ", value_timestamp=" + value_timestamp
				+ ", value=" + value + ", reading_context=" + reading_context + ", format=" + format + ", measurand="
				+ measurand + ", location=" + location + ", unit=" + unit + ", phase=" + phase + "]";
	}

	public ConnectorMeterValue(int parent_id_tag, int value_timestamp, String value, String reading_context,
			String format, String measurand, String location, String unit, String phase, Connector connector_pk,
			Transaction_start transaction_pk) {
		super();
		this.parent_id_tag = parent_id_tag;
		this.value_timestamp = value_timestamp;
		this.value = value;
		this.reading_context = reading_context;
		this.format = format;
		this.measurand = measurand;
		this.location = location;
		this.unit = unit;
		this.phase = phase;
		this.connector_pk = connector_pk;
		this.transaction_pk = transaction_pk;
	}
	
	
}
