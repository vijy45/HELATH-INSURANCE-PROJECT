package in.nktech.barclays.jeevaninsurance.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;
import in.nktech.barclays.jeevaninsurance.app.service_interface.Health_Service_Interface;

@RestController
@RequestMapping("/health")
public class HealthController {
	@Autowired
	Health_Service_Interface hsi;
	
	@PostMapping("/saveE")
	public ResponseEntity saveEnqiry( @RequestBody Enquiry_Form e)
	{
		hsi.saveEnquiry(e);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	


}
