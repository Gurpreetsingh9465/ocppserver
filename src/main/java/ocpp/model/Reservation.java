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
@Table(name="reservation")
public class Reservation {

	    @Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		@Column(name = "reservation_pk")
	  	private int reservationPk;

		@Column(name = "connector_pk")
		private int connectorPk;
		
		
		@Column(name = "transaction_pk")
		private int transactionPk;

		@Column(name = "id_tag")
		private String idTag;

		@Column(name = "start_datetime")
		private Date startDateTime;

		@Column(name = "expiry")
		private Date expiery;

		@Column(name = "status")
		private String status;
		
		@ManyToMany
		@JoinColumn(name="connector_pk")
		private Connector connector_pk;
		
		@ManyToMany
		@JoinColumn(name="id_tag")
		private OcppTag id_tag;

		public int getReservationPk() {
			return reservationPk;
		}

		public void setReservationPk(int reservationPk) {
			this.reservationPk = reservationPk;
		}

		public int getConnectorPk() {
			return connectorPk;
		}

		public void setConnectorPk(int connectorPk) {
			this.connectorPk = connectorPk;
		}

		public int getTransactionPk() {
			return transactionPk;
		}

		public void setTransactionPk(int transactionPk) {
			this.transactionPk = transactionPk;
		}

		public String getIdTag() {
			return idTag;
		}

		public void setIdTag(String idTag) {
			this.idTag = idTag;
		}

		public Date getStartDateTime() {
			return startDateTime;
		}

		public void setStartDateTime(Date startDateTime) {
			this.startDateTime = startDateTime;
		}

		public Date getExpiery() {
			return expiery;
		}

		public void setExpiery(Date expiery) {
			this.expiery = expiery;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public Reservation(int reservationPk, int connectorPk, int transactionPk, String idTag, Date startDateTime,
				Date expiery, String status, Connector connector_pk, OcppTag id_tag) {
			super();
			this.reservationPk = reservationPk;
			this.connectorPk = connectorPk;
			this.transactionPk = transactionPk;
			this.idTag = idTag;
			this.startDateTime = startDateTime;
			this.expiery = expiery;
			this.status = status;
			this.connector_pk = connector_pk;
			this.id_tag = id_tag;
		}

		@Override
		public String toString() {
			return "Reservation [reservationPk=" + reservationPk + ", connectorPk=" + connectorPk + ", transactionPk="
					+ transactionPk + ", idTag=" + idTag + ", startDateTime=" + startDateTime + ", expiery=" + expiery
					+ ", status=" + status + ", connector_pk=" + connector_pk + "]";
		}
		
	}		