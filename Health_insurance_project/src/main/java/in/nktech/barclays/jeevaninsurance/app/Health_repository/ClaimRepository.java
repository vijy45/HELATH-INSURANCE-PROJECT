package in.nktech.barclays.jeevaninsurance.app.Health_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nktech.barclays.jeevaninsurance.app.entity.Claimclass;
import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;
@Repository
public interface ClaimRepository extends JpaRepository<Claimclass, Integer> {
	
	// List<Claimclass> findByUser(UserRegistration user);

}
