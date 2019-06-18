package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("diagnosticsStatusNotificationController")
public class DiagnosticsStatusNotificationController {

	@RequestMapping(value="/diagnosticsStatusNotification",method=RequestMethod.POST)
	@ResponseBody
	public String diagnosticsStatusNotification(@RequestParam("status") String status) {
		return "DiagnosticsStatusNotificationController";
	}
}
