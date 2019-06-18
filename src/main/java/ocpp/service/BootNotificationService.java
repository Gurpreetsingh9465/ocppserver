package ocpp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocpp.model.ChargeBox;
import ocpp.repo.ChargeBoxRepo;
import ocpp.request.BootNotificationRequest;

@Service
public class BootNotificationService {
	@Autowired
	private ChargeBoxRepo chargeBoxRepo; 
	
	public void bootNotificationService(BootNotificationRequest bootNotificationRequest) {
		ChargeBox chargeBox = new ChargeBox();
		chargeBox.setBootNotificationRequest(bootNotificationRequest);
		chargeBox.setChargeBoxId("gay18geygw");
		chargeBoxRepo.save(chargeBox);
		System.out.println(bootNotificationRequest.toString());
	}
	
}
