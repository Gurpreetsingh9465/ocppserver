package ocpp.essential;

public class ErrorCode {
	 public enum ChargePoint {
	        NoError, ConnectLockFailure, EVCommunicationError, GroundFailure, HighTemperature, InternalError, LocalListConflict;
	    }
	    /*
	    * NoError -> No error to report
	    * ConnectLockFailure -> Failure to lock or unlock connector
	    * EVCommunicationError -> Communication failure with the vehicle,might be Mode 3 or other communication protocol
	    problem. This is not a real error in the sense that the charge point doesn't need to go to the faulted state.
	    Instead, it should go to the SuspendedEVSE state
	    * GroundFailure -> Ground fault circuit interrupter has been activated
	    * HighTemperature -> Temperature inside charge point is too high
	    * InternalError -> Error in internal hard or software component
	    * LocalListConflict -> Authorization information received from the central system is in conflict
	     with LocalAuthorizatioinList
	    */

}
