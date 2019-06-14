package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("resetController")
public class ResetController {

	@RequestMapping(value="/reset",method=RequestMethod.POST)
	@ResponseBody
	public String reset(@RequestParam("type") String type) {
		return "ResetController";
	}
}
