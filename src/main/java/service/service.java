package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.model;
import repository.repository;

@Service
public class service {
	
	@Autowired
	repository staffRepository;
	public void addStaff(model staffModel){
		staffRepository.addStaff(staffModel);
	}

}