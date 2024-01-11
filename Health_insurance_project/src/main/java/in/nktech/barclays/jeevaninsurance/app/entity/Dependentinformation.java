package in.nktech.barclays.jeevaninsurance.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dependentinformation {
	@Id
	private String nameofDependent;
	private String reletionwithdependent;
	private String birthdate;
	private int age;
	

}
