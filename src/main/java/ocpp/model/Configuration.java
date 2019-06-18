package ocpp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ocpp.essential.KeyVal;

@Entity
@Table(name="Configuration")
public class Configuration{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Key")
	private String key; //Optional. List of keys for which the configuration value is requested. Length<50

	@ManyToMany
    @JoinColumn(name="ConfigurationKey")
    private KeyVal configurationKey;
   
    @Column(name="UnknownKey")
    private String unknownKey; //Optional. Requested keys that are unknown. Length<50

    /*default constructor*/
    Configuration(){
        key = "";
        unknownKey = "";
    }

    /*parameterized constructor*/

	public Configuration(String key, KeyVal configurationKey, String unknownKey) {
		super();
		this.key = key;
		this.configurationKey = configurationKey;
		this.unknownKey = unknownKey;
	}
    
    
    public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public KeyVal getConfigurationKey() {
		return configurationKey;
	}

	public void setConfigurationKey(KeyVal configurationKey) {
		this.configurationKey = configurationKey;
	}
	
	public String getUnknownKey() {
		return unknownKey;
	}

	public void setUnknownKey(String unknownKey) {
		this.unknownKey = unknownKey;
	}

	@Override
	public String toString() {
		return "Configuration [key=" + key + ", configurationKey=" + configurationKey + ", unknownKey=" + unknownKey
				+ "]";
	}


}