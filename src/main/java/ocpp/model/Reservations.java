package ocpp.model;

import java.util.Date;

import javax.persistence.Column;import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservations")

public class Reservations {
	//default Constructor
	public Reservations(){}
	//Parameterized Constructor
	public Reservations(int reservationId, String firstName, Date reservationDate, String startTime, String endTime) {
		super();
		this.reservationId = reservationId;
		this.firstName = firstName;
		this.reservationDate = reservationDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ReservationId")
	private int reservationId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "ReservationDate")
	private Date reservationDate;
	
	

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Column(name = "StartTime")
	private String startTime;
	
	@Column(name = "EndTime")
	private String endTime;

	@Override
	public String toString() {
		return "Reservations [reservationId=" + reservationId + ", firstName=" + firstName + ", reservationDate="
				+ reservationDate + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
}
