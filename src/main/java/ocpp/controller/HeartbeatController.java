package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("heartbeatController")
public class HeartbeatController {

	@RequestMapping(value="/heartbeat",method=RequestMethod.POST)
	@ResponseBody
	public String heartbeat() {
		return "HeartbeatController";
	}
}
