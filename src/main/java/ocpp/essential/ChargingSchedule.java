package ocpp.essential;

import java.util.Date;

public class ChargingSchedule {
	int duration; /*Optional. Duration of the charging schedule in seconds. If the duration is left empty, the last
					period will continue indefinitely or until end of the transaction in case startSchedule is absent.*/
	Date startSchedule; /*Optional. Starting point of an absolute schedule. If absent the schedule will be relative to
        			start of charging.*/
	Type.ChargingRateUnit chargingRateUnit; //Required. The unit of measure Limit is expressed in.

	ChargingSchedulePeriod chargingSchedulePeriod; /*Required. List of ChargingSchedulePeriod elements defining maximum
                                  power or current usage over time.*/
	float minChargingRate; /*Optional. Minimum charging rate supported by the electric vehicle.The unit of measure is
            				defined by the chargingRateUnit. This parameter is intended to be used by a local smart
            				charging algorithm to optimize the power allocation for in the case a charging process is
            				inefficient at lower charging rates. Accepts at most one digit fraction (e.g. 8.1)*/


	/*default constructor*/
	public ChargingSchedule(){
		duration = 0;
		startSchedule = new Date();
		chargingRateUnit = Type.ChargingRateUnit.W;
		chargingSchedulePeriod = new ChargingSchedulePeriod();
	}
	/*parameterized constructor*/
	public ChargingSchedule(int duration, Date startSchedule, Type.ChargingRateUnit chargingRateUnit,
    ChargingSchedulePeriod chargingSchedulePeriod, float minChargingRate) {
			this.duration = duration;
			this.startSchedule = startSchedule;
			this.chargingRateUnit = chargingRateUnit;
			this.chargingSchedulePeriod = chargingSchedulePeriod;
			this.minChargingRate = minChargingRate;
	}
	/*getters and setters*/

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
}
