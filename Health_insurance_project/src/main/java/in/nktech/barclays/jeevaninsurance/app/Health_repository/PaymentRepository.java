package in.nktech.barclays.jeevaninsurance.app.Health_repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nktech.barclays.jeevaninsurance.app.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
     Payment getById(Long id);
}
