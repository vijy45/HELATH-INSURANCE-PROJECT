package in.nktech.barclays.jeevaninsurance.app.controller;



import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
@CrossOrigin("*")
@Slf4j
@RestController
public class Documentcontroller {


	
	@Autowired
	DocumentServiceInterface documentService;
	
	

	 
	 @PostMapping("/ud")
	 public String handleFileUpload(@RequestParam("panCard") MultipartFile panCard,
             @RequestParam("adharCard") MultipartFile adharCard,
             @RequestParam("photo") MultipartFile photo,
             @RequestParam String id
             ) throws IOException
	 {
		 ObjectMapper o=new ObjectMapper();
		 UploaduserDocuments ud=o.readValue(id, UploaduserDocuments.class);
		 ud.setPanCard(panCard.getBytes());
		 ud.setAdharCard(adharCard.getBytes());
		 ud.setPhoto(photo.getBytes());
		 ud.setStatus("pending");
		 documentService.savedocument(ud);
		 
		 
		return null;
		 
	 }

	    @GetMapping("/verify/{id}")
	    public String verifyDocument(@PathVariable("id") Long id) {
	        return documentService.verifyDocument(id);
	    }
	    @GetMapping("/alldocument")
	    public ResponseEntity<UploaduserDocuments> getalldocument()
	    {
	    	List ud =documentService.getalldocument();
	    	return new ResponseEntity(ud,HttpStatus.OK);
	    }
	    @GetMapping("get/{id}")
	    public ResponseEntity<UploaduserDocuments> getdocumentbyid(@PathVariable long id)
	    {
	    	UploaduserDocuments uud=documentService.getdocbyid(id);	
	    	return new ResponseEntity<UploaduserDocuments>(uud,HttpStatus.OK); 
	    }
}
