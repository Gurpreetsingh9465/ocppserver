package ocpp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("meterValuesController")
public class MeterValuesController {

	@RequestMapping(value="/meterValues",method=RequestMethod.POST)
	@ResponseBody
	public String meterValues(@RequestParam("connectorId") Integer connectorId,
@RequestParam("transactionId") Integer transactionId,
@RequestParam("meterValue") ArrayList meterValue) {
		return "MeterValuesController";
	}
}
