package in.nktech.barclays.jeevaninsurance.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Employementdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empid;
	private String employementstatus;
	private String occupation;
	private String workingAddress;
	
}
