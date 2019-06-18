package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("firmwareStatusNotificationController")
public class FirmwareStatusNotificationController {

	@RequestMapping(value="/firmwareStatusNotification",method=RequestMethod.POST)
	@ResponseBody
	public String firmwareStatusNotification(@RequestParam("status") String status) {
		return "FirmwareStatusNotificationController";
	}
}
