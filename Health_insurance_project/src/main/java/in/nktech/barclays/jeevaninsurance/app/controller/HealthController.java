package in.nktech.barclays.jeevaninsurance.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@Value
	("{$spring.mail.username}")
	String formemail;
	
	
	
	@PostMapping("/saveE")
	public ResponseEntity saveEnqiry( @RequestBody Enquiry_Form e)
	{
		hsi.saveEnquiry(e);
		
		e.setFormaemail(formemail);
		hsi.sendmail(e);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("/getEdata")
	public ResponseEntity<Enquiry_Form> get()
	{
		List edata=hsi.getenquiry();
		return new ResponseEntity(edata,HttpStatus.OK);
	}
	


}
