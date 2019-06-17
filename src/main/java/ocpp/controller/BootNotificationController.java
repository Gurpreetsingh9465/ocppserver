package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value="/bootNotification",method=RequestMethod.POST)
	@ResponseBody
	public User bootNotification(@PathVariable("id") String id) {
		System.out.println(id);
		return bootNotificationService.bootDevice(id);
	}
}
