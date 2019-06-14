package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController("dataTransferController")
public class DataTransferController {

	@RequestMapping(value="/dataTransfer",method=RequestMethod.POST)
	@ResponseBody
	public String dataTransfer(@RequestParam("vendorId") String vendorId,
@RequestParam("messageId") String messageId,
@RequestParam("data") String data) {
		return "DataTransferController";
	}
}
