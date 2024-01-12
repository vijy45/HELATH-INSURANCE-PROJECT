package in.nktech.barclays.jeevaninsurance.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;
import in.nktech.barclays.jeevaninsurance.app.entity.Premimumcalculation;
import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;
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
	
	
	
	//apis for registration
	
	
	@PostMapping("/saveUserdata")
	public ResponseEntity Saveregistrationdata(@RequestBody UserRegistration ur)
	{
		
		hsi.saveRegistrationdata(ur);
		return new ResponseEntity (HttpStatus.CREATED);
		
	}
	@GetMapping("/getuserdata")
	public ResponseEntity<UserRegistration> getuserdata()
	{
		
		List udata=hsi.getUserRegistrationdata();
		return new ResponseEntity(udata,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity deletuserdata(@PathVariable("id") Integer id)
	{
		
		hsi.deleteuserregistrationdata(id);
		return new ResponseEntity (HttpStatus.NO_CONTENT);
	}
	
	
	@GetMapping("/getuserdata/{id}")
	public ResponseEntity<UserRegistration> getuserdata(@PathVariable("id") int id)
	{
		
		UserRegistration udata=hsi.getdatausingid(id);
		System.out.println(udata.getAddress());
		return new ResponseEntity(udata,HttpStatus.OK);
		
	}
	
	
	@PutMapping("/update/{id}")
    public ResponseEntity upatedata(@PathVariable("id") int id, @RequestBody UserRegistration ur)
    {
    	
    	hsi.updateudaat(id,ur);
    	return new ResponseEntity(HttpStatus.OK);
    	
    }
	
	
	@PostMapping("/calculate")
    public ResponseEntity<Double> calculatePremium(@RequestBody Premimumcalculation user) {
        double premium = hsi.calculatePremium(user);
        return ResponseEntity.ok(premium);
    }
}

