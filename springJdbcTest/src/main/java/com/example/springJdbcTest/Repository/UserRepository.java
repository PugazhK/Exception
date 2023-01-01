package com.example.springJdbcTest.Repository;

import java.util.List;

import com.example.springJdbcTest.Entity.User;

public interface UserRepository {
	public User saveUser(User user);
	public User updateUser(User user);
	public User getById(int id);
	public String deleteById (int id);
	public List<User> getAll();
	public User getByName(String name);
}
