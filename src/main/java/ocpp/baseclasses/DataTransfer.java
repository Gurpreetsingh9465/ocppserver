package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.Status;

public class DataTransfer {
	private static final Logger LOGGER = Logger.getLogger(DataTransfer.class.getName());
    /*req()*/
    String vendorID; //length<25. Required, this identifies the vendor specific implementation
    String messageID; //length<50. Optional, additional identification field.
    String data; //Optional. Data without specified length or format. Used for conf() too.

    /*conf()*/
    Status.DataTransfer status; //Required. This indicates the success or failure of data transfer.

    /*default constructor*/
    DataTransfer(){
        vendorID = "";
        messageID = "";
        data = "";
        status = Status.DataTransfer.Rejected;
    }

    /*parameterized constructor*/

    public DataTransfer(String vendorID, String messageID, String data, Status.DataTransfer status) {
        this.vendorID = vendorID;
        this.messageID = messageID;
        this.data = data;
        this.status = status;
    }
    int req(){
        try{
            conf();
            /*
            if(status == 1){
                System.out.println("Accepted");
                return 0;
            }
            else if(status == 0){
                System.out.println("Rejected");
                return 1;
            }
            else if(status == 2){
                System.out.println("Unknown Message ID");
                return 2;
            }
            else{
                System.out.println("Unknown Vendor ID");
                return 3;
            }
            */
            return 0;
        }
        catch (Exception e){
            LOGGER.log(Level.SEVERE,"Error ",e);
            return 1;
        }
    }
    int conf(){
        try{
            /*check the message ID, vendor ID and other stuff and set status and data string accordingly*/
            /*status = 1;
            data = "";*/
            return 0;
        }
        catch (Exception e){
            LOGGER.log(Level.SEVERE,"Error ",e);
            return 1;
        }
    }

	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Status.DataTransfer getStatus() {
		return status;
	}

	public void setStatus(Status.DataTransfer status) {
		this.status = status;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
}
