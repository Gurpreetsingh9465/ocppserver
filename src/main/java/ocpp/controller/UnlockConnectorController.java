package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("unlockConnectorController")
public class UnlockConnectorController {

	@RequestMapping(value="/unlockConnector",method=RequestMethod.POST)
	@ResponseBody
	public String unlockConnector(@RequestParam("connectorId") Integer connectorId) {
		return "UnlockConnectorController";
	}
}
