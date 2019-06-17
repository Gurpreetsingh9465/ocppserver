package ocpp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ocpp.essential.Type;
import ocpp.essential.Type.ChargingProfileKind;
import ocpp.essential.Type.ChargingProfilePurpose;
import ocpp.essential.Type.RecurrencyKind;


@Entity
@Table(name="ChargingProfile")
public class ChargingProfile{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ChargingProfileId")
	private int chargingProfileId;
	@Column(name="TransactionId")
	private int transactionId;
	@Column(name="StackLevel")
	private int stackLevel;
	@Column(name="ChargingProfilePurpose")
	private	Type.ChargingProfilePurpose chargingProfilePurpose;
	@Column(name="ChargingProfileKind")
	private	Type.ChargingProfileKind chargingProfileKind;
	@Column(name="RecurrencyKind")
	private	Type.RecurrencyKind recurrencyKind;
	@Column(name="ValidFrom")
	private Date validFrom;
	@Column(name="ValidTo")
	private Date validTo;
	
	@ManyToMany
	@JoinColumn(name = "ChargingScheduleId")
	private ChargingSchedule ChargingScheduleId;

	public ChargingProfile(int chargingProfileId, int transactionId, int stackLevel,
			ChargingProfilePurpose chargingProfilePurpose, ChargingProfileKind chargingProfileKind,
			RecurrencyKind recurrencyKind, Date validFrom, Date validTo, ChargingSchedule chargingScheduleId) {
		super();
		this.chargingProfileId = chargingProfileId;
		this.transactionId = transactionId;
		this.stackLevel = stackLevel;
		this.chargingProfilePurpose = chargingProfilePurpose;
		this.chargingProfileKind = chargingProfileKind;
		this.recurrencyKind = recurrencyKind;
		this.validFrom = validFrom;
		this.validTo = validTo;
		ChargingScheduleId = chargingScheduleId;
	}

	@Override
	public String toString() {
		return "ChargingProfile [chargingProfileId=" + chargingProfileId + ", transactionId=" + transactionId
				+ ", stackLevel=" + stackLevel + ", chargingProfilePurpose=" + chargingProfilePurpose
				+ ", chargingProfileKind=" + chargingProfileKind + ", recurrencyKind=" + recurrencyKind + ", validFrom="
				+ validFrom + ", validTo=" + validTo + ", ChargingScheduleId=" + ChargingScheduleId + "]";
	}

	public int getChargingProfileId() {
		return chargingProfileId;
	}

	public void setChargingProfileId(int chargingProfileId) {
		this.chargingProfileId = chargingProfileId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getStackLevel() {
		return stackLevel;
	}

	public void setStackLevel(int stackLevel) {
		this.stackLevel = stackLevel;
	}

	public Type.ChargingProfilePurpose getChargingProfilePurpose() {
		return chargingProfilePurpose;
	}

	public void setChargingProfilePurpose(Type.ChargingProfilePurpose chargingProfilePurpose) {
		this.chargingProfilePurpose = chargingProfilePurpose;
	}

	public Type.ChargingProfileKind getChargingProfileKind() {
		return chargingProfileKind;
	}

	public void setChargingProfileKind(Type.ChargingProfileKind chargingProfileKind) {
		this.chargingProfileKind = chargingProfileKind;
	}

	public Type.RecurrencyKind getRecurrencyKind() {
		return recurrencyKind;
	}

	public void setRecurrencyKind(Type.RecurrencyKind recurrencyKind) {
		this.recurrencyKind = recurrencyKind;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public ChargingSchedule getChargingScheduleId() {
		return ChargingScheduleId;
	}

	public void setChargingScheduleId(ChargingSchedule chargingScheduleId) {
		ChargingScheduleId = chargingScheduleId;
	}
}