package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("remoteStopTransactionController")
public class RemoteStopTransactionController {

	@RequestMapping(value="/remoteStopTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String remoteStopTransaction(@RequestParam("transactionId") Integer transactionId) {
		return "RemoteStopTransactionController";
	}
}
