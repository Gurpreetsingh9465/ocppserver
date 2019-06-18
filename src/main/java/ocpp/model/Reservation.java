package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;

@Entity
@Table(name="Reservation")
public class Reservation{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ConnectorId")
	private int connectorID; //Required. This contains the id of the connector to be reserved. A value of 0 means that the
                    //reservation is not for a specific connector.
	
	@Column(name="ExpiryDate")
	private Date expiryDate; //Required. This contains the date and time when the reservation ends.
 
	@Column(name="IdTag")
	private String idTag; //Required. The identifier for which the Charge Point has to reserve a connector. Length<20

	@Column(name="ParentIdTag")
	private String parentIdTag; //Optional. The parent idTag. Length<20
	
	@Column(name="ReservationId")
	private int reservationId; //Required. Unique id for this reservation.

	@Column(name="Status")
    private Status.Reservation status; //Required. This indicates the success or failure of the reservation.


    public int getConnectorID() {
		return connectorID;
	}

	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public String getParentIdTag() {
		return parentIdTag;
	}

	public void setParentIdTag(String parentIdTag) {
		this.parentIdTag = parentIdTag;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public Status.Reservation getStatus() {
		return status;
	}

	public void setStatus(Status.Reservation status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reservation [connectorID=" + connectorID + ", expiryDate=" + expiryDate + ", idTag=" + idTag
				+ ", parentIdTag=" + parentIdTag + ", reservationId=" + reservationId + ", status=" + status + "]";
	}

}
