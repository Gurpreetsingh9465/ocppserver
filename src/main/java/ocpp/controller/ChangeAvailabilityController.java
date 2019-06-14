package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("changeAvailabilityController")
public class ChangeAvailabilityController {

	@RequestMapping(value="/changeAvailability",method=RequestMethod.POST)
	@ResponseBody
	public String changeAvailability(@RequestParam("connectorId") Integer connectorId,
@RequestParam("type") String type) {
		return "ChangeAvailabilityController";
	}
}
