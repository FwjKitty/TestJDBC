package com.hand.TestJDBC.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.hand.TestJDBC.entity.User;

public interface UserDao {
	public void save(Connection conn, User user) throws SQLException;
	
	public void update(Connection conn, int id, User user) throws SQLException;
	
	public void delete(Connection conn, int id) throws SQLException;
	
	public List<User> queryById(Connection conn, int id) throws SQLException;
	
	public User get(Connection conn, int id) throws SQLException;
}