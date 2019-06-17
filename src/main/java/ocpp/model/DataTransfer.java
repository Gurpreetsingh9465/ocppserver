package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;

@Entity
@Table(name="DataTransfer")
public class DataTransfer {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VendorId")
    private String vendorID; //length<25. Required, this identifies the vendor specific implementation
	
	@Column(name="MessageId")
	private String messageID; //length<50. Optional, additional identification field.
	
	@Column(name="Data")
	private String data; //Optional. Data without specified length or format. Used for conf() too.

	@Column(name="Status")
	private Status.DataTransfer status; //Required. This indicates the success or failure of data transfer.

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

	@Override
	public String toString() {
		return "DataTransfer [vendorID=" + vendorID + ", messageID=" + messageID + ", data=" + data + ", status="
				+ status + "]";
	}
	
}