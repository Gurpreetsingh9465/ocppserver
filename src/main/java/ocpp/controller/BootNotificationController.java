package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("bootNotificationController")
public class BootNotificationController {

	@RequestMapping(value="/bootNotification",method=RequestMethod.POST)
	@ResponseBody
	public String bootNotification(@RequestParam("chargePointVendor") String chargePointVendor,
@RequestParam("chargePointModel") String chargePointModel,
@RequestParam("chargePointSerialNumber") String chargePointSerialNumber,
@RequestParam("chargeBoxSerialNumber") String chargeBoxSerialNumber,
@RequestParam("firmwareVersion") String firmwareVersion,
@RequestParam("iccid") String iccid,
@RequestParam("imsi") String imsi,
@RequestParam("meterType") String meterType,
@RequestParam("meterSerialNumber") String meterSerialNumber) {
		return "BootNotificationController";
	}
}
