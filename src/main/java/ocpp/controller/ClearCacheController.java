package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("clearCacheController")
public class ClearCacheController {

	@RequestMapping(value="/clearCache",method=RequestMethod.POST)
	@ResponseBody
	public String clearCache() {
		return "ClearCacheController";
	}
}
