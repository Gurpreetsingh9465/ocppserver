package ocpp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="transaction_start")
public class TransactionStart {
	 
	    @Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "transaction_pk")
	private int transactionPk;
	
	@Column(name = "event_timestamp")
  	private Date eventTimestamp;
	
	@Column(name = "connector_pk")
  	private int connectorPk;
	
	@Column(name = "id_tag")
  	private String idTag;
	
	@Column(name = "start_timestamp")
  	private Date starTimestamp;
	
	@Column(name = "start_value")
  	private String start_value;
	
	@ManyToMany
	@JoinColumn(name="connector_pk")
	private Connector connector_pk;

	@ManyToMany
	@JoinColumn(name="id_tag")
	private OcppTag id_tag;

	public int getTransactionPk() {
		return transactionPk;
	}

	public void setTransactionPk(int transactionPk) {
		this.transactionPk = transactionPk;
	}

	public Date getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(Date eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public int getConnectorPk() {
		return connectorPk;
	}

	public void setConnectorPk(int connectorPk) {
		this.connectorPk = connectorPk;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public Date getStarTimestamp() {
		return starTimestamp;
	}

	public void setStarTimestamp(Date starTimestamp) {
		this.starTimestamp = starTimestamp;
	}

	public String getStart_value() {
		return start_value;
	}

	public void setStart_value(String start_value) {
		this.start_value = start_value;
	}

	public Connector getConnector_pk() {
		return connector_pk;
	}

	public void setConnector_pk(Connector connector_pk) {
		this.connector_pk = connector_pk;
	}

	public OcppTag getId_tag() {
		return id_tag;
	}

	public void setId_tag(OcppTag id_tag) {
		this.id_tag = id_tag;
	}

	public TransactionStart(int transactionPk, Date eventTimestamp, int connectorPk, String idTag, Date starTimestamp,
			String start_value, Connector connector_pk, OcppTag id_tag) {
		super();
		this.transactionPk = transactionPk;
		this.eventTimestamp = eventTimestamp;
		this.connectorPk = connectorPk;
		this.idTag = idTag;
		this.starTimestamp = starTimestamp;
		this.start_value = start_value;
		this.connector_pk = connector_pk;
		this.id_tag = id_tag;
	}

	@Override
	public String toString() {
		return "TransactionStart [transactionPk=" + transactionPk + ", eventTimestamp=" + eventTimestamp
				+ ", connectorPk=" + connectorPk + ", idTag=" + idTag + ", starTimestamp=" + starTimestamp
				+ ", start_value=" + start_value + ", connector_pk=" + connector_pk + "]";
	}
	
	
	
}
