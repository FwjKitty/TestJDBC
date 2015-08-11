package com.hand.TestJDBC.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.TestJDBC.dao.UserDao;
import com.hand.TestJDBC.entity.User;

public class UserDaoImpl implements UserDao{

	public void save(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO user(un,pw,create_date) VALUES(?,?,?)");
		ps.setString(1, user.getUn());
		ps.setString(2, user.getPw());
		ps.setDate(3, user.getCreate_date());
		ps.execute();
	}

	public void update(Connection conn, int id, User user) throws SQLException {
		String updateSql = "UPDATE user SET un=?,pw=?,create_date=? WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		ps.setString(1, user.getUn());
		ps.setString(2, user.getPw());
		ps.setDate(3, user.getCreate_date());
		ps.setInt(4, id);
		ps.execute();
	}

	public void delete(Connection conn, int id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("DELETE FROM user WHERE id=?");
		ps.setInt(1, id);
		ps.execute();
	}

	public List<User> queryById(Connection conn, int id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List<User> list = new ArrayList<User>();
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt(0));
			user.setUn(rs.getString(1));
			user.setPw(rs.getString(2));
			user.setCreate_date(rs.getDate(3));
			list.add(user);
		}
		return list;
	}

	public User get(Connection conn, int id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		User user = null;
		while(rs.next()){
			user = new User();
			user.setId(rs.getInt(0));
			user.setUn(rs.getString(1));
			user.setPw(rs.getString(2));
			user.setCreate_date(rs.getDate(3));
		}
		return user;
	}

}
