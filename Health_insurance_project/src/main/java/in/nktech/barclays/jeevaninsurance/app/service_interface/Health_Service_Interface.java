package in.nktech.barclays.jeevaninsurance.app.service_interface;

import java.util.List;

import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;
import in.nktech.barclays.jeevaninsurance.app.entity.Premimumcalculation;
import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;

public interface Health_Service_Interface {

	void saveEnquiry(Enquiry_Form e);

	void sendmail(Enquiry_Form e);

	List getenquiry();

	void saveRegistrationdata(UserRegistration ur);

	List getUserRegistrationdata();

	void deleteuserregistrationdata(int id);

	UserRegistration findbyid(int id);

	UserRegistration getdatausingid(int id);

	double calculatePremium(Premimumcalculation user);

	void updateudaat(int id, UserRegistration ur);

	UserRegistration getdatausingusernameandpassword(String username, String setpassword);

	//UserRegistration getdatausingusernameandpassword(String username, String setpassword);

	

}
