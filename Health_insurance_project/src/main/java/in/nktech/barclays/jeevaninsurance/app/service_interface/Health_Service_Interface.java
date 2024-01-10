package in.nktech.barclays.jeevaninsurance.app.service_interface;

import java.util.List;

import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;

public interface Health_Service_Interface {

	void saveEnquiry(Enquiry_Form e);

	void sendmail(Enquiry_Form e);

	List getenquiry();

}
