package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("getCompositeScheduleController")
public class GetCompositeScheduleController {

	@RequestMapping(value="/getCompositeSchedule",method=RequestMethod.POST)
	@ResponseBody
	public String getCompositeSchedule(@RequestParam("connectorId") Integer connectorId,
@RequestParam("duration") Integer duration,
@RequestParam("chargingRateUnit") String chargingRateUnit) {
		return "GetCompositeScheduleController";
	}
}
