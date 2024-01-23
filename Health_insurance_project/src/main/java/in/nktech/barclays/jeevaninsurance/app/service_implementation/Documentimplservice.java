package in.nktech.barclays.jeevaninsurance.app.service_implementation;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.nktech.barclays.jeevaninsurance.app.Health_repository.DocumentRepository;
import in.nktech.barclays.jeevaninsurance.app.Health_repository.UserRegistrationRepository;
import in.nktech.barclays.jeevaninsurance.app.entity.UploaduserDocuments;
import in.nktech.barclays.jeevaninsurance.app.entity.UserRegistration;
import in.nktech.barclays.jeevaninsurance.app.service_interface.DocumentServiceInterface;
@Service
public class Documentimplservice implements DocumentServiceInterface {
@Autowired DocumentRepository documentRepository;
@Autowired UserRegistrationRepository ri;


@Override
    public String verifyDocument(Long id) {
	UploaduserDocuments document = documentRepository.findById(id);

        if (document != null) {
            document.setVerificationStatus(true);
            document.setStatus("verified");
            documentRepository.save(document);
            return "Document verified successfully!";
        } else {
            return "Document not found.";
        }
    }
//@Override
//public String uploadDocuments(MultipartFile panCard, MultipartFile adharCard, MultipartFile photo,boolean verificationStatus ,int id) {
//	try {
//        UploaduserDocuments document = new UploaduserDocuments();
//        document.setPanCard(panCard.getBytes());
//         document.setAdharCard(adharCard.getBytes());
//        document.setPhoto(photo.getBytes());
//        document.setVerificationStatus(false);
//
//        documentRepository.save(document);
//
//        return "Documents uploaded successfully!";
//    } catch (IOException e) {
//        e.printStackTrace();
//        return "Failed to upload documents.";
//    }
//}
//@Override
//public String uploadDocuments(int id, MultipartFile panCard, MultipartFile adharCard, MultipartFile photo,
//		boolean verificationStatus) {
//	try {
//        UploaduserDocuments document = new UploaduserDocuments();
//        document.setPanCard(panCard.getBytes());
//         document.setAdharCard(adharCard.getBytes());
//        document.setPhoto(photo.getBytes());
//        document.setVerificationStatus(false);
//        document.setId(null);
//
//        documentRepository.save(document);
//
//        return "Documents uploaded successfully!";
//    } catch (IOException e) {
//        e.printStackTrace();
//        return "Failed to upload documents.";
//    }
//}
@Override
public void savedocument(UploaduserDocuments ud) {
 long id;
 
	List<UserRegistration> ur=ri.findAll();
	for(UserRegistration user1:ur)
	{   System.out.println(user1.getId());
		if(ud.getId().equals(user1.getId()))
		{
			documentRepository.save(ud);
		}
		else
		{
			System.out.println("user not present for this id");
		}
	}
	
	
}
@Override
public List getalldocument() {
	// TODO Auto-generated method stub
	return documentRepository.findAll();
}
@Override
public UploaduserDocuments getdocbyid(long id) {
	// TODO Auto-generated method stub
	return documentRepository.findById(id);
	
}

}
