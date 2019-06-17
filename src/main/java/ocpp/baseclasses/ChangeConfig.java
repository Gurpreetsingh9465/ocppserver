package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Status.Configuration;

public class ChangeConfig {
	private static final Logger LOGGER = Logger.getLogger(ChangeConfig.class.getName());
	//variables of req function
	String key;   //name of the parameter whose value need to be altered.
	String value;  // new value we want to set for this parameter.
	

    //variables of conf function
	Status.Configuration status;	//value returned by the charge point in response to the request of the central system.
	
	/*default constructor*/
	public ChangeConfig() {
		super();
	}

	/*parameterized constructor*/
	public ChangeConfig(String key, String value, Configuration status) {
		this.key = key;
		this.value = value;
		this.status = status;
	}
	
	int req(){
		//passes the key value pair to the charging point to make the reqiured changes in the values of the parameters...
		conf();
		return 0;
	}

	

	int conf(){
		try{
			/*if(changes applied and effective immediately){
				status = ConfigurationStatus.Accepted;
				return 0;
			}
			else if(a reboot is required to make the changes effective){
				status = ConfigurationStatus.RebootRequired;
				return 0;
			}
			else if(key does not respond to the conf setting supported by the charge point){
				status = ConfigurationStatus.NotSupported;
				return 0;
			}
			else{
				status = ConfigurationStatus.Rejected;
				return 0;
			}*/
			return 0;
		}
		catch (Exception e){
			LOGGER.log(Level.SEVERE,"Error ",e);
			return 1;
		}
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Status.Configuration getStatus() {
		return status;
	}

	public void setStatus(Status.Configuration status) {
		this.status = status;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
