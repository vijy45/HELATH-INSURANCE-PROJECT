package in.nktech.barclays.jeevaninsurance.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String setpassword;
	
	private String fullname;
	private String gender;
	private String dateofbirth ;
	private  Long contactno;
	private String address;
	private String pincode;
	private String emailaddress;
	@Transient
	private String formemaill;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employementdetails ed;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Insuranceplandetails ipd;
	@OneToOne(cascade = CascadeType.ALL)
	private Healthinformation hi;
	@OneToOne(cascade = CascadeType.ALL)
	private Dependentinformation depedentinfomation;
	@OneToOne(cascade = CascadeType.ALL)
	private Additionalinformation addi;
    
	
}
