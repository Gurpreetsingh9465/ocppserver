package ocpp.baseclasses;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.ChargingSchedule;
import ocpp.essential.Status;
import ocpp.essential.Type;

public class GetCompositeSchedule {
    private static final Logger LOGGER = Logger.getLogger(GetCompositeSchedule.class.getName());
    /*req()*/
    int connectorId; //Required. The ID of the Connector for which the schedule is requested. When ConnectorId=0, the
                    //Charge Point will calculate the expected consumption for the grid connection.

    int duration; //Required. Time in seconds. Length of requested schedule

    Type.ChargingRateUnit chargingRateUnit; //Optional. Can be used to force a power or current profile

    /*conf()*/
    Status.GetCompositeSchedule status; //Required. Status of the request. The Charge Point will indicate if it
                                            //was able to process the request.

    //int connectorId

    Date scheduleStart; //Optional. Time. Periods contained in the charging profile are relative to this point in time.

    ChargingSchedule chargingSchedule; //Optional. Planned Composite Charging Schedule, the energy consumption
                                       //over time. Always relative to ScheduleStart.

    /*default constructor*/
    GetCompositeSchedule(){
        connectorId = 0;
        duration = 0;
        chargingRateUnit = Type.ChargingRateUnit.W;
        status = Status.GetCompositeSchedule.Accepted;
        chargingSchedule = new ChargingSchedule();
    }

    /*parameterized constructor*/
    int req(){
        try {
            conf();
            /*
            if( status == 0 )   //if the request is rejected due to error,display failure message
                LOGGER.log(Level.INFO ,"Failed to get schedule due to error");
            else if(status == 2)    //else wait
                LOGGER.log(Level.INFO,"Waiting");
            else    //show the schedule
                LOGGER.log(Level.INFO,"Calculated the schedule which is "+ chargingSchedule);
             */
            return 0;
        }
        catch (Exception e){
            LOGGER.log(Level.SEVERE,"Error ",e);
            return 1;
        }
    }

    int conf(){
        //if calculation isn't possible due to error like Unknown Connector ID then set status to rejected
        /*
        if(false)
            status = 0;
        else{
            status = 2; //set status to calculating(an optional status)
            //calculate the schecule using appropriate methods.
            chargingSchedule = ""; // contains the calculated schedule
            status = 1; //the calculation is complete
        }
         */
        return 0;
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

	public ChargingSchedule getChargingSchedule() {
		return chargingSchedule;
	}

	public void setChargingSchedule(ChargingSchedule chargingSchedule) {
		this.chargingSchedule = chargingSchedule;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
