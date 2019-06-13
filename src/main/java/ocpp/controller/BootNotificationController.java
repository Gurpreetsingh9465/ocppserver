package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.model.User;
import ocpp.service.BootNotificationService;

@RestController("bootNotificationController")
public class BootNotificationController {
	@Autowired
	private BootNotificationService bootNotificationService;
	public BootNotificationService getBootNotificationService() {
		return bootNotificationService;
	}

	public void setBootNotificationService(BootNotificationService bootNotificationService) {
		this.bootNotificationService = bootNotificationService;
	}
	@RequestMapping(value="/bootNotification",method=RequestMethod.GET)
	@ResponseBody
	public User bootNotification(@RequestParam("id") String id) {
		System.out.println(bootNotificationService);
		return bootNotificationService.bootDevice(id);
	}
}
