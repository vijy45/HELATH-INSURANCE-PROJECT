package in.nktech.barclays.jeevaninsurance.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nktech.barclays.jeevaninsurance.app.entity.Payment;
import in.nktech.barclays.jeevaninsurance.app.service_interface.Paymentinterface;
@CrossOrigin("*")
@RestController
public class Policy_PaymentController {
@Autowired Paymentinterface pi;

	@PostMapping("/savepayment")
	public ResponseEntity makepayment(@RequestBody Payment pay)
	{
		
		pi.savepayment(pay);
		return null;
		
	}
	@GetMapping("/getpay/{id}")
	public ResponseEntity<Payment> getpaymentdetailsbyid(@PathVariable Long id)
	{  
		Payment pay=pi.getpaybyid(id);
		return new ResponseEntity<Payment>(pay,HttpStatus.OK);
	}
}
