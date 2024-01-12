package in.nktech.barclays.jeevaninsurance.app.controller;



import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.fasterxml.jackson.databind.ObjectMapper;

import in.nktech.barclays.jeevaninsurance.app.entity.UploaduserDocuments;
import in.nktech.barclays.jeevaninsurance.app.service_interface.DocumentServiceInterface;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class Documentcontroller {

//	@PostMapping("/fileupload")
//	
//	public List<Data> savedata(@RequestPart(value = "photo" ,required = true) MultipartFile file,
//			@RequestPart(value = "pancard") MultipartFile file1,
//			@RequestParam int cusid,@RequestParam int docid) throws IOException
//	
//	{
//		Data d=new Data();
//		System.out.println(file.getBytes());
////		System.out.println(d.getPhoto(file.getBytes()));
//		
//		return null;
//	}
	
	@Autowired
	DocumentServiceInterface documentService;
	
	
	 @PostMapping("/upload")
	    public String handleFileUpload(@RequestParam("panCard") MultipartFile panCard,
	                                   @RequestParam("adharCard") MultipartFile adharCard,
	                                   @RequestParam("photo") MultipartFile photo,@RequestParam boolean verificationStatus) {
	       log.info("in handle file upload method start");
		   log.debug("verificationStatus",10);
	       log.error("hi");
		 return documentService.uploadDocuments(panCard, adharCard, photo,verificationStatus);
	    }

	    @GetMapping("/verify/{id}")
	    public String verifyDocument(@PathVariable("id") Long id) {
	        return documentService.verifyDocument(id);
	    }
}
