package com.example.springJdbcApp.repository;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@Autowired
	JdbcTemplate jt;
	

	public List<String> getAllUserNames() {
		
		List<String> userNameList = new ArrayList<>();
		
		userNameList.addAll(jt.queryForList("select name from users;", String.class));
		
		return userNameList;
	}

}
