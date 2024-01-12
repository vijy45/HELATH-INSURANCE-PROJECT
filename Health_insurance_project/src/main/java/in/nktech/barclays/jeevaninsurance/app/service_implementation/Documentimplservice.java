package in.nktech.barclays.jeevaninsurance.app.service_implementation;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.nktech.barclays.jeevaninsurance.app.Health_repository.DocumentRepository;
import in.nktech.barclays.jeevaninsurance.app.entity.UploaduserDocuments;
import in.nktech.barclays.jeevaninsurance.app.service_interface.DocumentServiceInterface;
@Service
public class Documentimplservice implements DocumentServiceInterface {
@Autowired DocumentRepository documentRepository;


@Override
    public String verifyDocument(Long id) {
	UploaduserDocuments document = documentRepository.findById(id);

        if (document != null) {
            document.setVerificationStatus(true);
            documentRepository.save(document);
            return "Document verified successfully!";
        } else {
            return "Document not found.";
        }
    }
@Override
public String uploadDocuments(MultipartFile panCard, MultipartFile adharCard, MultipartFile photo,boolean verificationStatus) {
	try {
        UploaduserDocuments document = new UploaduserDocuments();
        document.setPanCard(panCard.getBytes());
         document.setAdharCard(adharCard.getBytes());
        document.setPhoto(photo.getBytes());
        document.setVerificationStatus(false);

        documentRepository.save(document);

        return "Documents uploaded successfully!";
    } catch (IOException e) {
        e.printStackTrace();
        return "Failed to upload documents.";
    }
}

}
