package com.example.springJdbcTest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springJdbcTest.Entity.User;
import com.example.springJdbcTest.Repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository ur;
	
	@PostMapping("/save")
	public User addUser(@RequestBody User user) {
		return ur.saveUser(user);
	}
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return ur.updateUser(user);
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return ur.deleteById(id);
	}
	
	@GetMapping("/getById/{id}")
	public User getUser(@PathVariable int id) {
		return ur.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<User> getAll() {
		return ur.getAll();
	}
	
	@GetMapping("/getByName/{name}")
	public User getByName(@PathVariable String name) {
		return ur.getByName(name);
	}
	
}
