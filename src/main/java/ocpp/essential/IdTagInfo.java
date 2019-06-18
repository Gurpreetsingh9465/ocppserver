package ocpp.essential;

import java.util.Date;

public class IdTagInfo {
    Date expiryDate; //optional. Contains date at which ID tag should be removed from Authorization Cache

    String parentIdTag; //Optional. Contains the parent identifier of length < 20

    Status.Authorization status; //Required. Contains whether id tag has been accepted or not by the central system

    /*default constructor*/
    public IdTagInfo(){
        expiryDate = new Date();
        parentIdTag = "";
        status = Status.Authorization.Blocked;
    }

    /*parameterized constructor*/
    public IdTagInfo(Date expiryDate, String parentIdTag, Status.Authorization status) {
        this.expiryDate = expiryDate;
        this.parentIdTag = parentIdTag;
        this.status = status;
    }

    /*getters and setters*/
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getParentIdTag() {
        return parentIdTag;
    }

    public void setParentIdTag(String parentIdTag) {
        this.parentIdTag = parentIdTag;
    }

    public Status.Authorization getStatus() {
        return status;
    }

    public void setStatus(Status.Authorization status) {
        this.status = status;
    }
}
