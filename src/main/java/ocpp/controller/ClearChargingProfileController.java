package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("clearChargingProfileController")
public class ClearChargingProfileController {

	@RequestMapping(value="/clearChargingProfile",method=RequestMethod.POST)
	@ResponseBody
	public String clearChargingProfile(@RequestParam("id") Integer id,
@RequestParam("connectorId") Integer connectorId,
@RequestParam("chargingProfilePurpose") String chargingProfilePurpose,
@RequestParam("stackLevel") Integer stackLevel) {
		return "ClearChargingProfileController";
	}
}
