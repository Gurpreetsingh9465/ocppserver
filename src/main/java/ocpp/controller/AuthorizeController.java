package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("authorizeController")
public class AuthorizeController {

	@RequestMapping(value="/authorize",method=RequestMethod.POST)
	@ResponseBody
	public String authorize(@RequestParam("idTag") String idTag) {
		return "AuthorizeController";
	}
}
