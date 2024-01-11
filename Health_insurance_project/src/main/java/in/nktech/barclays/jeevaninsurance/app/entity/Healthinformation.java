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
public class Healthinformation {
	@Id
	private String primarycarePhysician;
	private String preExistingmedicalCondition;
	private String currentMedication;
	

}
