package ocpp.baseclasses;


import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;

public class ReserveNow{
    private static final Logger LOGGER = Logger.getLogger(ReserveNow.class.getName());
    /*req()*/
    int connectorID; //Required. This contains the id of the connector to be reserved. A value of 0 means that the
                    //reservation is not for a specific connector.

    Date expiryDate; //Required. This contains the date and time when the reservation ends.

    String idTag; //Required. The identifier for which the Charge Point has to reserve a connector. Length<20

    String parentIdTag; //Optional. The parent idTag. Length<20

    int reservationId; //Required. Unique id for this reservation.

    /*conf()*/
    Status.Reservation status; //Required. This indicates the success or failure of the reservation.

    /*default constructor*/
    ReserveNow(){
        connectorID = 0;
        expiryDate = new Date();
        idTag = "";
        reservationId = 0;
        parentIdTag = "";
        status = Status.Reservation.Accepted;
    }

    /*parameterized constructor*/
    int req(){
        conf();
        /*when the reservation expires, it shall terminate reservation and make connector available*/
        return 0;
    }

    int conf(){
        try {
            //status = 1;
            /*accepted if resrvation ID doesn't match anything in record
             *occupied if the date and time already taken
             *faulted if the connector is in fault state
             *unavailable if the connector in unavailable state
             *rejected if configured not to accept reservations*/
            return 0;
        }
        catch(Exception e){
            LOGGER.log(Level.SEVERE,"Error ",e);
            return 1;
        }
    }

    public int getConnectorID() {
		return connectorID;
	}

	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public String getParentIdTag() {
		return parentIdTag;
	}

	public void setParentIdTag(String parentIdTag) {
		this.parentIdTag = parentIdTag;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public Status.Reservation getStatus() {
		return status;
	}

	public void setStatus(Status.Reservation status) {
		this.status = status;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public static void  main(String args[]){
        ReserveNow obj = new ReserveNow();
        obj.req();
    }
}