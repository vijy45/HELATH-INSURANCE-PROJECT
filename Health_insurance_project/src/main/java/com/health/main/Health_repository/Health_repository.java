package com.health.main.Health_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.health.main.entity.Enquiry_Form;
@Repository
public interface Health_repository extends JpaRepository<Enquiry_Form, Integer> {

}
