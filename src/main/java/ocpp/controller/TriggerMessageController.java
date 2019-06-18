package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("triggerMessageController")
public class TriggerMessageController {

	@RequestMapping(value="/triggerMessage",method=RequestMethod.POST)
	@ResponseBody
	public String triggerMessage(@RequestParam("requestedMessage") String requestedMessage,
@RequestParam("connectorId") Integer connectorId) {
		return "TriggerMessageController";
	}
}
