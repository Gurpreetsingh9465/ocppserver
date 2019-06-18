package ocpp.baseclasses;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Status.Registration;

public class BootNotification{
	
	private static final Logger LOGGER = Logger.getLogger(BootNotification.class.getName());
	/*req() variables*/
	String chargeBoxSerialNumber; /*Optional. This contains a value(length<25) that identifies serial number of the
										charge box inside the charge point. Deprecated,will be removed in future version.*/
    String chargePointModel; //Required. This contains a value(length<20) that identifies the model of the charge point
	String chargePointSerialNumber; //Optional. This contains a value(length<25) that identifies the serial number
										//of charge point
	String chargePointVendor; //Required. This contains the value(length<20) that identifies the vendor of the charge point.
	String firmwareVersion; //Optional. This contains the firmware version(length<50) of the charge point.
	String iccid; //Optional. This contains the ICCID(length<20) of the modem's SIM card
	String imsi; //Optional. This contains the IMSI(length<20) of the modem's SIM card
	String meterSerialNumber; //Optional. This contains the serial number(length<25) of the main electrical meter
								 //of the Charge point.
	String meterType; //Optional. This contains the type(length<25) of the main electrical meter of the Charge point.

	/*conf() variables*/
	Date currentTime;  //Required. Contains Central System's current time
	int interval; 
	

	/*Required. When registration is accepted,this contains the heartbeat interval in seconds.
	                 If Central System returns something other than accepted, value of interval field indicates
	                 minimum wait time before sedmomg a next BootNotification reqeust*/
	Status.Registration status; /*Required. This contains whether the charge point has been registered
									within the Central System*/
	
	
	
	/*default constructor*/
	public BootNotification() {
		super();
	}
	/*parameterized constructor*/
	public BootNotification(String chargeBoxSerialNumber, String chargePointModel, String chargePointSerialNumber,
			String chargePointVendor, String firmwareVersion, String iccid, String imsi, String meterSerialNumber,
			String meterType, Date currentTime, int interval, Registration status) {
		super();
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
		this.chargePointModel = chargePointModel;
		this.chargePointSerialNumber = chargePointSerialNumber;
		this.chargePointVendor = chargePointVendor;
		this.firmwareVersion = firmwareVersion;
		this.iccid = iccid;
		this.imsi = imsi;
		this.meterSerialNumber = meterSerialNumber;
		this.meterType = meterType;
		this.currentTime = currentTime;
		this.interval = interval;
		this.status = status;
	}

	int req(){
		conf();
		/*
		if( status == 1){
			//adjust heartbeat according to interval provided and sync the clock.
		}
		else if(status == 2){
			//wait for further requests to get more info
		}
		else{
			do{
				//wait;
				interval--;
			}while(interval<0);
			req();
		}
    	 */
		return 0;
	}
	int conf(){
		try {
			//check whether it is to be accepted and store it accordingly
			/*
			if( status == 1){
				time = "01/01/2019 00:00:00";
				interval = 0;
			}
			else if(status == 2){
			//need more info... charge point can't send any more request so v high interval returned
				time = "";
				interval = 86400*365; //a year
			}
			else{
				time = "";
				interval = 100; //try again after 100 seconds
			}
			*/
			return 0;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error",e);
			return 1;
		}
	}
	/*getters and setters*/
	public String getChargeBoxSerialNumber() {
		return chargeBoxSerialNumber;
	}

	public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) {
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
	}

	public String getChargePointModel() {
		return chargePointModel;
	}

	public void setChargePointModel(String chargePointModel) {
		this.chargePointModel = chargePointModel;
	}

	public String getChargePointSerialNumber() {
		return chargePointSerialNumber;
	}

	public void setChargePointSerialNumber(String chargePointSerialNumber) {
		this.chargePointSerialNumber = chargePointSerialNumber;
	}

	public String getChargePointVendor() {
		return chargePointVendor;
	}

	public void setChargePointVendor(String chargePointVendor) {
		this.chargePointVendor = chargePointVendor;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public Status.Registration getStatus() {
		return status;
	}

	public void setStatus(Status.Registration status) {
		this.status = status;
	}
}