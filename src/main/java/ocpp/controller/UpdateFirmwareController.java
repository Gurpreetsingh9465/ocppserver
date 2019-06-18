package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("updateFirmwareController")
public class UpdateFirmwareController {

	@RequestMapping(value="/updateFirmware",method=RequestMethod.POST)
	@ResponseBody
	public String updateFirmware(@RequestParam("location") String location,
@RequestParam("retries") Number retries,
@RequestParam("retrieveDate") String retrieveDate,
@RequestParam("retryInterval") Number retryInterval) {
		return "UpdateFirmwareController";
	}
}
