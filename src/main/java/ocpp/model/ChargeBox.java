package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ocpp.request.BootNotificationRequest;

@Entity
@Table(name="charge_box")
public class ChargeBox {

	public ChargeBox() {
		super();
	}

	public ChargeBox(int chargeBoxPk, String chargeBoxId, String endpointAddress, String ocppProtocol,
			String chargePointVendor, String chargePointModel, String chargePointSerialNumber,
			String chargeBoxSerialNumber, float fwVersion, String fwUpdateStatus, Date fwUpdateTimestamp, String iccid,
			String imsi, String meterType, String meterSerialNumber, String diagnosticsStatus,
			Date diagnosticsTimestamp, Date lastHeartbeatTimestamp, String description, String note,
			float locationLatitude, float locationLongitude, Address AddressPk, String adminAddress,
			int insertConnectorStatusAfterTransactionMsg) {
		super();
		this.chargeBoxPk = chargeBoxPk;
		this.chargeBoxId = chargeBoxId;
		this.endpointAddress = endpointAddress;
		this.ocppProtocol = ocppProtocol;
		this.chargePointVendor = chargePointVendor;
		this.chargePointModel = chargePointModel;
		this.chargePointSerialNumber = chargePointSerialNumber;
		this.chargeBoxSerialNumber = chargeBoxSerialNumber;
		this.fwVersion = fwVersion;
		this.fwUpdateStatus = fwUpdateStatus;
		this.fwUpdateTimestamp = fwUpdateTimestamp;
		this.iccid = iccid;
		this.imsi = imsi;
		this.meterType = meterType;
		this.meterSerialNumber = meterSerialNumber;
		this.diagnosticsStatus = diagnosticsStatus;
		this.diagnosticsTimestamp = diagnosticsTimestamp;
		this.lastHeartbeatTimestamp = lastHeartbeatTimestamp;
		this.description = description;
		this.note = note;
		this.locationLatitude = locationLatitude;
		this.locationLongitude = locationLongitude;
		this.AddressPk = AddressPk;
		this.adminAddress = adminAddress;
		this.insertConnectorStatusAfterTransactionMsg = insertConnectorStatusAfterTransactionMsg;
	}
	public void setBootNotificationRequest(BootNotificationRequest bootNotification) {
		this.iccid = bootNotification.getIccid();
		this.chargePointVendor = bootNotification.getChargePointVendor();
		this.chargePointModel = bootNotification.getChargePointModel();
		this.chargePointSerialNumber = bootNotification.getChargePointSerialNumber();
		this.chargeBoxSerialNumber = bootNotification.getChargeBoxSerialNumber();
		this.imsi = bootNotification.getImsi();
		this.meterType = bootNotification.getMeterType();
		this.meterSerialNumber = bootNotification.getMeterSerialNumber();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="charge_box_pk")
	private int chargeBoxPk;
	
	@Column(name="charge_box_id")
	private String chargeBoxId;
	
	@Column(name="endpoint_Address")
	private String endpointAddress;
	
	@Column(name="ocpp_protocol")
	private String ocppProtocol;
	
	@Column(name="charge_point_vendor")
	private String chargePointVendor;
	
	@Column(name="charge_point_model")
	private String chargePointModel;
	
	@Column(name="charge_point_serial_number")
	private String chargePointSerialNumber;
	
	@Column(name="charge_box_serial_number")
	private String chargeBoxSerialNumber;
	
	@Column(name="fw_version")
	private float fwVersion;
	
	@Column(name="fw_update_status")
	private String fwUpdateStatus;
	
	@Column(name="fw_update_timestamp")
	private Date fwUpdateTimestamp;
	
	@Column(name="iccid")
	private String iccid;
	
	@Column(name="imsi")
	private String imsi;
	
	@Column(name="meter_type")
	private String meterType;
	
	@Column(name="meter_serial_number")
	private String meterSerialNumber;
	
	@Column(name="diagnostics_status")
	private String diagnosticsStatus;
	
	@Column(name="diagnostics_timestamp")
	private Date diagnosticsTimestamp;
	
	@Column(name="last_heartbeat_timestamp")
	private Date lastHeartbeatTimestamp;
	
	@Column(name="description")
	private String description;
	
	@Column(name="note")
	private String note;
	
	@Column(name="location_latitude")
	private float locationLatitude;
	
	@Column(name="location_longitude")
	private float locationLongitude;
	
	@OneToOne
	@JoinColumn(name="address_pk")
	private Address AddressPk;
	
