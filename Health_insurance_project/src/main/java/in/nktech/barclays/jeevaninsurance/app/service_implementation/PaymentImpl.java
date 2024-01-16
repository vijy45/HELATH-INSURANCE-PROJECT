package in.nktech.barclays.jeevaninsurance.app.service_implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nktech.barclays.jeevaninsurance.app.Health_repository.PaymentRepository;
import in.nktech.barclays.jeevaninsurance.app.Health_repository.UserRegistrationRepository;
import in.nktech.barclays.jeevaninsurance.app.entity.Payment;
import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;
import in.nktech.barclays.jeevaninsurance.app.service_interface.Paymentinterface;

@Service
public class PaymentImpl implements Paymentinterface {
	
	@Autowired PaymentRepository pr;
	@Autowired UserRegistrationRepository urr;
	@Override
	public void savepayment(Payment pay) {
		// TODO Auto-generated method stub
		Long useid = null;
		List<UserRegistration> user=urr.findAll();
		
	for(UserRegistration user1:user)
	{
		useid=user1.getId();
	}
		
     if (pay.getId().equals(useid)) {
    	 pr.save(pay);
		
	}
     else {
		System.out.println("id not present");
	}
	
	}
	
	

}
