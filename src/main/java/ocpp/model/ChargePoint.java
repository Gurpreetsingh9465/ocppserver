package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChargePoint")
public class ChargePoint {

	/*table columns*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ChargePointId")
	private int chargePointId;
	
	@Column(name="AddressLine1")
	private String addressLine1;
	
	@Column(name="AddressLine2")
	private String addressLine2;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="PostalCode")
	private int postalCode;
	
	@Column(name="Latitude")
	private float latitude;
	
	@Column(name="Longitude")
	private float longitude;

	/*default constructor*/
	public ChargePoint() {
		
	}
	
	/*parameterized constructor*/
	public ChargePoint(int chargePointId, String addressLine1, String addressLine2, String city, String state,
			int postalCode, float latitude, float longitude) {
		this.chargePointId = chargePointId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	/*getters and setters*/
	public int getChargePointId() {
		return chargePointId;
	}

	public void setChargePointId(int chargePointId) {
		this.chargePointId = chargePointId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "ChargePoint [chargePointId=" + chargePointId + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + ", latitude="
				+ latitude + ", longitude=" + longitude + "]";
	}
	
}
