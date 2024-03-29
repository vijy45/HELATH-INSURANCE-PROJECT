package in.nktech.barclays.jeevaninsurance.app.service_implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import in.nktech.barclays.jeevaninsurance.app.Health_repository.Health_repository;
import in.nktech.barclays.jeevaninsurance.app.Health_repository.UserRegistrationRepository;
import in.nktech.barclays.jeevaninsurance.app.emailutil.EmailSendRegister;
import in.nktech.barclays.jeevaninsurance.app.emailutil.Emailsenderutil;
import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;
import in.nktech.barclays.jeevaninsurance.app.entity.Premimumcalculation;
import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;
import in.nktech.barclays.jeevaninsurance.app.service_interface.Health_Service_Interface;
@Service
public class Health_Service_Impl implements Health_Service_Interface {
@Autowired Health_repository hr;
@Autowired Emailsenderutil eu;
@Autowired UserRegistrationRepository urr;

@Autowired
EmailSendRegister esr;
	

	@Override
	public void saveEnquiry(Enquiry_Form e) {
		hr.save(e);
		
	}



	@Override
	public void sendmail(Enquiry_Form e) {
		
		eu.sendmail(e);
	}



	@Override
	public List getenquiry() {
		return hr.findAll();
	}



	@Override
	public void saveRegistrationdata(UserRegistration ur) {
		urr.save(ur);
		
	}



	@Override
	public List getUserRegistrationdata() {
		return urr.findAll();
	
	}



	@Override
	public void deleteuserregistrationdata(int id) {
		urr.deleteById(id);
		
	}



	@Override
	public UserRegistration findbyid(int id) {
	return urr.getById(id);
	
	}



	@Override
	public UserRegistration getdatausingid(int id) {
		// TODO Auto-generated method stub
	UserRegistration u= urr.findById(id).get();
	System.out.println(u.getId());
	return u;
	}
//	@Override
//	public UserRegistration getdatausingusernameandpassword(String username, String setpassword) {
//		// TODO Auto-generated method stub
//		//return urr.findByUsernameAndSetpassword(username,setpassword);
//	}

	
	
	@Override
	public double calculatePremium(Premimumcalculation user) {
        double basePremium = 10000; 

        
        if (user.getAge() > 50) {
            basePremium += 500000.0;
        }

                if (user.getGender().equalsIgnoreCase("male")) {
            basePremium += 20.0;
        }

                if (user.getCoverageType().equalsIgnoreCase("comprehensive")) {
            basePremium += 30.0;
        } else if (user.getCoverageType().equalsIgnoreCase("basic")) {
            basePremium += 10.0;
        }

        return basePremium;
    }



	@Override
	public void updateudaat(int id, UserRegistration ur) {
      Optional<UserRegistration> us=urr.findById(id);
      if (us.isPresent()) {
    	  urr.save(ur);
		
	}else 
      {
		System.out.println("id not found");
    	  
      }
	}



	@Override
	public UserRegistration getdatausingusernameandpassword(String username, String setpassword) {
		// TODO Auto-generated method stub
		return urr.findByUsernameAndSetpassword(username, setpassword);
	}



	@Override
	public void sendmail(UserRegistration ur) {
		
		esr.sendmailRegister(ur);
		
	}



	


	
}


