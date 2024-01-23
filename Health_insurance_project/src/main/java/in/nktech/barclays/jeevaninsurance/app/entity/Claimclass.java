package in.nktech.barclays.jeevaninsurance.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Claimclass {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claimId;
    private Double claimAmount;
    private LocalDate claimDate;
    
   // @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserRegistration user;

}
