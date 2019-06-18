package ocpp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Authorize")

public class Authorize {
	
	@Override
	public String toString() {
		return "Authorize [idTag=" + idTag + ", idTagInfo=" + idTagInfo + "]";
	}

	public Authorize() {}
	
	public Authorize(String idTag, String idTagInfo) {
		super();
		this.idTag = idTag;
		this.idTagInfo = idTagInfo;
	}
	

  

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "IdTag")
	private String idTag;
	

	@Column(name = "IdTagInfo")
	private String idTagInfo;
	
	@ManyToOne
	@JoinColumn(name="ParentIdTag")
	private IdTagInfo parentIdTag;

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public String getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(String idTagInfo) {
		this.idTagInfo = idTagInfo;
	}



}	
