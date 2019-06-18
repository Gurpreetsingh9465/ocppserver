package ocpp.request;


public class BootNotificationRequest {
	public BootNotificationRequest() {
		super();
	}

	@Override
	public String toString() {
		return "BootNotification [iccid=" + iccid + ", chargePointVendor=" + chargePointVendor + ", chargePointModel="
				+ chargePointModel + ", chargePointSerialNumber=" + chargePointSerialNumber + ", chargeBoxSerialNumber="
				+ chargeBoxSerialNumber + ", firmwareVersion=" + firmwareVersion + ", imsi=" + imsi + ", meterType="
				+ meterType + ", meterSerialNumber=" + meterSerialNumber + "]";
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getChargePointVendor() {
		return chargePointVendor;
	}

	public void setChargePointVendor(String chargePointVendor) {
		this.chargePointVendor = chargePointVendor;
	}

	public String getChargePointModel() {
		return chargePointModel;
	}

	public void setChargePointModel(String chargePointModel) {
		this.chargePointModel = chargePointModel;
	}

	public String getChargePointSerialNumber() {
		return chargePointSerialNumber;
	}

	public void setChargePointSerialNumber(String chargePointSerialNumber) {
		this.chargePointSerialNumber = chargePointSerialNumber;
	}

	public String getChargeBoxSerialNumber() {
		return chargeBoxSerialNumber;
	}

	public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) {
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
	}

	public BootNotificationRequest(String iccid, String chargePointVendor, String chargePointModel,
			String chargePointSerialNumber, String chargeBoxSerialNumber, String firmwareVersion, String imsi,
			String meterType, String meterSerialNumber) {
		super();
		this.iccid = iccid;
		this.chargePointVendor = chargePointVendor;
		this.chargePointModel = chargePointModel;
		this.chargePointSerialNumber = chargePointSerialNumber;
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
		this.firmwareVersion = firmwareVersion;
		this.imsi = imsi;
		this.meterType = meterType;
		this.meterSerialNumber = meterSerialNumber;
	}

	private String iccid;
	private String chargePointVendor;
	private String chargePointModel;
	private String chargePointSerialNumber;
	private String chargeBoxSerialNumber;
	private String firmwareVersion;
	private String imsi;
	private String meterType;
	private String meterSerialNumber;
	
}