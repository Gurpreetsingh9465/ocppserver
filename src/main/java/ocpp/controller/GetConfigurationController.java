package ocpp.controller;


import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("getConfigurationController")
public class GetConfigurationController {

	@RequestMapping(value="/getConfiguration",method=RequestMethod.POST)
	@ResponseBody
	public String getConfiguration(@RequestParam("key") ArrayList<String> key) {
		return "GetConfigurationController";
	}
}
