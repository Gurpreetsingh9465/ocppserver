package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.MeterValue;

public class MeterValues{
	private static final Logger LOGGER = Logger.getLogger(MeterValues.class.getName());
	/*req()*/
	int connectorId;
	int transactionId;
	MeterValue meterValue;

	/*conf()*/
	//no variables
	
	public MeterValues(int connectorId, int transactionId, MeterValue meterValue) {
		super();
		this.connectorId = connectorId;
		this.transactionId = transactionId;
		this.meterValue = meterValue;
	}

	MeterValues(){
		connectorId=0;
		transactionId=0;
		meterValue = new MeterValue();
	}

	int req(){
		/*sends connectorID, meterValues captured and transactionID of active transaction,if any*/
		conf();
		return 0;
	}
	boolean conf(){
		try{
			return true;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error",e);
			return false;
		}
	}
	public int getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(int connectorId) {
		this.connectorId = connectorId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public MeterValue getMeterValue() {
		return meterValue;
	}

	public void setMeterValue(MeterValue meterValue) {
		this.meterValue = meterValue;
	}

	public static void main(String args[]){
		MeterValues obj = new MeterValues();
		obj.req();
	}
}