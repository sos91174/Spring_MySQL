package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.model;

@Repository
public class repository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addStaff(model staffModel){
		System.out.println("EXCUTE INSERT MEMBER");
	  jdbcTemplate.update("INSERT INTO staffInfo(PASSWORD, EMAIL, POSITION, PHONE, CREATE_DATE) "
	  		+ "VALUES (?,?,?,?,NOW())",staffModel.getPassword(), staffModel.getEmail(),
	  		staffModel.getPosition(),staffModel.getPhone());
  }


}