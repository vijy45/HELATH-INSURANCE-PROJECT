package in.nktech.barclays.jeevaninsurance.app.Health_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nktech.barclays.jeevaninsurance.app.entity.UploaduserDocuments;
@Repository
public interface DocumentRepository  extends JpaRepository<UploaduserDocuments, Integer>{

	UploaduserDocuments findById(Long id);

}
