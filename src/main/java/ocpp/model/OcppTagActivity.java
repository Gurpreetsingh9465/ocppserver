package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ocpp_tag_activity")
public class OcppTagActivity {
	
	
	public OcppTagActivity(int ocppTagPk, int idTag, int parent_id_tag, int expiry_date,
			int max_active_transaction_count, int note, int active_transaction_count, int in_transaction, int blocked) {
		super();
		this.ocppTagPk = ocppTagPk;
		this.idTag = idTag;
		this.parent_id_tag = parent_id_tag;
		this.expiry_date = expiry_date;
		this.max_active_transaction_count = max_active_transaction_count;
		this.note = note;
		this.active_transaction_count = active_transaction_count;
		this.in_transaction = in_transaction;
		this.blocked = blocked;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ocpp_tag_pk")
	private int ocppTagPk;
	
	@Column(name="id_tag")
	private int idTag;
	
	@Column(name="parent_id_tag")
	private int parent_id_tag;
	
	@Column(name="expiry_date")
	private int expiry_date; 
	
	@Column(name="max_active_transaction_count")
	private int max_active_transaction_count; 
	
	@Column(name="note")
	private int note; 
	
	@Column(name="active_transaction_count")
	private int active_transaction_count; 
	
	@Column(name="in_transaction")
	private int in_transaction; 
	
	@Column(name="blocked")
	private int blocked;

	public int getOcppTagPk() {
		return ocppTagPk;
	}

	public void setOcppTagPk(int ocppTagPk) {
		this.ocppTagPk = ocppTagPk;
	}

	public int getIdTag() {
		return idTag;
	}

	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}

	public int getParent_id_tag() {
		return parent_id_tag;
	}

	public void setParent_id_tag(int parent_id_tag) {
		this.parent_id_tag = parent_id_tag;
	}

	public int getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(int expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getMax_active_transaction_count() {
		return max_active_transaction_count;
	}

	public void setMax_active_transaction_count(int max_active_transaction_count) {
		this.max_active_transaction_count = max_active_transaction_count;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getActive_transaction_count() {
		return active_transaction_count;
	}

	public void setActive_transaction_count(int active_transaction_count) {
		this.active_transaction_count = active_transaction_count;
	}

	public int getIn_transaction() {
		return in_transaction;
	}

	public void setIn_transaction(int in_transaction) {
		this.in_transaction = in_transaction;
	}

	public int getBlocked() {
		return blocked;
	}

	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}

	@Override
	public String toString() {
		return "OcppTagActivity [ocppTagPk=" + ocppTagPk + ", idTag=" + idTag + ", parent_id_tag=" + parent_id_tag
				+ ", expiry_date=" + expiry_date + ", max_active_transaction_count=" + max_active_transaction_count
				+ ", note=" + note + ", active_transaction_count=" + active_transaction_count + ", in_transaction="
				+ in_transaction + ", blocked=" + blocked + "]";
	} 
	
	
}
