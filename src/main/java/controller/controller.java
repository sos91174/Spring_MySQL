package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.model;
import service.service;

@RestController
public class controller {
	
		@Autowired
		model staffModel;
		
		@Autowired
		service staffService;
	    @RequestMapping("/addStaff")
	    public String hello(){
	    	staffModel = new model();
	    	staffModel.setPassword("123456");
	    	staffModel.setEmail("123@email.com");
	    	staffModel.setPhone("0123456789");
	    	staffModel.setPosition("Manager");
	    	staffService.addStaff(staffModel);
	        return "New Staff join";
	    }


}
