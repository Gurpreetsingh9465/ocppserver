package ocpp.baseclasses;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.IdTagInfo;
import ocpp.essential.Type;
import ocpp.essential.Type.Reason;

public class StopTransaction{
	private static final Logger LOGGER = Logger.getLogger(StopTransaction.class.getName());
	/*req()*/
	String idTag; /*Optional. This contains	the identifier which requested to stop the charging. It is optional
				 because a Charge Point may terminate charging without the presence of an idTag, e.g. in case of a
				 reset. A Charge Point	SHALL send the idTag if	known. Length<20.*/

	int meterStop; //Required. This contains the meter value in Wh for the connector at end	of the transaction.

	Date timestamp; //Required. This contains the date and time on which the transaction is stopped.

	int transactionId; //Required. This contains the transaction-id as received by the StartTransaction.conf.

	Type.Reason reason; /*Optional. This contains the reason why the transcation was stopped. MAY only be omitted
	                      when Reason is "Local"*/

	//MeterValue transactionData; //Optional. This contains transaction usage details relevvant for billing purposes.

	/*conf()*/
	IdTagInfo idTagInfo; /*Optional. This contains information about authorization status,expiry and parent id. It
						is optional because a transaction may have been stopped without an identifier.*/

	StopTransaction(){
		idTag="";
		meterStop=0;
		timestamp = new Date();
		transactionId = 0;
		reason = Type.Reason.Local;
		//transactionData = new MeterValue();
	}
	
	public StopTransaction(String idTag, int meterStop, Date timestamp, int transactionId, Reason reason,
			IdTagInfo idTagInfo) {
		super();
		this.idTag = idTag;
		this.meterStop = meterStop;
		this.timestamp = timestamp;
		this.transactionId = transactionId;
		this.reason = reason;
		this.idTagInfo = idTagInfo;
	}
   
	int req() { //it is more of a information than a request to stop transaction
		/*update the variables if needed*/
		try {
			idTagInfo = conf();
			/*
			if(reason == 0){
				//update local cache with reply
				return 0;
			}
			else{
				//see the action taken and resume
				return 1;
			}
			*/
			return 0;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE,"Error",e);
			return 2;
		}
	}
	IdTagInfo conf() {
		try {
			/*
				Here confirmation is only to get idTag info from server to update the local authorization cache.
				No checking is there.idTag info is returned
			*/

			/*
			if(reason == 0) //normal ending
				idTagInfo = "";
			else{
				throw new Exception?
				String action = "";
				Find out the reason behind stopping,act accordingly and return what action was taken
				return action;
			}
			*/
			return idTagInfo;
		}
		catch (Exception e) {
			LOGGER.log(Level.SEVERE,"Error",e);
			return new IdTagInfo();
		}
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public int getMeterStop() {
		return meterStop;
	}

	public void setMeterStop(int meterStop) {
		this.meterStop = meterStop;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Type.Reason getReason() {
		return reason;
	}

	public void setReason(Type.Reason reason) {
		this.reason = reason;
	}

	public IdTagInfo getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(IdTagInfo idTagInfo) {
		this.idTagInfo = idTagInfo;
	}
}