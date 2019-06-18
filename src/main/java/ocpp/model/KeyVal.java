package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KeyVal")
public class KeyVal {
	    
	    @Override
	public String toString() {
		return "KeyVal [key=" + key + ", readonly=" + readonly + ", value=" + value + "]";
	}
	    public KeyVal() {}
		public KeyVal(String key, boolean readonly, String value) {
		super();
		this.key = key;
		this.readonly = readonly;
		this.value = value;
	}

		public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		@Column(name = "Key")
	    private String key;
	    
		@Column(name = "Readonly")
		private boolean readonly;

		@Column(name = "Value")
		private String value;
}
