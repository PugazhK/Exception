package com.example.springJdbcTest.ImUserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springJdbcTest.Entity.User;
import com.example.springJdbcTest.Repository.UserRepository;

@Repository
public class ImpleUserRepository implements UserRepository {
	
	String INSERT_USER = "INSERT INTO USERS (id,name,age) values (?,?,?)";
	String UPDATE_USER_BY_ID = "UPDATE USERS SET name = ?, age= ? WHERE ID = ?";
	String GET_USER_BY_ID = "SELECT * FROM USERS WHERE ID = ?";
	String DELETE_USER_BY_ID = "DELETE FROM USERS WHERE ID = ?";
	String GET_ALL_USER = "SELECT * FROM USERS";
	String GET_USER_BY_Name = "select * from users where name like ? ";
	
	@Autowired
	public JdbcTemplate jt;
	
	
	@Override
	public User saveUser(User user) {
		jt.update(INSERT_USER,user.getId(),user.getName(),user.getAge());
		return user;
	}

	@Override
	public User updateUser(User user) {
		jt.update(UPDATE_USER_BY_ID, user.getName(), user.getAge(), user.getId() );
		return user;
	}

	@Override
	public User getById(int id) {
		return jt.queryForObject(GET_USER_BY_ID, (rs, rowNum) -> {
			return new User(rs.getInt("id"),rs.getString("name"), rs.getInt("age"));
		},id);
	}

	@Override
	public String deleteById(int id) {
		jt.update(DELETE_USER_BY_ID,id);
		return "User got deleted with id " + id;
	}

	@Override
	public List<User> getAll() {
		return jt.query(GET_ALL_USER, (rs, rowNum) -> {
			return new User(rs.getInt("id"),rs.getString("name"), rs.getInt("age"));
		});
	}

	@Override
	public User getByName(String name) {
		
		return jt.queryForObject(GET_USER_BY_Name, (rs, rowNum) -> {
			return new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"));
		},name);
	}
	
	

}
