package ocpp.essential;

public class Type {
	public enum Availability {
        Inoperative, Operative;
    }
    /*
    Inoperative - Charge point is not available for charging.
    Operative -  Charge point is available for charging.
    */

    public enum ChargingProfileKind {
        Absolute, Recurring, Relative;
    }

    public enum ChargingProfilePurpose {
        ChangePointMaxProfile, TxDefaultProfile, TxProfile;
    }
    public enum ChargingRateUnit {
        W, A;
    }
    /*
    W - Watts(power). This is the TOTAL allowed charging power. If used for AC charging, the phase current should be
    calculated via :  Current per phase = Power / ( Line Voltage * Number of phases).
    "Line voltage" is the set voltage for arae and not the measured voltage. "Number of phases" is numberPhases from
    ChargingSchedulePeriod. More convenient to use this for DC charging. default number of phases = 3.
    A - Amperes(current). Amount of Ampere per phase not the sum of all phases. More convenient to use this for DC
    charging.
    */

    public enum Reason {
        DeAuthorized, EmergencyStop, EVDisconnected, HardReset, Local, Other, PowerLoss, Reboot, Remote, SoftReset, UnlockCommand;
    }
    /*
    * DeAuthorized - The transaction was stopped because of the authorization status in a StartTransaction.conf
    * EmergencyStop - Emergency stop button was used.
    * EVDisconnected - Disconnecting of cable, vehicle moved away from inductive charge unit.
    * HardReset - A hard reset command was received.
    * Local - Stopped locally on request. This is a regular termination of a transaction.
      Examples: presenting an RFID tag,pressing a button to stop.
    * Other - Any other reason.
    * PowerLoss - Complete loss of power.
    * Reboot - A locally initiated reset/reboot occurred. (for instance watchdog kicked in)
    * Remote - Stopped remotely on request of the user. This is a regular termination of a transaction.
    Examples: termination using a smartphone app, exceeding a (non local) prepaid credit.
    * SoftReset - A soft reset command was received.
    * UnlockCommand - Central System sent an Unlock Connector command.
    */

    public enum Reset {
        Hard, Soft;
    }
    /*
    Hard - Full reboot of Charge Point software.
    Soft - Return to initial status, gracefully terminating any transactions in progress.
    */
    public enum RecurrencyKind{
        Daily,Weekly;
    }
}