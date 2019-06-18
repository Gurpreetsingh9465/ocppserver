package ocpp.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HeartBeat")
public class HeartBeat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CurrentTime")
	private Date currentTime;

	/*parameterized constructor*/
	public HeartBeat(Date currentTime) {
		super();
		this.currentTime = currentTime;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public String toString() {
		return "HeartBeat [currentTime=" + currentTime + "]";
	}
	
	
}