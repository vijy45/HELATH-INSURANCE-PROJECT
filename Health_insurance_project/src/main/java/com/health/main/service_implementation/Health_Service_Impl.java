package com.health.main.service_implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.Health_repository.Health_repository;
import com.health.main.entity.Enquiry_Form;
import com.health.main.service_interface.Health_Service_Interface;
@Service
public class Health_Service_Impl implements Health_Service_Interface {
@Autowired Health_repository hr;

	

	@Override
	public void saveEnquiry(Enquiry_Form e) {
		hr.save(e);
		
	}

}
