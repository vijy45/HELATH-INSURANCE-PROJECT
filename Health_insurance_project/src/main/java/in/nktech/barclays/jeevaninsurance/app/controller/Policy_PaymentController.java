package in.nktech.barclays.jeevaninsurance.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
