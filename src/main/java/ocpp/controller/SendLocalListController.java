package ocpp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("sendLocalListController")
public class SendLocalListController {

	@RequestMapping(value="/sendLocalList",method=RequestMethod.POST)
	@ResponseBody
	public String sendLocalList(@RequestParam("listVersion") Integer listVersion,
@RequestParam("localAuthorizationList") ArrayList localAuthorizationList,
@RequestParam("updateType") String updateType) {
		return "SendLocalListController";
	}
}
