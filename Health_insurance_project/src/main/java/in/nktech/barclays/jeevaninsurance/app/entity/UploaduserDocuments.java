package in.nktech.barclays.jeevaninsurance.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UploaduserDocuments {
	@Id

    private Long id;
	@Lob
	@Column(length = 65555)
	
    private byte[] panCard;
	@Lob
	@Column(length = 65555)
	
    private byte[] adharCard;
	@Lob
	@Column(length = 65555)
	
    private byte[] photo;

    private boolean verificationStatus;
    private String status;
	public UploaduserDocuments orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


}
