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
@Table(name="CancelReservation")

public class CancelReservation {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ReservationId")
	private int reservationId;

	@Override
	public String toString() {
		return "CancelReservation [reservationId=" + reservationId + ", status=" + status + "]";
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public Status.Configuration getStatus() {
		return status;
	}

	public void setStatus(Status.Configuration status) {
		this.status = status;
	}

	public CancelReservation(int reservationId, Configuration status) {
		super();
		this.reservationId = reservationId;
		this.status = status;
	}

	@Column(name = "Status")
	private Status.Configuration status;

}
