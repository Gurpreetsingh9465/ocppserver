package ocpp.essential;

public class Status {
    public enum Authorization {
        Blocked, Accepted, Expired, Invalid, ConcurrentTx;
    }
    /*
     * BLOCKED -> Identifier blocked,not allowed for charging
     * ACCEPTED -> Identifier allowed for charging
     * EXPIRED -> Identifier expired,not allowed for charging
     * INVALID -> Identifier unknown,not allowed for charging
     * ConcurrentTx -> Identifier already involved in another transaction and multiple transactions aren't allowed
     */

    public enum Availability {
        Accepted, Rejected, Scheduled;
    }
    /*
    Accepted - Request has been accepted and will be executed.
    Rejected - Request has not been accepted and will not be executed.
    Scheduled - Request has been accepted and will be executed when transaction(s) in progress have finished.
    */

    public enum ChargePoint {
        Available, Preparing, Charging, SuspenedEVSE, SuspenedEV, Finishing, Reserved, Unavailable, Faulted;
    }
    /*
    AVAILABLE -> When a Connector becomes available for a new user (Operative)
    PREPARING -> When a Connector becomes no longer available for a new user but no charging session is active.
    Typically a Connector is occupied when a user presents a tag, inserts a cable or a vehicle
    occupies the parking bay (Operative)
    CHARGING -> When the contactor of a Connector closes, allowing the vehicle to charge(Operative)
    SuspenedEVSE -> When the contactor of a Connector opens upon request of the EVSE, e.g. due to a smart charging
    restriction or as the result of StartTransaction.conf indicating that charging is not allowed.(Operative)
    SuspenedEV -> When the EVSE is ready to deliver energy but contactor is open, e.g. the EV is not ready.
    FINISHING -> When a charging session has stopped at a Connector, but the Connector is not yet available for a new
    user,e.g. the cable has not been removed or the vehicle has not left the parking bay(Operative)
    RESERVED -> When a Connector becomes reserved as a result of a Reserve Now command(Operative)
    UNAVAILABLE -> When a connector becomes unavailable as the result of a Change Availability command or an event
    upon which Charge Point transitions to unavailable at its discretion. Upon receipt of a Change Availability command,
    the status MAY change immediately or it MAY be scheduled. When scheduled, the Status Notification shall be send when
    the availability change becomes effective(Inoperative).
    FAULTED -> When a charge point or connector has reported an error and is not available for energy delivery(Inoperative)
    */

    public enum ChargingProfile{
        Rejected,Accepted,NotSupported
    }
    public enum ClearCache {
        Accepted, Rejected
    }
    /*
    Accepted -  Command has been executed.
    Rejected - Command has not been executed.
    */

    public enum ClearChargingProfile {
        Unknown, Accepted
    }
    /*
    Accepted - Request has been accepted and will be executed.
    Unknown - No Charging Profile(s) were found matching the request.
    */

    public enum Configuration {
        Rejected, Accepted, RebootRequired, NotSupported
    }
    /*
    Accepted - Configuration key supported and setting has been changed.
    Rejected - Configuration key supported, but setting could not be changed.
    RebootRequired - Configuration key supported and setting has been changed, but change will be available after reboot
    (Charge Point will not reboot itself)
    NotSupported - Configuration key is not supported.
     */

    public enum DataTransfer {
        Rejected, Accepted, UnknownVendorId, UnknownMessageId
    }
    /*
    ACCEPTED - Message has been accepted and the contained request is accepted.
    REJECTED - Message has been accepted but the contained request is rejected.
    UnknownVendorId - Message could not be interpreted due to unknown vendorId string.
    UnknownMessageId - Message could not be interpreted due to unknown messageId string.
    */

    public enum GetCompositeSchedule {
        Rejected, Accepted
    }
    /*
    Rejected - Request has not been accepted and will not be executed
    Accepted - Request has been accepted and will be executed
    */
    public enum MessageTrigger{
        BootNotification,DiagnosticsStatusNotification,FirmwareStatusNotification,Heartbeat,MeterValues,StatusNotification;
    }
    /*
    BootNotification - To trigger a BootNotification request.
    DiagnosticsStatusNotification - To trigger a DiagnosticsStatusNotification request.
    FirmwareStatusNotification - To trigger a FirmwareStatusNotification request.
    Heartbeat - To trigger a Heartbeat request
    */


    public enum Registration{
        REJECTED,ACCEPTED,PENDING;
    }
    /*
    Accepted - Charge point is accepted by Central System.
    Pending - Central System is not yet ready to accept the Charge Point. Central System may send messages to retrieve
    information or prepare the Charge Point.
    Rejected - Charge point is not accepted by Central System. This may happen when the Charge Point id is not known by
    Central System.
    */
    public enum RemoteStartStop {
        Rejected, Accepted;
    }

    public enum Reservation{
        Rejected, Accepted, Occupied, Faulted, Unavailable;
    }
    /*
    Accepted - Reservation has been made.
    Faulted - Reservation has not been made, because connectors or specified connector are in a faulted state.
    Occupied - Reservation has not been made. All connectors or the specified connector are occupied.
    Rejected - Reservation has not been made. Charge Point is not configured to accept reservations.
    Unavailable - Reservation has not been made, because connectors or specified connector are in an unavailable state.
    */

    public enum Reset{
        Rejected,Accepted;
    }
    /*
    Accepted - Command will be executed.
    Rejected - Command will not be executed.
    */

    public enum StatusNotification {
        Available, Preparing, Charging, SuspendedEV, SuspendedEVSE, Finishing, Reserved, Unavailable, Faulted;
    }
    /*
    used from 4.9
    */

    public enum TriggerMessage {
        Rejected, Accepted, NotImplemented;
    }
    /*
    Accepted - Requested notification will be sent.
    Rejected - Requested notification will not be sent.
    NotImplemented - Requested notification cannot be sent because it is either not implemented or unknown.
    */

    public enum Unlock {
        Unlocked, UnlockFailed, NotSupported;
    }
    /*
    Unlocked - Connector has successfully been unlocked.
    UnlockFailed - Failed to unlock the connector.
    NotSupported - Charge Point has no connector lock.
    */
}
