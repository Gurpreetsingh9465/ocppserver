package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("getConfigurationController")
public class GetConfigurationController {

	@RequestMapping(value="/getConfiguration",method=RequestMethod.POST)
	@ResponseBody
	public String getConfiguration(@RequestParam("key") Array key) {
		return "GetConfigurationController";
	}
}
