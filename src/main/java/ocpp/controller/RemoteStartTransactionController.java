package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("remoteStartTransactionController")
public class RemoteStartTransactionController {

	@RequestMapping(value="/remoteStartTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String remoteStartTransaction(@RequestParam("connectorId") Integer connectorId,
@RequestParam("idTag") String idTag,
@RequestParam("chargingProfile") Object chargingProfile) {
		return "RemoteStartTransactionController";
	}
}
