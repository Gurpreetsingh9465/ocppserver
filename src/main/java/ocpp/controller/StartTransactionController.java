package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("startTransactionController")
public class StartTransactionController {

	@RequestMapping(value="/startTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String startTransaction(@RequestParam("connectorId") Integer connectorId,
@RequestParam("idTag") String idTag,
@RequestParam("meterStart") Integer meterStart,
@RequestParam("reservationId") Integer reservationId,
@RequestParam("timestamp") String timestamp) {
		return "StartTransactionController";
	}
}
