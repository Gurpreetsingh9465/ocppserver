package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("setChargingProfileController")
public class SetChargingProfileController {

	@RequestMapping(value="/setChargingProfile",method=RequestMethod.POST)
	@ResponseBody
	public String setChargingProfile(@RequestParam("connectorId") Integer connectorId,
@RequestParam("csChargingProfiles") Object csChargingProfiles) {
		return "SetChargingProfileController";
	}
}
