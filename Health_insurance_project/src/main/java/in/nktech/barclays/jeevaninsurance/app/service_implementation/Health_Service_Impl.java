package in.nktech.barclays.jeevaninsurance.app.service_implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nktech.barclays.jeevaninsurance.app.Health_repository.Health_repository;
import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;
import in.nktech.barclays.jeevaninsurance.app.service_interface.Health_Service_Interface;
@Service
public class Health_Service_Impl implements Health_Service_Interface {
@Autowired Health_repository hr;

	

	@Override
	public void saveEnquiry(Enquiry_Form e) {
		hr.save(e);
		
	}

}
