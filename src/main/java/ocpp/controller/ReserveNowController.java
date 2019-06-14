package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("reserveNowController")
public class ReserveNowController {

	@RequestMapping(value="/reserveNow",method=RequestMethod.POST)
	@ResponseBody
	public String reserveNow(@RequestParam("connectorId") Integer connectorId,
@RequestParam("expiryDate") String expiryDate,
@RequestParam("idTag") String idTag,
@RequestParam("parentIdTag") String parentIdTag,
@RequestParam("reservationId") Integer reservationId) {
		return "ReserveNowController";
	}
}
