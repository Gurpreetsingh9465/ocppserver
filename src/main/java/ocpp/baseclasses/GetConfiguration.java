package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.KeyVal;

public class GetConfiguration {
    private static final Logger LOGGER = Logger.getLogger(GetConfiguration.class.getName());
    /*req()*/
    String key; //Optional. List of keys for which the configuration value is requested. Length<50

    /*conf()*/
    KeyVal configurationKey; //Optional. List of requested or known keys
    String unknownKey; //Optional. Requested keys that are unknown. Length<50

    /*default constructor*/
    GetConfiguration(){
        key = "";
        configurationKey = new KeyVal();
        unknownKey = "";
    }

    /*parameterized constructor*/
    public GetConfiguration(String key, KeyVal configurationKey, String unknownKey) {
        this.key = key;
        this.configurationKey = configurationKey;
        this.unknownKey = unknownKey;
    }

    int req(){
        /*set the key variable as needed*/
        conf();

        return 0;
    }

    int conf(){
        try{
            /*
            if(key == "")
                 //send all the max possible config keys in configurationKey and unknownKey accordingly
            else
                 //get the required key and set the variables accordingly
            */
            return 0;
        }
        catch (Exception e){
            LOGGER.log(Level.SEVERE,"Error",e);
            return 1;
        }
    }

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public KeyVal getConfigurationKey() {
		return configurationKey;
	}

	public void setConfigurationKey(KeyVal configurationKey) {
		this.configurationKey = configurationKey;
	}

	public String getUnknownKey() {
		return unknownKey;
	}

	public void setUnknownKey(String unknownKey) {
		this.unknownKey = unknownKey;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
