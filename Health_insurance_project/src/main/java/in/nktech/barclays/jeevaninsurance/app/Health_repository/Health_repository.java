package in.nktech.barclays.jeevaninsurance.app.Health_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nktech.barclays.jeevaninsurance.app.entity.Enquiry_Form;
@Repository
public interface Health_repository extends JpaRepository<Enquiry_Form, Integer> {

}
