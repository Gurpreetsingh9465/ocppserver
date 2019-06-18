package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("statusNotificationController")
public class StatusNotificationController {

	@RequestMapping(value="/statusNotification",method=RequestMethod.POST)
	@ResponseBody
	public String statusNotification(@RequestParam("connectorId") Integer connectorId,
@RequestParam("errorCode") String errorCode,
@RequestParam("info") String info,
@RequestParam("status") String status,
@RequestParam("timestamp") String timestamp,
@RequestParam("vendorId") String vendorId,
@RequestParam("vendorErrorCode") String vendorErrorCode) {
		return "StatusNotificationController";
	}
}
