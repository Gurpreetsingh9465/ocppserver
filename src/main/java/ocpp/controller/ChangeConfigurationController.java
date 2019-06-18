package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("changeConfigurationController")
public class ChangeConfigurationController {

	@RequestMapping(value="/changeConfiguration",method=RequestMethod.POST)
	@ResponseBody
	public String changeConfiguration(@RequestParam("key") String key,
@RequestParam("value") String value) {
		return "ChangeConfigurationController";
	}
}
