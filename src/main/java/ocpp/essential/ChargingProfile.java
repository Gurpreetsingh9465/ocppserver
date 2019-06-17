package ocpp.essential;

import java.util.Date;

public class ChargingProfile {
		int ChargingProfileId;
		int transactionId;
		int stackLevel;

		Type.ChargingProfilePurpose chargingProfilePurpose;


		Type.ChargingProfileKind chargingProfileKind;


		Type.RecurrencyKind recurrencyKind;

		Date validFrom;
		Date validTo;

		ChargingSchedule chargingSchedule; //charging schedule is a class defined....
}