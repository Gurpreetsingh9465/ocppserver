package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Status.Authorization;

@Entity
@Table(name="IdTagInfo")
public class IdTagInfo {
    

    @Override
	public String toString() {
		return "IdTagInfo [expiryDate=" + expiryDate + ", parentIdTag=" + parentIdTag + ", status=" + status + "]";
	}

	public IdTagInfo(Date expiryDate, String parentIdTag, Authorization status) {
		super();
		this.expiryDate = expiryDate;
		this.parentIdTag = parentIdTag;
		this.status = status;
	}

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

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ExpieryDate")
	private Date expiryDate;

    @Column(name = "ParentIdTag")
	private String parentIdTag;
    
    @Column(name = "Status")
	private Status.Authorization status;
}
