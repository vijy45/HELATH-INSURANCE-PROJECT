package com.health.main.entity;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enquiry_Form {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer e_id;
	private String e_name;
	private String e_gender;
	private String e_age;
	private Long e_contactNo;
	private String e_email;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date dt;
//
//	@PrePersist
//	private void onCreate() {
//		dt = new Date();
//	}

}
