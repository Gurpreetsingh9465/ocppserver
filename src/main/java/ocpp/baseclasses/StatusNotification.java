package ocpp.baseclasses;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.ErrorCode;
import ocpp.essential.ErrorCode.ChargePoint;
import ocpp.essential.Status;

public class StatusNotification {
	private static final Logger LOGGER = Logger.getLogger(StatusNotification.class.getName());
	/*req()*/
	int connectorID; /*Required. The id of the connector for which the status is reported. Id '0'(zero)
					   is used if the status is for the charge point main controller*/

	ErrorCode.ChargePoint errorCode;//Required.This contains the error code reported by the ChargePoint

	String info; //Optional. Additional free format info related to the error. Length <50

	Status.ChargePoint status; //Required. This contains	the current status of the Charge Point.

	Date timestamp; //Optional. The time for which the status is reported. If absent time of receipt of the message
	//will be assumed.

	String vendorId; //Optional. This identifies the vendor-specific implementation.

	String vendorErrorCode; //Optional. This contains the vendor-specific error code.

	//no conf() variables
	public StatusNotification() {
		connectorID = 0;
		errorCode = ErrorCode.ChargePoint.NoError;
		status = Status.ChargePoint.Available;
		timestamp = new Date();
		vendorId = "";
		vendorErrorCode = "";
	}

	

	public StatusNotification(int connectorID, ChargePoint errorCode, String info,
			ocpp.essential.Status.ChargePoint status, Date timestamp, String vendorId, String vendorErrorCode) {
		super();
		this.connectorID = connectorID;
		this.errorCode = errorCode;
		this.info = info;
		this.status = status;
		this.timestamp = timestamp;
		this.vendorId = vendorId;
		this.vendorErrorCode = vendorErrorCode;
	}



	int req(){
		/*variables are set according to state/situation*/
		/*if error occurs*/
		//get code from transitions table and find corresponding error code in errorCode array.
		return 0;
	}
	
	boolean conf(){
		try {
			//takes action
			return true;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error",e);
			return false;
		}
	}



	public int getConnectorID() {
		return connectorID;
	}



	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}



	public ErrorCode.ChargePoint getErrorCode() {
		return errorCode;
	}



	public void setErrorCode(ErrorCode.ChargePoint errorCode) {
		this.errorCode = errorCode;
	}



	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	public Status.ChargePoint getStatus() {
		return status;
	}



	public void setStatus(Status.ChargePoint status) {
		this.status = status;
	}



	public Date getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}



	public String getVendorId() {
		return vendorId;
	}



	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}



	public String getVendorErrorCode() {
		return vendorErrorCode;
	}



	public void setVendorErrorCode(String vendorErrorCode) {
		this.vendorErrorCode = vendorErrorCode;
	}
}