package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import ocpp.essential.ChargingSchedule;
import ocpp.essential.Status;
import ocpp.essential.Status.GetCompositeSchedule;
import ocpp.essential.Type;
import ocpp.essential.Type.ChargingRateUnit;

@Entity
@Table(name="CompositeSchedule")
public class CompositeSchedule {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ConnectorId")
	private int connectorId; //Required. The ID of the Connector for which the schedule is requested. When ConnectorId=0, the
                    //Charge Point will calculate the expected consumption for the grid connection.

	@Column(name="Duration")
	private int duration; //Required. Time in seconds. Length of requested schedule

	@Column(name="ChargingRateUnit")
	private Type.ChargingRateUnit chargingRateUnit; //Optional. Can be used to force a power or current profile

	@Column(name="Status")
	private Status.GetCompositeSchedule status; //Required. Status of the request. The Charge Point will indicate if it
                                            //was able to process the request.

	@Column(name="ScheduleStart")
	private Date scheduleStart; //Optional. Time. Periods contained in the charging profile are relative to this point in time.

	@ManyToMany
	@JoinColumn(name="ChargingScheduleId")
	private ChargingSchedule chargingScheduleId;
	
    
	public CompositeSchedule(int connectorId, int duration, ChargingRateUnit chargingRateUnit,
			GetCompositeSchedule status, Date scheduleStart, ChargingSchedule chargingScheduleId) {
		super();
		this.connectorId = connectorId;
		this.duration = duration;
		this.chargingRateUnit = chargingRateUnit;
		this.status = status;
		this.scheduleStart = scheduleStart;
		this.chargingScheduleId = chargingScheduleId;
	}

	public int getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Type.ChargingRateUnit getChargingRateUnit() {
		return chargingRateUnit;
	}

	public void setChargingRateUnit(Type.ChargingRateUnit chargingRateUnit) {
		this.chargingRateUnit = chargingRateUnit;
	}

	public Status.GetCompositeSchedule getStatus() {
		return status;
	}

	public void setStatus(Status.GetCompositeSchedule status) {
		this.status = status;
	}

	public Date getScheduleStart() {
		return scheduleStart;
	}

	public void setScheduleStart(Date scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	@Override
	public String toString() {
		return "CompositeSchedule [connectorId=" + connectorId + ", duration=" + duration + ", chargingRateUnit="
				+ chargingRateUnit + ", status=" + status + ", scheduleStart=" + scheduleStart + ", chargingScheduleId="
				+ chargingScheduleId + "]";
	}

	public ChargingSchedule getChargingScheduleId() {
		return chargingScheduleId;
	}

	public void setChargingScheduleId(ChargingSchedule chargingScheduleId) {
		this.chargingScheduleId = chargingScheduleId;
	}	
}