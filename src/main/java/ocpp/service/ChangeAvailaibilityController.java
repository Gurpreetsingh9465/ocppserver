package ocpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocpp.baseclasses.ChangeAvailability;
import ocpp.essential.Status;
import ocpp.essential.Type;

@Service
public class ChangeAvailaibilityController {
	@Autowired
	private ChangeAvailability changeAvailability;
	
	public Status.Availability changeAvail(int connectorId,Type.Availability status) {
		return Status.Availability.Accepted;
	}
}
