package ocpp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("cancelReservationController")
public class CancelReservationController {

	@RequestMapping(value="/cancelReservation",method=RequestMethod.POST)
	@ResponseBody
	public String cancelReservation(@RequestParam("reservationId") Integer reservationId) {
		return "CancelReservationController";
	}
}
