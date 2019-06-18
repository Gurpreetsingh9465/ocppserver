package ocpp.baseclasses;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.IdTagInfo;

public class StartTransaction{

	private static final Logger LOGGER = Logger.getLogger(StartTransaction.class.getName());

	/*req()*/
	int connectorID; //Required. This identifies which connector of the charge point is used.

	String idTag; //Required. This contains identifier for which a transaction has to be started. Length<20

	int meterStart; //Required. This contains the meter value in Wh for the connector at start of the transaction.

	int reservationID; //Optional. This contains the id of the reservation that terminates as a result of
					  // this transaction

	Date timestamp; //Required. This contains the date and time on which the transaction is started.

	/*conf()*/
	IdTagInfo idTagInfo; //Required. This contains info about authorization status,expiry and parent ID

	int transactionId; //Required. This contains the transaction ID supplied by Central System.

	StartTransaction(){
		connectorID = 0;
		idTag = "";
		meterStart = 0;
		reservationID = 0;
		timestamp = new Date();
		idTagInfo = new IdTagInfo();
	}

	public StartTransaction(int connectorID, String idTag, int meterStart, int reservationID, Date timestamp,
							IdTagInfo idTagInfo, int transactionId) {
		this.connectorID = connectorID;
		this.idTag = idTag;
		this.meterStart = meterStart;
		this.reservationID = reservationID;
		this.timestamp = timestamp;
		this.idTagInfo = idTagInfo;
		this.transactionId = transactionId;
	}

	int req(){
		boolean confirmed = conf();
		if(confirmed){
			/*proceed with transaction*/
			return 0;
		}
		else{
			LOGGER.log(Level.SEVERE,"Failure");
			return 1;
		}
		
	}
	boolean conf(){
		/*
		if the identifier in the request PDU is verified then it must return a transactionID and no msg
		otherwise it must reject the transaction saying what went wrong in msg
		(useful if we have local Authorization Cache where info may be outdated)
		*/
		try {
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

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public int getMeterStart() {
		return meterStart;
	}

	public void setMeterStart(int meterStart) {
		this.meterStart = meterStart;
	}

	public int getReservationID() {
		return reservationID;
	}

	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public IdTagInfo getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(IdTagInfo idTagInfo) {
		this.idTagInfo = idTagInfo;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}