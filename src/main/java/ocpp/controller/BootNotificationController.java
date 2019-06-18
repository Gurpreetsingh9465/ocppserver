package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.request.BootNotificationRequest;
import ocpp.service.BootNotificationService;



@Controller("bootNotificationController")
public class BootNotificationController {
	@Autowired
	private BootNotificationService service;
	@PostMapping(path="/bootNotification")
	@ResponseBody
	public String bootNotification(@RequestBody BootNotificationRequest bootNotificationRequest) {
		
		service.bootNotificationService(bootNotificationRequest);
		
		return "BootNotificationController";
	}
}
