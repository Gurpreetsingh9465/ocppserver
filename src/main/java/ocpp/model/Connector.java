package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="connector")
public class Connector {
	   

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "connector_pk")
	private int connectorPk;
	
	@Column(name = "charge_box_id")
	private String chargeBoxId;
	
	@Column(name = "connector_id")
	private int connectorId;

	@ManyToMany
	@JoinColumn(name="charge_box_id")
	private ChargeBox charge_box_id;

	public int getConnectorPk() {
		return connectorPk;
	}

	public void setConnectorPk(int connectorPk) {
		this.connectorPk = connectorPk;
	}

	public String getChargeBoxId() {
		return chargeBoxId;
	}

	public void setChargeBoxId(String chargeBoxId) {
		this.chargeBoxId = chargeBoxId;
	}

	public int getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}

	public ChargeBox getCharge_box_id() {
		return charge_box_id;
	}

	public void setCharge_box_id(ChargeBox charge_box_id) {
		this.charge_box_id = charge_box_id;
	}
	@Override
	public String toString() {
		return "Connector [connectorPk=" + connectorPk + ", chargeBoxId=" + chargeBoxId + ", connectorId=" + connectorId
				+ "]";
	}

	public Connector() {}

	public Connector(int connectorPk, String chargeBoxId, int connectorId, ChargeBox charge_box_id) {
		super();
		this.connectorPk = connectorPk;
		this.chargeBoxId = chargeBoxId;
		this.connectorId = connectorId;
		this.charge_box_id = charge_box_id;
	}
	
	
}
