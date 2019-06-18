package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;

public class UnlockConnector {
    private static final Logger LOGGER = Logger.getLogger(UnlockConnector.class.getName());
    /*req()*/
    int connectorID; //Required. This contains the identifier of the connector to be unlocked.
    /*conf()*/
    Status.Unlock status; //Required. This indicates whether the Charge Point has unlocked the connector.

    /*default constructor*/
    UnlockConnector() {
        connectorID = 0;
        status = Status.Unlock.Unlocked;
    }

    /*parameterized constructor*/
    public UnlockConnector(int connectorID, Status.Unlock status) {
        this.connectorID = connectorID;
        this.status = status;
    }

    int req() {
        conf(); //repeat until you get confirmation
        return 0;
    }

    int conf() {
        try {
            //if transaction running,stop that transaction first
            //status  = 1;
            return 0;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error ", e);
            return 1;
        }
    }
}