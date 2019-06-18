package ocpp.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("stopTransactionController")
public class StopTransactionController {

	@RequestMapping(value="/stopTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String stopTransaction(@RequestParam("idTag") String idTag,
@RequestParam("meterStop") Integer meterStop,
@RequestParam("timestamp") String timestamp,
@RequestParam("transactionId") Integer transactionId,
@RequestParam("reason") String reason,
@RequestParam("transactionData") ArrayList<String> transactionData) {
		return "StopTransactionController";
	}
}