	@Column(name="admin_Address")
	private String adminAddress;
	
	@Column(name="insert_connector_status_after_transaction_msg")
	private int insertConnectorStatusAfterTransactionMsg;

	@Override
	public String toString() {
		return "ChargeBox [chargeBoxPk=" + chargeBoxPk + ", chargeBoxId=" + chargeBoxId + ", endpointAddress="
				+ endpointAddress + ", ocppProtocol=" + ocppProtocol + ", chargePointVendor=" + chargePointVendor
				+ ", chargePointModel=" + chargePointModel + ", chargePointSerialNumber=" + chargePointSerialNumber
				+ ", chargeBoxSerialNumber=" + chargeBoxSerialNumber + ", fwVersion=" + fwVersion + ", fwUpdateStatus="
				+ fwUpdateStatus + ", fwUpdateTimestamp=" + fwUpdateTimestamp + ", iccid=" + iccid + ", imsi=" + imsi
				+ ", meterType=" + meterType + ", meterSerialNumber=" + meterSerialNumber + ", diagnosticsStatus="
				+ diagnosticsStatus + ", diagnosticsTimestamp=" + diagnosticsTimestamp + ", lastHeartbeatTimestamp="
				+ lastHeartbeatTimestamp + ", description=" + description + ", note=" + note + ", locationLatitude="
				+ locationLatitude + ", locationLongitude=" + locationLongitude + ", adminAddress=" + adminAddress
				+ ", insertConnectorStatusAfterTransactionMsg=" + insertConnectorStatusAfterTransactionMsg + "]";
	}

	public int getChargeBoxPk() {
		return chargeBoxPk;
	}

	public void setChargeBoxPk(int chargeBoxPk) {
		this.chargeBoxPk = chargeBoxPk;
	}

	public String getChargeBoxId() {
		return chargeBoxId;
	}

	public void setChargeBoxId(String chargeBoxId) {
		this.chargeBoxId = chargeBoxId;
	}

	public String getEndpointAddress() {
		return endpointAddress;
	}

	public void setEndpointAddress(String endpointAddress) {
		this.endpointAddress = endpointAddress;
	}

	public String getOcppProtocol() {
		return ocppProtocol;
	}

	public void setOcppProtocol(String ocppProtocol) {
		this.ocppProtocol = ocppProtocol;
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

	public float getFwVersion() {
		return fwVersion;
	}

	public void setFwVersion(float fwVersion) {
		this.fwVersion = fwVersion;
	}

	public String getFwUpdateStatus() {
		return fwUpdateStatus;
	}

	public void setFwUpdateStatus(String fwUpdateStatus) {
		this.fwUpdateStatus = fwUpdateStatus;
	}

	public Date getFwUpdateTimestamp() {
		return fwUpdateTimestamp;
	}

	public void setFwUpdateTimestamp(Date fwUpdateTimestamp) {
		this.fwUpdateTimestamp = fwUpdateTimestamp;
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

	public String getDiagnosticsStatus() {
		return diagnosticsStatus;
	}

	public void setDiagnosticsStatus(String diagnosticsStatus) {
		this.diagnosticsStatus = diagnosticsStatus;
	}

	public Date getDiagnosticsTimestamp() {
		return diagnosticsTimestamp;
	}

	public void setDiagnosticsTimestamp(Date diagnosticsTimestamp) {
		this.diagnosticsTimestamp = diagnosticsTimestamp;
	}

	public Date getLastHeartbeatTimestamp() {
		return lastHeartbeatTimestamp;
	}

	public void setLastHeartbeatTimestamp(Date lastHeartbeatTimestamp) {
		this.lastHeartbeatTimestamp = lastHeartbeatTimestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getLocationLatitude() {
		return locationLatitude;
	}

	public void setLocationLatitude(float locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

	public float getLocationLongitude() {
		return locationLongitude;
	}

	public void setLocationLongitude(float locationLongitude) {
		this.locationLongitude = locationLongitude;
	}

	public Address getAddressPk() {
		return AddressPk;
	}

	public void setAddressPk(Address AddressPk) {
		this.AddressPk = AddressPk;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public int getInsertConnectorStatusAfterTransactionMsg() {
		return insertConnectorStatusAfterTransactionMsg;
	}

	public void setInsertConnectorStatusAfterTransactionMsg(int insertConnectorStatusAfterTransactionMsg) {
		this.insertConnectorStatusAfterTransactionMsg = insertConnectorStatusAfterTransactionMsg;
	}
	
}