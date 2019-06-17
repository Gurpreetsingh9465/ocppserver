package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.ChargingSchedulePeriod;
import ocpp.essential.Type;
import ocpp.essential.Type.ChargingRateUnit;

@Entity
@Table(name="ChargingSchedule")
public class ChargingSchedule {
	
	public ChargingSchedule(String chargingScheduleId, int duration, Date startSchedule,
			ChargingRateUnit chargingRateUnit, ChargingSchedulePeriod chargingSchedulePeriod, float minChargingRate) {
		super();
		this.chargingScheduleId = chargingScheduleId;
		this.duration = duration;
		this.startSchedule = startSchedule;
		this.chargingRateUnit = chargingRateUnit;
		this.chargingSchedulePeriod = chargingSchedulePeriod;
		this.minChargingRate = minChargingRate;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ChargingScheduleId")
	private String chargingScheduleId;
	@Column(name="Duration")
	private int duration;
	@Column(name="StartSchedule")
	private Date startSchedule;
	@Column(name="ChargingRateUnit")
	private Type.ChargingRateUnit chargingRateUnit;
	@Column(name="ChargingSchedulePeriod")
	private ChargingSchedulePeriod chargingSchedulePeriod; 
	@Column(name="MinChargingRate")
	private float minChargingRate;

	public String getChargingScheduleId() {
		return chargingScheduleId;
	}
	public void setChargingScheduleId(String chargingScheduleId) {
		this.chargingScheduleId = chargingScheduleId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Date getStartSchedule() {
		return startSchedule;
	}
	public void setStartSchedule(Date startSchedule) {
		this.startSchedule = startSchedule;
	}
	public Type.ChargingRateUnit getChargingRateUnit() {
		return chargingRateUnit;
	}
	public void setChargingRateUnit(Type.ChargingRateUnit chargingRateUnit) {
		this.chargingRateUnit = chargingRateUnit;
	}
	public ChargingSchedulePeriod getChargingSchedulePeriod() {
		return chargingSchedulePeriod;
	}
	public void setChargingSchedulePeriod(ChargingSchedulePeriod chargingSchedulePeriod) {
		this.chargingSchedulePeriod = chargingSchedulePeriod;
	}
	public float getMinChargingRate() {
		return minChargingRate;
	}
	public void setMinChargingRate(float minChargingRate) {
		this.minChargingRate = minChargingRate;
	}
	@Override
	public String toString() {
		return "ChargingSchedule [chargingScheduleId=" + chargingScheduleId + ", duration=" + duration
				+ ", startSchedule=" + startSchedule + ", chargingRateUnit=" + chargingRateUnit
				+ ", chargingSchedulePeriod=" + chargingSchedulePeriod + ", minChargingRate=" + minChargingRate + "]";
	}
}