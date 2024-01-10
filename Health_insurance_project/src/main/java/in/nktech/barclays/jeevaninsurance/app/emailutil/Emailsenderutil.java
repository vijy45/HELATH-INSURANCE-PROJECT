package in.nktech.barclays.jeevaninsurance.app.emailutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;

@Component
public class Emailsenderutil {
	
	@Autowired
	JavaMailSender jm;
	public void sendmail(Enquiry_Form e)
	{ 
		
		SimpleMailMessage m=new SimpleMailMessage();
		String s= "Dear customer, I hope this letter finds you well. I am writing to provide an explanation for the late submission of the required insurance documents for my policy";
		String d="thank you for enquireing our insurance policy";
		m.setFrom(e.getFormaemail());
		m.setTo(e.getE_email());
		m.setSubject(d);
		m.setText(s);
		jm.send(m);
		}

}
