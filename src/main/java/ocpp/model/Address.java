package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	public Address(int addressPk, String street, String houseNumber, String zipCode, String city, String country) {
		super();
		this.addressPk = addressPk;
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_pk")
	private int addressPk;
	@Column(name="street")
	private String street;
	@Column(name="house_number")
	private String houseNumber;
	@Column(name="zip_code")
	private String zipCode;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	@Override
	public String toString() {
		return "Address [addressPk=" + addressPk + ", street=" + street + ", houseNumber=" + houseNumber + ", zipCode="
				+ zipCode + ", city=" + city + ", country=" + country + "]";
	}
	public int getAddressPk() {
		return addressPk;
	}
	public void setAddressPk(int addressPk) {
		this.addressPk = addressPk;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}