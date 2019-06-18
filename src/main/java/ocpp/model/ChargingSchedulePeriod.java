package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChargingSchedulePeriod")
public class ChargingSchedulePeriod {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StartPeriod")
	private int startPeriod; 
	@Column(name="Limit")
	private float limit; 
	@Column(name="NumberOfPhases")
	private int numberPhases;
	
	public ChargingSchedulePeriod(int startPeriod, float limit, int numberPhases) {
		super();
		this.startPeriod = startPeriod;
		this.limit = limit;
		this.numberPhases = numberPhases;
	}
	
	@Override
	public String toString() {
		return "ChargingSchedulePeriod [startPeriod=" + startPeriod + ", limit=" + limit + ", numberPhases="
				+ numberPhases + "]";
	}
	
	public int getStartPeriod() {
		return startPeriod;
	}
	public void setStartPeriod(int startPeriod) {
		this.startPeriod = startPeriod;
	}
	public float getLimit() {
		return limit;
	}
	public void setLimit(float limit) {
		this.limit = limit;
	}
	public int getNumberPhases() {
		return numberPhases;
	}
	public void setNumberPhases(int numberPhases) {
		this.numberPhases = numberPhases;
	} 
}