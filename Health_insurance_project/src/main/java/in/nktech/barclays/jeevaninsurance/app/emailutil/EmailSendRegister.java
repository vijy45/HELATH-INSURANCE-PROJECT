package in.nktech.barclays.jeevaninsurance.app.emailutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;

@Component
public class EmailSendRegister {
	
	@Autowired
	JavaMailSender jms;
	
	public void sendmailRegister(UserRegistration ur)
	{
		
		
		SimpleMailMessage m=new SimpleMailMessage();
		
		String d="You register Successfuly click for upload Document ";
		String s= "http://localhost:4200/home/login "+
				"\n"
				+ "Your username :"+ur.getUsername()
				+"\n"
				+"Your Password : "+ ur.getSetpassword();
	
		
		m.setSubject(d);
		m.setText(s);

		m.setFrom(ur.getFormemaill());
		m.setTo(ur.getEmailaddress());
		jms.send(m);
	}

}
