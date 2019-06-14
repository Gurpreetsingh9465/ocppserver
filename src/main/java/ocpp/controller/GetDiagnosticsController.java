package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("getDiagnosticsController")
public class GetDiagnosticsController {

	@RequestMapping(value="/getDiagnostics",method=RequestMethod.POST)
	@ResponseBody
	public String getDiagnostics(@RequestParam("location") String location,
@RequestParam("retries") Integer retries,
@RequestParam("retryInterval") Integer retryInterval,
@RequestParam("startTime") String startTime,
@RequestParam("stopTime") String stopTime) {
		return "GetDiagnosticsController";
	}
}
