package in.nktech.barclays.jeevaninsurance.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    private Long id;
    private double amount;
    
    private String methodofPayment;
    private Long cardno;
    private String dateofpayment;
    
//    
//    @ManyToOne
//    private UserRegistration user;
//    @ManyToOne
//    private Insuranceplandetails policy;
    // other fields, getters, and setters
}
