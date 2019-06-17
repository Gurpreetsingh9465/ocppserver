package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.Status;
import ocpp.essential.Status.Registration;

@Entity
@Table(name="BootNotification")
public class BootNotification {

@Override
	public String toString() {
		return "BootNotification [chargeBoxSerialNumber=" + chargeBoxSerialNumber + ", chargePointSerialNumber="
				+ chargePointSerialNumber + ", chargePointModel=" + chargePointModel + ", chargePointVendor="
				+ chargePointVendor + ", firmwareVersion=" + firmwareVersion + ", iccid=" + iccid + ", imsi=" + imsi
				+ ", meterserialNumber=" + meterserialNumber + ", meterType=" + meterType + ", currentType="
				+ currentType + ", interval=" + interval + ", status=" + status + "]";
	}

public BootNotification(String chargeBoxSerialNumber, String chargePointSerialNumber, String chargePointModel,
			String chargePointVendor, String firmwareVersion, String iccid, String imsi, String meterserialNumber,
			String meterType, Date currentType, int interval, Registration status) {
		super();
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
		this.chargePointSerialNumber = chargePointSerialNumber;
		this.chargePointModel = chargePointModel;
		this.chargePointVendor = chargePointVendor;
		this.firmwareVersion = firmwareVersion;
		this.iccid = iccid;
		this.imsi = imsi;
		this.meterserialNumber = meterserialNumber;
		this.meterType = meterType;
		this.currentType = currentType;
		this.interval = interval;
		this.status = status;
	}

public String getChargeBoxSerialNumber() {
		return chargeBoxSerialNumber;
	}

	public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) {
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
	}

	public String getChargePointSerialNumber() {
		return chargePointSerialNumber;
	}

	public void setChargePointSerialNumber(String chargePointSerialNumber) {
		this.chargePointSerialNumber = chargePointSerialNumber;
	}

	public String getChargePointModel() {
		return chargePointModel;
	}

	public void setChargePointModel(String chargePointModel) {
		this.chargePointModel = chargePointModel;
	}

	public String getChargePointVendor() {
		return chargePointVendor;
	}

	public void setChargePointVendor(String chargePointVendor) {
		this.chargePointVendor = chargePointVendor;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getMeterserialNumber() {
		return meterserialNumber;
	}

	public void setMeterserialNumber(String meterserialNumber) {
		this.meterserialNumber = meterserialNumber;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public Date getCurrentType() {
		return currentType;
	}

	public void setCurrentType(Date currentType) {
		this.currentType = currentType;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public Status.Registration getStatus() {
		return status;
	}

	public void setStatus(Status.Registration status) {
		this.status = status;
	}

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "ChargeBoxSerialNumber")
private String chargeBoxSerialNumber;

@Column(name = "ChargePointSerialNumberr")
private String chargePointSerialNumber;


@Column(name = "ChargePointModel")
private String chargePointModel;


@Column(name = "ChargePointVendor")
private String chargePointVendor;

@Column(name = "FirmwareVersion")
private String firmwareVersion;

@Column(name = "Iccid")
private String iccid;

@Column(name = "Imsi")
private String imsi;

@Column(name = "MeterSerialNumber")
private String meterserialNumber;

@Column(name = "MeterType")
private String meterType;

@Column(name = "CurrentTime")
private Date currentType;

@Column(name = "Interval")
private int interval;

@Column(name = "Status")
private Status.Registration status;

}
