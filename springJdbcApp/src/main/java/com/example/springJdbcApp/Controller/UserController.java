package com.example.springJdbcApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springJdbcApp.repository.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	UserRepository ur;
	
	@GetMapping
	public String check() {
		return "Success";
	}
	
	@GetMapping(path="/getallusername")
	public List<String> getAllUserNames() {
		return ur.getAllUserNames();
	}
}
