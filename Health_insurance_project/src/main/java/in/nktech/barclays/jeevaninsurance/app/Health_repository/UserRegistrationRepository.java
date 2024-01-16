package in.nktech.barclays.jeevaninsurance.app.Health_repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;
@Repository
public interface UserRegistrationRepository  extends JpaRepository<UserRegistration,Integer> {

	
    UserRegistration findByUsernameAndSetpassword(String username, String setpassword);


	

}
