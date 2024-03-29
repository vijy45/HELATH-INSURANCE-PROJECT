package in.nktech.barclays.jeevaninsurance.app.service_interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import in.nktech.barclays.jeevaninsurance.app.entity.UploaduserDocuments;
@Repository
public interface DocumentServiceInterface  {

	

	String verifyDocument(Long documentId);

	//String uploadDocuments(int id, MultipartFile panCard, MultipartFile adharCard, MultipartFile photo, boolean verificationStatus);

	void savedocument(UploaduserDocuments ud);

	List getalldocument();

	UploaduserDocuments getdocbyid(long id);

}
