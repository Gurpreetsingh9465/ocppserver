package ocpp.baseclasses;


import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;
import ocpp.essential.Status.MessageTrigger;

public class TriggerMessage{
    private static final Logger LOGGER  = Logger.getLogger(TriggerMessage.class.getName());
    /*req()*/
    Status.MessageTrigger requestedMessage; //Required.
    int connectorID; //Optional. Only filled in when reqeuest applies to a specific connector

    /*conf()*/
    Status.TriggerMessage status; //Required. Indicates whether the charge point will send the requested
                                        //notification or not.

    /*default constructor*/
    TriggerMessage(){
        requestedMessage = Status.MessageTrigger.BootNotification;
        connectorID = 0;
        status = Status.TriggerMessage.Accepted;
    }

    /*parameterized constructor*/
    

    	public TriggerMessage(MessageTrigger requestedMessage, int connectorID,
			ocpp.essential.Status.TriggerMessage status) {
		super();
		this.requestedMessage = requestedMessage;
		this.connectorID = connectorID;
		this.status = status;
	}

    int req(){
        //set the request message and specify the connector ID if needed
        conf();
        /*
        if(status == 1){ //accepted
            //wait for the requested message to come
        }
        */
        return 0;
    }

	int conf(){
        //set status as per need. then call the required function specified in requested message.
        try {
            return 0;
        }
        catch (Exception e){
            LOGGER.log(Level.SEVERE,"Error",e);
            return 1;
        }
    }

    public Status.MessageTrigger getRequestedMessage() {
		return requestedMessage;
	}

	public void setRequestedMessage(Status.MessageTrigger requestedMessage) {
		this.requestedMessage = requestedMessage;
	}

	public int getConnectorID() {
		return connectorID;
	}

	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}

	public Status.TriggerMessage getStatus() {
		return status;
	}

	public void setStatus(Status.TriggerMessage status) {
		this.status = status;
	}

}